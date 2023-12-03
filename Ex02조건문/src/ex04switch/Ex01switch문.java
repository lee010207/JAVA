package ex04switch;

import java.util.Scanner;

public class Ex01switch문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-----점심메뉴 추천======");
		System.out.println("1.햄버거 2.짜장면 3.제육볶음 4.초밥");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1:
			System.out.println("동명동 본투비버거 추천");
			break;
		case 2:
			System.out.println("열도지 짬뽕 ㄱ");
			break;
		case 3:
			System.out.println("수라간 제육볶음 만원, 찌개가 맛있어");
			break;
		case 4:
			System.out.println("아무데나 가세요");
			break;
		default :
			System.out.println("4번까지 있어요!");
			// break 써도 되고 안써도 됨
		}
		sc.close();
	}

}
