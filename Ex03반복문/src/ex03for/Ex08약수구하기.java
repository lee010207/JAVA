package ex03for;

import java.util.Scanner;

public class Ex08약수구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		System.out.print(num + "의 약수 : ");
		// System.out.print(num + "의 약수 : 1 ");
		
		for(int i = 1; i <= num; i++) {          // 모든 수의 약수 -> 1 , 자기 자신 : i를 2부터 자신자신-1까지
		// int i = 2; i <= num/2; i++      -> 약수는 자기자신의 반을 넘길 수 없음
			if(num % i == 0) {
				System.out.print(i + " ");
			}
		}
		// System.out.print(num);
		sc.close();
	}

}
