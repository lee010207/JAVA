package ex02연산자;

public class Ex08삼항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 삼항연산자 - 간단한 제어처리
		// 조건식 ? true일 때 실행할 문장 : false일 때 실행할 문장
		int num1 = 10;
		int num2 = 100;
		
		String result = num1 > num2 ? "num1이 더 큽니다" : "num2가 더 큽니다";
		// 뒤에 실행할 문장에 ""로 묶여서 문자열 자료형이므로 String 변수에 담아줌
		System.out.println(result);
		
		
		
	}

}
