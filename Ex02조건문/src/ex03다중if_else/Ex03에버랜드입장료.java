package ex03다중if_else;

import java.util.Scanner;

public class Ex03에버랜드입장료 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===== 에버랜드 웰컴 =====");
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("인원수 : ");
		int pay = sc.nextInt() * 5000;
		
		if(age < 20) {
			System.out.println("총 " + (int)(pay*0.5) + "원 입니다.");
		}else {
			System.out.println("총 " + pay + "원 입니다.");
		}
	}

}
