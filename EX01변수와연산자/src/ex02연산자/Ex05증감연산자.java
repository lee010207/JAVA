package ex02연산자;

public class Ex05증감연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 증감연산자
		// 변수의 값을 1 올리거나 1 감소시키는 연산자
		int num = 10;
		// System.out.println(++num);         //11(각각 출력)
		// System.out.println(num);           //11
		System.out.println(num++);        //10
		System.out.println(num);          //11
		
		// ++가 변수 앞에 붙으면 -> 먼저 1 증가하고 출력
		// ++가 변수 뒤에 붙으면 -> 출력 먼저 그 다음 변수의 값이 1 증가
		
		// 감소
		// System.out.println(--num);           //10
		// System.out.println(num);             //10
		System.out.println(num--);         //11
		System.out.println(num);           //10
		
	}

}
