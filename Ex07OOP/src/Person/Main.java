package Person;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Class가 실행되는 공간
		// 설계도를 사용해서 Object(객체)를 만드는 공간
		
		// 설계도이름 변수명(레퍼런스형) = new 설계도이름 ();
		Person p1 = new Person("홍길동", 20, "여자", 170, "서울");
		// Person 설계도를 통해서 p1이라는 오브젝트(객체) 생성
		
		// . : '참조하다' 연산자, 기호
//		p1.name = "홍길동";
//		p1.age = 20;
//		p1.gender = "여자";
//		p1.height = 167;
//		p1.local = "서울";
	
		System.out.println("이름 : " + p1.name);
		System.out.println("나이 : " + p1.age);
		System.out.println("성별 : " + p1.gender);
		System.out.println("키 : " + p1.height);
		System.out.println("거주지 : " + p1.local);
		
		p1.breathe();
		p1.eat();
		p1.sleep();
		
		// 설계도 사용해서 object 객체 p2 만들기
		// + 설계도를 하나 만들어 놓으면 여러개의 객체를 생성할 수 있음
		Person p2 = new Person();
		
		p2.name = "박보배";
		p2.age = 32;
		p2.gender = "여자";
		p2.height = 155;
		p2.local = "광주";
		
		System.out.println("이름 : " + p2.name);
		System.out.println("나이 : " + p2.age);
		System.out.println("성별 : " + p2.gender);
		System.out.println("키 : " + p2.height);
		System.out.println("거주지 : " + p2.local);
		
		System.out.println(p1);
		System.out.println(p2);
		
	}

}
