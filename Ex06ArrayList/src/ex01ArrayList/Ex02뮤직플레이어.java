package ex01ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02뮤직플레이어 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 노래 리스트가 저장될 ArrayList 만들기
		// "가수이름 - 노래제목" : String
		ArrayList<String> musicList = new ArrayList<>();
				
		// 입력도구 Scanner 가져오기
		Scanner sc = new Scanner(System.in);
		
		// 사용자에게 보여질 화면 구현!
		System.out.println("<<<<<<< MusicPlayer >>>>>>>");
		System.out.println();
		
		while(true) {
			System.out.print("[1]노래조회 [2]노래추가 [3]노래삭제 [4]종료 >> ");
			// 숫자 입력받기 : select
			int select = sc.nextInt();
			// select가 어떤 숫자인지 판단
			// 단, 1~4가 아닌 다른 숫자를 입력하면 "잘못입력했습니다."
			// 4를 입력하면 프로그램 종료
			if(select == 1) {
				if(musicList.size() == 0) {
					System.out.println("========현재 재생목록========");
					System.out.println("재생목록에 노래가 없어요ㅠ");
					System.out.println("=========================");
				}else {
					System.out.println("========현재 재생목록========");
					for(int i = 0; i < musicList.size(); i++) {
						System.out.println((i+1) + ". " + musicList.get(i));
					}
					System.out.println("=========================");
				}
			}else if(select == 2) {
				if(musicList.size() == 0) {
					System.out.println("========현재 재생목록========");
					System.out.println("재생목록에 노래가 없어요ㅠ");
					System.out.println("=========================");
				}else {
					System.out.println("========현재 재생목록========");
					for(int i = 0; i < musicList.size(); i++) {
						System.out.println((i+1) + ". " + musicList.get(i));
					}
					System.out.println("=========================");
				}
				System.out.print("[1]마지막 위치에 추가 [2]원하는 위치에 추가 >> ");
				int select2 = sc.nextInt();
				if(select2 == 1) {
					System.out.print("추가할 노래 : ");
					musicList.add(sc.next());
				}else if(select2 == 2) {
					System.out.print("추가할 위치 : ");
					int index = sc.nextInt();
					System.out.print("추가할 노래 : ");
					String song = sc.next();
					musicList.add(index-1, song);
					System.out.println("추가 완료!");
				}else {
					System.out.println("잘못입력하셨습니다.");
				}
			}else if(select == 3) {
				if(musicList.size() == 0) {
					System.out.println("========현재 재생목록========");
					System.out.println("재생목록에 노래가 없어요ㅠ");
					System.out.println("=========================");
				}else {
					System.out.println("========현재 재생목록========");
					for(int i = 0; i < musicList.size(); i++) {
						System.out.println((i+1) + ". " + musicList.get(i));
					}
					System.out.println("=========================");
				}
				System.out.print("[1]선택삭제 [2]전체삭제 >> ");
				int select3 = sc.nextInt();
				if(select3 == 1) {
					System.out.print("삭제할 노래 위치 : ");
					int Dindex = sc.nextInt();
					musicList.remove(Dindex-1);
					System.out.println("삭제 완료!");
				}else {
					musicList.clear();
					System.out.println("전체 삭제 완료!");
				}
				
			}else if(select == 4) {
				System.out.println("프로그램 종료^^");
				break;   // while문을 빠져나가라
				// 가장 근접한 반복문을 빠져나가는 키워드
			}else {
				System.out.println("잘못 입력 다시 입력");
			}
			
		}
	}

}
