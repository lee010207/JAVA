package 일차원배열;

public class Ex01배열기초 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 : 같은 타입의 데이터를 관리하기 위해 사용하는 자료 구조
		
		// 1. 인덱스로 이루어진 자료구조
		// 2. 순차적 접근이 가능한 자료구조
				
		// 1. 배열을 선언하는 방법
		// 자료형 [] 배열명 = new 자료형 [배열의 크기];
		// 배열은 선언 및 생을 할 때 크기가 정해져 있음 -> 이후에 크기를 변경할 수 없음!
		
		// 이름이라는 같은 타입의 데이터를 하나로 관리할 수 있는 배열
		String [] stu = new String[3];
		System.out.println(stu);         // 출력 : @626b2d4a(주소값)
		// 3칸바로 공간이 저장되어있는 주소값을 가리킴 : stu
		// stu[인덱스값] = "배열 안에 저장할 값";
		
		stu[0] = "홍길동";
		stu[1] = "김이박";
		stu[2] = "이자바";
		
		System.out.println(stu[0]);
		
		// 배열 값은 변경가능! 배열 크기 변경은 불가능!
		// stu[3] = "이헬로"; : 오류(인덱스 3은 존재 X)
		
		// 인덱스 값으로 for문 사용해 이름 출력
		
		for(int i = 0; i < stu.length; i++) {
			System.out.println(stu[i]);
		}

		// 배열의 크기 : 배열명.length
		// stu.length ---> 3
		// 인덱스 값에 접근을 할 때 : 0~배열의 크기 - 1
		
		// 배열을 만드는 방법2 -> 선언 이후에 배열 크기 변경 불가능
		// 바꾸고 싶으면 선언 및 초기화 한 곳에 와서 변경 : 안에 있는 데이터가 초기화됐다가 다시 입력됨
		// 자료형 [] 배열명 = {배열 안에 저장할 값1, 값2,...};
		// 적힌 순서대로 인덱스 0 -> 1 -> 2 ->... 에 저장
		String [] 사무실 = {"책상", "의자", "노트북", "텀블러"};
		
		for (int i = 0; i < 사무실.length; i++) {
			System.out.println(사무실[i]);
		}
		
	}

}
