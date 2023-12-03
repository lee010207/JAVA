package ex01변수;

public class Ex02변수의종류 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 정수형 데이터 타입
		// byte - 1byte(bit(0 or 1)*8) : -128 ~ 127
		byte num1 = 127 ;
		
		// short - 2byte
		short num2 = 5000;
		
		// int - 4byte(정수 기본형 : 자동으로 int로 인식)
		int num3 = 29999999;
		
		// long - 8byte(int범위를 넘어가는 수를 long으로 쓸 때 뒤에 'L' 써줘야함)
		long num4 = 3999999999L;
		
		// 실수형 데이터 타입
		// float - 4byte(뒤에 'F'써주거나 앞에'(float)'써줘야 함)
		// float num5 = (float)10.7;
		float num5 = 10.7F;
		
		// double - 8byte(실수 기본형 : 자동으로 double로 인식)
		double num6 = 5.17;
		
		// 논리형
		// boolean - 1 bit or 1 byte
		boolean isCheck = true;
		
		// 문자형
		// char - 2byte(문자형은 무조건 '한글자만' 작은따옴표! "여러글자" 쌍따옴표!)
		char text = '오';
		System.out.println(text);
	
	}

}
