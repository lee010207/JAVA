package ex02연산자;

import java.util.Scanner;

public class Ex09삼항연산자홀짝판별 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		String result = num%2 == 1 ? 
				"는(은) 홀수입니다." : 
				"는(은) 짝수입니다.";
		System.out.println(num + result);
		
		// String result = num%2 == 1 ? num + "는(은) 홀수입니다." : num + "는(은) 짝수입니다.";
		// System.out.println(result);
		// 이렇게 해도 됨
		
		sc.close();
		
	}

}
