package ex01메서드;

public class Ex02매개변수o리턴타입o {
// : 전달인자 있고, 리턴타입 자리에 데이터 타입이 명시되어 있는 경우 (+ return)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2개의 숫자를 뺴기해준 결과값을 받을 수 있는 minus 메서드
		
		System.out.println(minus(7 , 2));
	}
	// main 밖
	 public static int minus(int num1, int num2) {
		 // 리턴 타입이 있으면(데이터 타입이 명시되어 있으면) 반드시 return 키워드 작성!
		 return num1 - num2;
		 // 리턴타입과 결과값의 데이터타입이 일치해야 함
	 }
}

