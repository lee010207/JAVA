package ex01변수;

public class Ex03변수실습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 정수형 변수 num1에 10 넣기
		// int num1 = 10;
		int num1;          // 변수 선언, 정의
		num1 = 50000;      // 변수 값 할당, 대입
		num1 = 1000000;
		// 변수에 새로운 값을 할당하면 변수 안에 데이터가 업데이트 됨 : 이전의 값은 사라짐
		System.out.println(num1);
		
		int myAge = 24;
		int yourAge = 32;
		/////////////////////////
		// 치환 알고리즘 : 서로의 값을 바꿈
		int Age;
		Age = myAge;
		myAge = yourAge;
		yourAge = Age;
		
		/////////////////////////
		System.out.println("나의 나이 : " + myAge);
		System.out.println("짝꿍의 나이 : " + yourAge);
		System.out.println(myAge + yourAge);
		
	}

}
