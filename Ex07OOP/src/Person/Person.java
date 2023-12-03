package Person;

public class Person {
	
	// 사람에 대한 설계도 : Class
	// 1. Field(필드 , 속성)
	// : 객체가 가질 수 있는 공통적인 속성, 데이터 ,변수
	// 필드는 선언만 되어 있음 : 공간만 만들어줌(값 안넣어놓음)
	
	String name;     // 이름
	String gender;   // 성별
	int age;         // 나이
	int height;      // 키
	// 거주지도 저장하게 만들어 주기
	String local;
	
	// 2. Method(메서드)
	// : 객체가 할 수 있는 공통적인 행위, 행동, 기능
	// static 사용 X
	
	// 숨쉬기
	public void breathe() {
		System.out.println("들이마시고 내쉬고");
	}
	// 잠자기
	public void sleep() {
		System.out.println("드르렁드르렁 쿨쿨");
	}
	
	// 밥먹기
	public void eat() {
		System.out.println("냠냠 쩝쩝");
	}
	
	// 설계도를 만들기 위해서 클래스를 만들면, 그 안에 자동으로 생성자가 만들어짐
	// 근데, 눈에 안보여
	// 왜냐, 생략되어 있어서
	// 이런걸 기본 생성자 라고 함
	// 기본 생성자 : 생략 가능함
	
//	public Person() {
//		// 기본 생성자의 모양
//	}
	// 생성자도 메서드임(소괄호() --> 중괄호 {}) : 모양 똑같
	
	// 기본 생성자 말고, 객체를 선언과 동시에 초기화를 시켜주는
	// 새로운 생성자 만들기!
	
	// !! 생성자의 특징 !!
//	1) 생성자도 메서드
//	2) 생성자의 이름(메서드명) 은 클래스의 이름과 같아야 함
//	-  대소문자까지 구분
//	3) 클래스를 처음 만들 때 기본생성자는 생략되어 있음
//	4) 새로운 생성자를 만들면 생략되어있는 기본생성자는 사용할 수 없음
//	- 기본생성자도 사용하고 싶으면 눈에 보이게 코드로 작성해줘야 함
	public Person() {
		
	}
	
	// 전달인자를 사용해서 생성자한테 메세지를 보내줌
	// 전달인자, 매개변수가 있는 생성자 사용
	
	public Person(String name, int age, String gender, 
			                   int height, String local) {
		// main에서 보내온 전달인자를 매개변수로 받아서
		// {현재 클래스에 있는 필드를 받아온 값으로 초기화 시켜줌}
		// this : 현재 클래스를 지칭하는 키워드
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
		this.local = local;
	}
	
}
