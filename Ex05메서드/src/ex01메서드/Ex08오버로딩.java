package ex01메서드;

public class Ex08오버로딩 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 숫자 2개를 더해주는 기능 sum2 ---> sum
		sum(2,3);
		
		// 숫자 3개를 더해주는 기능 sum3 ---> sum
		sum(2,3,4);
		
	}
	public static void sum(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	// 같은 더하기 기능이라면 같은 이름으로 사용할 수 있게 만들자
	
	public static void sum(int num1, int num2, int num3) {
		System.out.println(num1 + num2 + num3);
	}
	// 매개변수의 개수가 다르기 때문에 같은 이름으로 메서드를 정의할 수 있음
}
