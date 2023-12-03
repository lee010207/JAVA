package ex02연산자;

public class Ex01산술연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 산술연산자
		int num1 = 7;
		int num2 = 3;
		
		int result1 = num1 + num2;
		System.out.println(result1);
		int result2 = num1 - num2;
		System.out.println(result2);
		int result3 = num1 * num2;
		System.out.println(result3);
		int result4 = num1/num2;
		System.out.println(result4);        // 정수형/정수형 -> 정수형 몫(소수점 버림)
		double result5 = 17.3 / 3.0;          
		System.out.println(result5);        
		int result6 = num1 % num2;          // ' / ' : 나눈 몫 , ' % ' : 나눈 나머지
		System.out.println(result6);
		
		// 문자열 더하기 숫자
		System.out.println("바나나"+ 8 + 2);
		System.out.println("바나나"+ (8 + 2));
		System.out.println("바나나"+ 8 * 2);
		System.out.println("81"+ 3 * 2 + 2 + 4);
		// "81" + 6 + 2 + 4
		// "816" + 2 + 4
		// "8162" + 4
		
		}

}
