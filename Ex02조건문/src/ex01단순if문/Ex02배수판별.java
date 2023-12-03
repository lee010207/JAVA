package ex01단순if문;

import java.util.Scanner;

public class Ex02배수판별 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수를 입력받아 3의 배수인지 5의 배수인지 판별하는 알고리즘을 작성
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		
		int num = sc.nextInt();
		if (num % 5 != 0 && num % 3 == 0) {
			System.out.println("3의 배수입니다.");
		}
		if (num % 5 == 0 && num % 3 != 0) {
			System.out.println("5의 배수입니다.");
		}
		if (num % 5 == 0 && num % 3 == 0) {
			System.out.println("3의 배수이면서 5의 배수입니다.");
		}
		// if (num % 15 == 0) {
		// System.out.println("3의 배수이면서 5의 배수입니다.");
		// }
		
		// if (num % 3 == 0) {
		//		if(num % 5 == 0 {
		//		   System.out.println("3의 배수이면서 5의 배수입니다.");
		//      }
		// }
		sc.close();
	}

}
