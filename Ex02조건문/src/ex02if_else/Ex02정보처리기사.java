package ex02if_else;

import java.util.Scanner;

public class Ex02정보처리기사 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("DB : ");
		int db = sc.nextInt();
		System.out.print("전자계산기 구조 : ");
		int junja = sc.nextInt();
		System.out.print("OS : ");
		int os = sc.nextInt();
		System.out.print("데이터통신 : ");
		int data = sc.nextInt();
		System.out.print("소프트웨어공학 : ");
		int soft = sc.nextInt();
		
		if (db >= 8 && junja >= 8 && os >= 8 && data >= 8 && soft >= 8) {
			if(db+junja+os+data+soft >= 60) {
				System.out.println("합격입니다.");
		}else{
			System.out.println("불합격입니다.");
		}
		}
		
		/*
		System.out.print("DB : ");
		int db = sc.nextInt();
		System.out.print("전자계산기 구조 : ");
		int ele = sc.nextInt();
		System.out.print("OS : ");
		int os = sc.nextInt();
		System.out.print("데이터통신 : ");
		int dc = sc.nextInt();
		System.out.print("소프트웨어공학 : ");
		int sw = sc.nextInt();
		
		boolean isCheck1 = (db + ele + os + dc + sw) >= 60 ;   // 따로 변수 처리(총 정답개수 60문제 이상 조건)
		boolean isCheck2 = db >= 8 && ele >= 8 && os >= 8 && dc >= 8 && sw >= 8 ;   
		// AND 연산자(&&) 사용해서 각 과목 당 최소 8문제 이상 정답 조건 따로 변수 처리
		
		if (isCheck1 && isCheck2) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
		 */
		
		sc.close();
	}

}
