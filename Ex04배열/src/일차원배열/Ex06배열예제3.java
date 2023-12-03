package 일차원배열;

import java.util.Scanner;

public class Ex06배열예제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 수박 게임 만들기
		System.out.println("=== 수박 게임 START ===");
		
		Scanner sc = new Scanner(System.in);
		
		String[] arr = {"수" , "박"};
		
		System.out.print("숫자를 입력해주세요 >> ");
		int num = sc.nextInt();
		
		// num번 반복 : 글자 출력하는 것
		for(int i = 0; i < num; i++) {
			// i : 0 1 2 3 ... num-1
			// for문이 홀수번째 반복 중일때는 "수"를 출력 --> i(짝수) : 0 2 4 6 ...
			// for문이 짝수번째 반복 중일때는 "박"을 출력 --> i(홀수) : 1 3 5 7 ...
			if(i % 2 == 0) {
				// 수
				System.out.print(arr[0]);
			}else {
				// 박 
				System.out.print(arr[1]);
			}
		}
		
//		for(int i = 1; i <= num; i++) {
//			// i : 1 2 3 4 5 ... num
//			// for문 홀수번째 -> i : 1 3 5 7 ..
//			// for문 짝수번째 -> i : 2 4 6 8 ...
//		}
		
		sc.close();
	}

}
