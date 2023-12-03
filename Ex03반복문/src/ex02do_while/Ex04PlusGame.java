package ex02do_while;

import java.util.Random;
import java.util.Scanner;

public class Ex04PlusGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// 난수를 뽑는 방법
		Random rd = new Random();           // ctrl + space 자동완성 사용해서 import까지 한번에
		
		System.out.println("=====PLUS GAME====");
		
		// 틀렸을 때는 기존 문제를
		// 성공했을 때는 새로운 문제를 출력   :   난수 뽑아주는 변수가 while문 밖에 있으면(반복X) 같은 문제 계속 나와
		
		// 목숨 3개
		// 문제의 답을 틀렸을 때는 목숨을 하나씩 차감하고 정답을 알려줌 : 남은목숨 2개
		// 목숨을 다쓰면 게임종료
		
		// 게임 종료 시 최종 정답 개수 출력 : "00개 정답!"
		

		int num1 = rd.nextInt(10)+ 1;      // 1 ~ 10
		int num2 = rd.nextInt(10)+ 1;      // 1 ~ 10
		// int num1 = rd.nextInt(); -> int형 범위 내에서 랜덤 추출
		// int num1 = rd.nextInt(100); -> 0 ~ 99
		int life = 3;
		int cnt = 0;
		
		while(life > 0) {
			System.out.print(num1 + "+" + num2 + "=");
			int inputNum = sc.nextInt();               // 정답을 계속 입력 받을 거니까 while 안에 넣어줌
			
			// 정답확인
			int answer = num1 + num2;
			if (inputNum == answer) {
				System.out.println("정답!");
				num1 = rd.nextInt(10)+ 1;      // 난수 다시 새로 뽑아줌
				num2 = rd.nextInt(10)+ 1; 
				cnt++;                          // 정답일때만 cnt를 하나씩 더해주니까 여기에 써줌
			}else{
				System.out.println("틀렸어~~~~~");
				life--;                             // 틀렸을 때 life 하나씩 빼주니까 여기에, 빼주고 출력
				System.out.println("남은목숨 : "+ life + "개");
			}
		}
		System.out.println("=====GAME OVER=====");
		System.out.println(cnt + "개 정답!!");
		sc.close();
			
//			int answer = num1 + num2;
//			if (inputNum == answer) {
//				System.out.println("정답!");
//				num1 = rd.nextInt(10)+ 1;      // 난수 다시 새로 뽑아줌
//				num2 = rd.nextInt(10)+ 1; 
//			}else if(life <= 3){
//				System.out.println("틀렸어~~~~~");
//				System.out.println("남은목숨 : "+ (life-1) + "개");
//				life--;
//			}if(life == 0) {
//				System.out.println("=====GAME OVER=====");
//				break;
//			}
		
	}

}
