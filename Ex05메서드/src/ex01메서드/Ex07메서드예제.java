package ex01메서드;

public class Ex07메서드예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 완전수 구하기 : 나를 제외한 약수의 합이 나와 같은 수
		
		int num1 = 10;
		int num2 = 2;
		boolean divisor = isDivisor(num1, num2);
		// 메서드이름 앞에 is 접두사가 붙어있으면 리턴타입이 boolean(T/F)
		System.out.println(divisor);
		
		getDivisor(10);
		getDivisor(16);
		getDivisor(24);
		
		
		int num = 10;
		int result = getSumOfDivisors(num);
		
		System.out.println(num + "의 약수의 합 : " + result);
		
		getDivisor(num);
		
		// 4단계) 완전수인지 아닌지를 판단해주는 메서드 isPerfectNumber
		int num3 = 369;
		
		boolean result2 = isPerfectNumber(num3);
		System.out.println("완전수인가요? : " + result2);
		
		int startValue = 2;
		int endValue =  1000;
		System.out.print("2~1000까지의 완전수 : ");
		getPerfectNumber(startValue, endValue);
		
	}
	// 1단계) 약수인지 아닌지 확인해주는 메서드 만들기
	// 1.isDivisor() : 약수인지 아닌지 판단해서 true/false를 돌려주는 메서드
	public static boolean isDivisor(int num1, int num2) {
	// 결과값을 true/false로 내보낼 거니까 리턴타입을 불리언으로 해줘야 함
		if(num1 % num2 == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	//2. getDivisor : 전달 받은 하나의 숫자에 대해 모든 약수를 출력하는 메서드
	// 출력 자체를 리턴해주고 있음 --> 리턴 타입 : void
	public static void getDivisor(int num) {
		System.out.print(num + "의 약수 : ");
		
		for(int i = 1; i <= num; i++) {
			if(isDivisor(num , i) == true) {
				System.out.print(i + "  ");
			}
		}
		System.out.println();
	}
	
	// 3. getSumOfDivisors() : 전달 받은 하나의 숫자에 대한 약수의 합을 구하는 메서드
	public static int getSumOfDivisors(int num) {
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			if(isDivisor(num , i) == true) {
				sum += i;
			}
		}
		return sum;
	}
	
	// 4. isPerfectNumber() : 완전수인지 아닌지 판단해서 true/false를 반환해주는 메서드 
	public static boolean isPerfectNumber(int num3) {
		if(getSumOfDivisors(num3)/2 == num3) {
			return true;
		}else {
			return false;
		}
	}
	
	// 5. getPerfectNumber()
	public static void getPerfectNumber(int startValue, int endValue) {
		for(int i = startValue; i <= endValue; i++) {
			if(isPerfectNumber(i)) {
				// 조건식이 TRUE일 때만 실행되니까 
				// isPerfectNumber(i) == true 이렇게 안해줘도 됨
				System.out.print(i + " ");
			}
		}
	}
	
//	public static void getPerfectNumber(int startValue , int endValue) {
//		int sum = 0;
//		for(int i = startValue; i <= endValue; i++) {
//			for(int j = 1; j < i; j++) {
//				if(isDivisor(i , j) == true) {
//					sum += j;
//				}
//			}
//			if(sum == i) {
//				System.out.print(i + " ");
//			}
//			sum = 0;     // sum을 0으로 초기화 -> 이거 안해주면 계속 누적돼
//		}
//	}
	
}
