package ex02do_while;

import java.util.Scanner;

public class Ex05계산기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String again = "Y";
		
		while(again.equals("Y")){
			System.out.print("첫 번째 정수 : ");
			int num1 = sc.nextInt();
			System.out.print("두 번째 정수 : ");
			int num2 = sc.nextInt();
			
			System.out.print("[1]더하기  [2]빼기 >> ");
			int cal = sc.nextInt();
			
			if(cal == 1) {
				System.out.println("더하기 연산 결과 " + (num1+num2) + "입니다.");
			}else {
				System.out.println("빼기 연산 결과 " + (num1-num2) + "입니다.");
			}
			System.out.print("다시 실행하시겠습니까?  ( Y / N ) >> ");
			again = sc.next();
		}
		System.out.println("종료");
			
			
		
		
	}

}
