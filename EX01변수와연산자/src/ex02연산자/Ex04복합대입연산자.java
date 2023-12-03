package ex02연산자;

public class Ex04복합대입연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 대입연산자
		// 우측의 값을 집어넣음
		
		// 복합대입연산자
		int a = 10;
		
		// 기존 a의 값에 10을 더해주려면?
		// a = a + 10;   :   a 값이 20이 됨
		a += 10;    // 더하기     a == 20
		a -= 5 ;    // 빼기      a == 15
		a /= 2 ;    // 나누기(몫)  a == 7
		a %= 4 ;    // 나머지     a == 3
		a *= 4 ;    // 곱하기     a == 12
		
		// 복합대입연산자 우선순위
		int num = 29;
		num -= 2 + 3 * 4;       // num = num - ( 2 + 3 * 4);
		System.out.println(num);
	}

}
