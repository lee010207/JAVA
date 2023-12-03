package ex01변수;

import java.util.Scanner;

public class Ex06키보드입력 {
	public static void main(String[] args) {
		// 키보드로부터 입력을 받을 수 있는 변수 생성 : Scanner
		// 레퍼런스 자료형은 값 + "기능" 을 가짐 , 'new' 키워드 사용!
		// ctrl + shift + o : Scanner import 불러오기
		Scanner sc = new Scanner(System.in);
		
		// 스캐너를 통해 정수를 입력받는 방법
		System.out.print("숫자를 입력해주세요 : ");   // ln은 줄바꿈을 의미 : ln 빼주면 옆으로 이어짐
	
		int temp = sc.nextInt();
		System.out.println("입력한 숫자는 -> " + temp);
		
		sc.close();  // Scanner 종료
	}
}
