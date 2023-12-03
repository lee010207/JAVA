package ex01메서드;

public class Ex03매o리x {
// 매개변수 있고 리턴타입 없다(void ---> 텅빈)
// 전달입자 있고, 리턴타입 자리에 데이터 타입이 명시 x(return 키워드 안 옴)
// void가 오는 경우는 메서드가 순수하게 기능자체를 가지고 있는 경우
// ex) syso, compile 을 하는 기능..
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// sumPrint : 숫자 2개를 전달 받아서 더한 결과값을 출력해주는 기능
		
		sumPrint(2,4);
		
		// System.out.println(sumPrint(2,4));
		// --> 오류남 : 출력하는 기능을 출력하려고 해서 발생한 오류
	}
	
	public static void sumPrint(int num1, int num2) {
		System.out.println(num1 + num2);
		// void라는 리턴타입은 return 안 써
	}

}
