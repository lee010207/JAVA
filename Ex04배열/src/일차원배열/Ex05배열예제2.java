package 일차원배열;

import java.util.Scanner;

public class Ex05배열예제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] score = new int[5];
		// int max;                 --> max, min 공간만 만들어놓기
		// int min;
		for(int i = 0; i < score.length; i++) {
			System.out.print((i+1) + "과목 점수 : ");
			score[i] = sc.nextInt();
		}
		
		for(int i = 0; i < score.length; i++) {
			System.out.print(score[i] + " ");
		}

		System.out.println();
		
		// 배열에 입력값을 받기 전에 인덱스 값으로 초기화를 해놓으면 -> 기본값 0으로 값이 담겨버림
		// 사용자가 입력한 후에 max, min을 초기화시켜야 함
		
		// max = score[0];            --> max, min 초기화해서 값을 담아줌
		// min = score[0];
		
		int max = score[0];
		int min = score[0];
		for(int i = 1; i < score.length; i++) {
			if(score[i] > max) {
				max = score[i];
			}
			if( score[i]< min) {
				min = score[i];
			}
		}
		System.out.println("최고 점수 : " + max);
		System.out.println("최저 점수 : " + min);
		
		int sum = 0;
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + (sum/5.0));
		// 5.0 --> (float)score.length
		
		sc.close();
	}

}
