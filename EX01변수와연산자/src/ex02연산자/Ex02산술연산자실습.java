package ex02연산자;

import java.util.Scanner;

public class Ex02산술연산자실습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3자리 숫자를 입력받아 10의 자리 이하의 값을 다 버리기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수입력 >> ");
		int num = sc.nextInt();
		int result1 = num % 100;
		int result2 = num - result1;
		System.out.println("결과확인 >> " + result2);
		
		// 1. 몫 이용
		// int result1 = num / 100 * 100;
		// 2. 나머지 이용
		// int result2 = num - (num % 100);
		// 3. String 이용
		// String result3 = num / 100 + "00";
		
		sc.close();
	}

}
