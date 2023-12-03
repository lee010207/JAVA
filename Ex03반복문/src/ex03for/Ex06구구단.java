package ex03for;

import java.util.Scanner;

public class Ex06구구단 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("수 입력하세요 -> ");
//		int num = sc.nextInt();
//		
//		System.out.print("몇까지 곱할까요? -> ");
//		int range = sc.nextInt();
//		
//		for (int i = 1; i <= range; i++) {
//			System.out.println(num + "*" + i + "= " + i*num);
//		}
//			
		// for(int i = 1; i <= 9; i++) {
		// System.out.println(2 + "*" + i + " = " + i*2);
			
		// 세로로 출력
		// for (int num = 2; num <= 9; num++) {
		//    System.out.println("==" + num + "단==");
		//       for(int i = 1; i <= 9; i++) {
		//		    System.out.println(num + "*" + i + " = " + i*num);
		//	     }	
		// }
		
		// 가로로 출력
		
		for (int num1 = 2; num1 <= 9; num1++) {
			System.out.print(num1 + "단 : ");
			for(int i = 1; i <= 9; i++) {
				System.out.print(num1 + "*" + i + " = " + i*num1 + "  ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i = 1; i <= 9; i++) {
			for(int j = 2; j <= 9 ; j++) {
				System.out.print(j + "*" + i + "=" + i * j + "  ");
			}
			System.out.println();
		}
	}

}
