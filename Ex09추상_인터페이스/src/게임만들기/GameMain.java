package 게임만들기;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// 개발자 1
		PlusGame g1 = new PlusGame();
		SubGame g2 = new SubGame();
		
		// 개발자 2 완성한 파일을 PlusGame을 받으면 위 코드를
		// PlusGame game = new PlusGame();
		// 이렇게 바꿔주면 됨
		int temp = 5; 
		int life = 3;
		System.out.println("+++++++ 더하기 빼기 -------");
		
		while(true) {
			System.out.println(g2.getQuizMsg());
			System.out.print("답을 입력하세요 >> ");
			int answer = sc.nextInt();
			temp --;
			
			if(g2.checkAnswer(answer)) {
				System.out.println("정답입니다.");
			}else {
				while(life > 1) {
					if(g2.checkAnswer(answer)) {
						System.out.println("정답입니다");
						System.out.println();
						break;
					}else{
						life--;
						System.out.println("틀렸습니다!");
						System.out.println( life + "번 남았습니다");
						System.out.print("답을 다시 입력하세요 >> ");
						answer = sc.nextInt();
					}
				}
				System.out.println("다음 문제!");
				System.out.println();
			}

			life = 3;
			
			if(temp == 0) {
				System.out.println("게임 끝!");
				break;
			}
		}
		
	}

}
