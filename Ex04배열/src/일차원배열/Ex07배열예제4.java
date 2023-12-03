package 일차원배열;

import java.util.Scanner;

public class Ex07배열예제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] star = new int[5];
		for(int i = 0; i < star.length; i++) {
			System.out.print((i+1) + "번째 별의 개수를 입력하세요 >> ");
			// 배열[i] = 입력한 숫자
			star[i] = sc.nextInt();
		}
		// 배열에 저장되어 있는 별의 개수를 꺼내와서 별을 출력
//		System.out.print(star[0~4] + " : ");
		
//		System.out.print("*");  --> 이게 star[0~4]만큼 반복
//		예) for(int i = 0; i < star[0~4]; i++) {
//			  System.out.println("*");
//		   }
		
		for(int i = 0; i < star.length; i++) {
			System.out.print(star[i] + " : ");
			for(int j = 0; j < star[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		sc.close();

	}

}
