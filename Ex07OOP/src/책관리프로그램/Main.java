package 책관리프로그램;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 객체 배열
		
		// vo --> value object
		// 클래스 자체 자료형이 필요 : 사용자 정의 자료형
		// String , int, char 등 각 다른 기본자료형을 한번에 저장가능
		
		// 배열 선언 방법
		// 자료형[] 레퍼런스변수명 = new 자료형[배열의 크기]
		// Book 자료형을 관리하는 배열을 하나 만듦
		Book [] bookList = new Book[5];
		// bookList에 저장될 수 있는 자료형 --> Book 자료형을 가진 데이터만 저장가능
		// ---> 객체 자료형(하나의 클래스를 통해서 여러 자료형을 하나의 객체자료형으로 통으로 저장)  
		Book b1 = new Book("Java", 21000, "홍길동");
		// b1이라는 주소값 안에 b1.title(String), b1.price(int), b1.writer(String)이 같이 저장
		// b1은 Book 자료형을 가진 상태
		
//		// 객체배열에 값을 대입
//		bookList[0] = b1;
//		
//		// b1 출력하기
//		System.out.println(bookList[0]);
//		
//		// bookList[0] == b1
//		// b1.getTitle()
//		// bookList[0].getTitle()
//		System.out.println(bookList[0].getTitle());
		
		// 1) b2 ~ b5 만들기
		Book b2 = new Book("C++", 29000, "박문수");
		Book b3 = new Book("Android", 18000, "이순신");
		Book b4 = new Book("Web", 26000, "김코딩");
		Book b5 = new Book("SQL", 33000, "데이터진흥원");
		
		// 2) b1 ~ b5를 배열에 저장하기
		bookList[0] = b1;
		bookList[1] = b2;
		bookList[2] = b3;
		bookList[3] = b4;
		bookList[4] = b5;
		
		// 3) 배열 안에 들어있는 값들에 접근하는 방법을 사용해서
		// 사용자들로부터 입력받은 금액으로 구매할 수 있는 책의 정보를 출력!
		Scanner sc = new Scanner(System.in);
		
		System.out.print("금액을 입력하세요 : ");
		int money = sc.nextInt();
		
		System.out.println("구매 가능한 책 목록");
		for(int i = 0; i < bookList.length; i ++) {
				if(money > bookList[i].getPrice()) {
					System.out.println("[ " + bookList[i].getTitle() + ", " 
					+ bookList[i].getWriter() + ", " + bookList[i].getPrice() + "원 ]");
				}
		}

		
	}

}
