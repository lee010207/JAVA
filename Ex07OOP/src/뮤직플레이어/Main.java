package 뮤직플레이어;

import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		// 1)가수명(String) 2)노래제목(String) 3)출시년도(int) 4)시간(int)
		
		// 1. 재생
		// 노래 실행해주는 객체 player(.jar : 배포용 자바파일) 불러와서 쓰기
		MP3Player mp3 = new MP3Player();
		
		// 노래 실행해주는 메서드 사용해서 노래 재생시키기
//		mp3.play("C:\\Users\\gjaischool1\\Desktop\\mp3\\뉴진스-HypeBoy.mp3");
//		mp3.play("C:\\Users\\gjaischool1\\Desktop\\mp3\\르세라핌-Antifragile.mp3");
		
		
		// 4가지 데이터를 하나에 담을 수 있는 Music 클래스를 이용해서 Music 객체를 만들어 Music 데이터타입을 만들어줌
		// --> 노래경로 넣어주는 5가지 매개변수를 가진 Music 객체로 다시 만들어줌
		Music m1 = new Music("뉴진스", "Hype Boy", 2023, 90,"C:\\Users\\gjaischool1\\Desktop\\mp3\\뉴진스-HypeBoy.mp3");
		Music m2 = new Music("윤하", "사건의 지평선", 2022, 150,"C:\\Users\\gjaischool1\\Desktop\\mp3\\윤하-사건의지평선.mp3");
		Music m3 = new Music("르세라핌", "Antifragile", 2022, 70,"C:\\Users\\gjaischool1\\Desktop\\mp3\\르세라핌-Antifragile.mp3");
		Music m4 = new Music("아이브", "Love Dive", 2023, 116,"C:\\Users\\gjaischool1\\Desktop\\mp3\\아이브-LoveDive.mp3");
		Music m5 = new Music("카라", "When I move", 2002, 81,"C:\\Users\\gjaischool1\\Desktop\\mp3\\카라-WhenIMove.mp3");
		
//		Music m6 = new Music("세븐틴", "손오공", 2023, 123);
//		Music m7 = new Music("에스파", "Next Level", 2021, 111);
				
		ArrayList<Music> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		list.add(m5);
		
//		list.add(m6);
//		list.add(m7);
		
		
		
		/*
		Music m1 = new Music();
		m1.setSinger("아이들");
		m1.setTitle("퀸카");
		m1.setYear(2023);
		m1.setTime(90);
		
		System.out.println(m1.getSinger());
		System.out.println(m1.getTitle());
		System.out.println(m1.getYear());
		System.out.println(m1.getTime());
		// 필드가 보호되고 있어서 바로 가져오고 getter 사용해서 메서드를 통해 우회해서 가져올 수 있음
		*/
		int point = 0;
		// 4. 현재 몇번째 노래가 실행되고 있는지 위치를 알고 있는 변수가 필요
		// 반복문 안에 있으면 계속 0으로 초기화됨
		
		while(true) {
			System.out.print("[1]재생 [2]정지 [3]이전곡 [4]다음곡 [5]목록 [6]종료 >> ");
			int menu = sc.nextInt();
			
			if(menu ==1) {
				// mp3가 현재 실행되고 있는지 아닌지 알려주는 메서드
				// 노래가 실행되고 있으면 멈추고 새로 재생
				if(mp3.isPlaying()) {
					mp3.stop();
				}	
				mp3.play(list.get(point).getPath());
				
				System.out.println("======== 재 생 ========");
				System.out.print(point+1 + ". ");
				System.out.print(list.get(point).getSinger() + " - ");
				System.out.print(list.get(point).getTitle());
				System.out.println("(" + list.get(point).getTime()+ "초)");
				
			}else if(menu == 2){
				System.out.println("======== 정 지 ========");
				
				if(mp3.isPlaying()) {
					mp3.stop();
				}	
				
				System.out.print(point+1 + ". ");
				System.out.print(list.get(point).getSinger() + " - ");
				System.out.print(list.get(point).getTitle());
				System.out.println("(" + list.get(point).getTime()+ "초)");
			}else if(menu == 3) {
				System.out.println("======== 이 전 곡 ========");
				if(point > 0) {
					point--;
					System.out.print(point+1 + ". ");
					System.out.print(list.get(point).getSinger() + " - ");
					System.out.print(list.get(point).getTitle());
					System.out.println("(" + list.get(point).getTime()+ "초)");
					if(mp3.isPlaying()) {
						mp3.stop();
					}	
					mp3.play(list.get(point).getPath());
				}else {
					System.out.println("노래가 없어요~~");
				}


			}else if(menu == 4) {
				System.out.println("======== 다 음 곡 ========");
				if(point < list.size() - 1) {
					// 목록에 들어있는 노래가 8개면 인덱스는 7까지니까 6일때까지만 7로 증가할 수 있어
					point++;      // 다음곡 누르면 배열 인덱스값이 증가하면 되니까
				}else {
					point = 0;      // 배열이 끝나면 앞으로 돌아가게 만들어봄
				}
				if(mp3.isPlaying()) {
					mp3.stop();
				}	
				mp3.play(list.get(point).getPath());
				System.out.print(point+1 + ". ");
				System.out.print(list.get(point).getSinger() + " - ");
				System.out.print(list.get(point).getTitle());
				System.out.println("(" + list.get(point).getTime()+ "초)");
				
			}else if(menu == 5) {
				System.out.println("======== 목    록 ========");
				for(int i=0; i < list.size(); i++) {
					System.out.println((i+1) + ". " + list.get(i).getSinger()+ " - " + list.get(i).getTitle() 
							+ "(" + list.get(i).getTime() + "초)");
				}
				System.out.println();
			}else if(menu == 6) {
				if(mp3.isPlaying()) {
					mp3.stop();
				}	
				System.out.println("프로그램을 종료합니다 ");
				break;
			}
			
		}
	}

}
