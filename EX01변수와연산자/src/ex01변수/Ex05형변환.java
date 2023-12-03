package ex01변수;

public class Ex05형변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//형변환 : 자료형을 바꿔주는 과정
		// 작은 데이터 타입 -> 큰 데이터 타입(o) , 반대는 강제 형변환만 가능(데이터가 유실될 수 있음)
		byte num1 = 100;     //1byte
		int num2 = 300;     //4byte
		byte num3 = (byte)num2;  //강제 형변환
		//byte형 변수에 int형 자료를 담을 때 자료크기차이에 따른 자료손실 문제 우려 => 오류남
		
		System.out.println(num2);
		System.out.println(num3);
		
		
		//실수 형태의 형변환
		double num4 = 100.33;     //8byte
		int num5 = (int)num4;          //4byte
		
		System.out.println(num5);
		// 실수형태 자료형은 정수형태에 넣으면 실수는 다 날아감(소수점 자리 사라짐)
		
		float num6 = 3.14F; 
		int num7 = (int)num6;
		
		System.out.println(num7);
		
		int num8 = 100;
		float num9 = num8;
		System.out.println(num9);
		
	}

}
