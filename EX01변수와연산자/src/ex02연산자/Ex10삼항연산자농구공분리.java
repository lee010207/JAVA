package ex02연산자;

import java.util.Scanner;

public class Ex10삼항연산자농구공분리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("농구공의 개수를 입력하세요 : ");
		int ball = sc.nextInt();
		int box = ball / 5;
		int result = ball % 5 == 0 ?        // 나머지가 발생했는지 안했는지만 판별해주면 돼
				 box : box + 1 ;
		
		// int result = ball % 5 != 0 ? ball / 5 + 1 : ball / 5 ;
		System.out.println("필요한 상자의 수 : " + result);
		
		sc.close();
	}

}
