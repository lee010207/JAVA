package ex01메서드;

public class Ex06메서드예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 24;
		int result = largerNumber(num1, num2);
		System.out.println("큰 수 확인 : " + result);
	}
	public static int largerNumber(int num1, int num2) {
		if(num1 > num2) {
			return num1;
		}else if ( num1 == num2) {
			return 0;
		}
		return num2;
		// else if 문을 사용할 때는 반드시 else문으로 닫아주거나
		// 나머지 경우 모두에 대한 return을 작성해줘야 함
		// : 발생할 수 있는 모든 경우에 대해서 return이 필요함
	}
}
