package ex04switch;

import java.util.Scanner;

public class Ex03계절판별 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월 입력 : ");
		int month = sc.nextInt();
		
		switch (month) {
		case 12,1,2 :
			System.out.println(month + "월은 겨울입니다!");
			break;
		case 3,4,5 :
			System.out.println(month + "월은 봄입니다!");
			break;
		case 6,7,8 :
			System.out.println(month + "월은 여름입니다!");
			break;
		case 9,10,11 :
			System.out.println(month + "월은 가을입니다!");
			break;
		}
		// switch (month) {
		// case 12,1,2 -> System.out.println(month + "월은 겨울입니다!");} 
		// break 안쓰고 이렇게도 가능
		sc.close();
	}

}
