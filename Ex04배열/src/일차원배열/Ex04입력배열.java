package 일차원배열;

import java.util.Scanner;

public class Ex04입력배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int [] num = new int[6];
		
//		System.out.println("1번 숫자 : ");
//		num[0] = sc.nextInt();
//		
//		System.out.println("2번 숫자 : ");
//		num[1] = sc.nextInt();
//		
//		System.out.println("3번 숫자 : ");
//		num[2] = sc.nextInt();
//		
//		System.out.println("4번 숫자 : ");
//		num[3] = sc.nextInt();
//		
//		System.out.println("5번 숫자 : ");
//		num[4] = sc.nextInt();
//		
//		System.out.println("6번 숫자 : ");
//		num[5] = sc.nextInt();
		
		for(int i = 0; i < num.length; i++) {
			System.out.print((i+1) + "번 숫자 : ");
			num[i] = sc.nextInt();
		}
		
		// 전체 배열 값 출력
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		sc.close();
	}

}
