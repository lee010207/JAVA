package 일차원배열;

import java.util.Scanner;

public class Ex08배열예제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] input = new int[5];
		int[] answer = {1, 4, 3, 2, 1};
		
		System.out.println("==채점하기==");
		System.out.println("답을 입력하세요");
		
		for(int i = 0; i < 5; i++) {
			System.out.print((i+1) + "번답 : ");
			input[i] = sc.nextInt();
		}
		
		System.out.println("정답확인");
		int score = 0;
		
		for(int i = 0; i < 5; i++) {
			if(input[i]==answer[i]) {
				System.out.print(" O ");
				score += 20;
			}else {
				System.out.print(" X ");
			}
		}
		System.out.println("총점 : " + score + "점");
		
		sc.close();
	}

}
