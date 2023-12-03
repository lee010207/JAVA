package ex04월급계산프로그램;

public abstract class Employee {
	// : Employee 클래스는 일반 클래스임
	// 1) 추상 메서드를 포함하고 있는 클래스는 반드시 추상 클래스가 되어야 한다!
	// 2) 추상 클래스는 일반 메서드도 포함할 수 있다
	// 3) 추상 클래스이지만 추상 메서드가 없어도 된다
	// 4) 추상클래스는 객체 생성(실체화)가 불가능 하다
	// 개념적인 존재이기 때문에 / 공통적인 특징만을 모아놓은 추상적인 개념

	
	// 부모 클래스에 있는 getMoneyPay()는 자식클래스에서 매번 구현단이 (바디가) 바뀜
	// 부모 클래스에서 틀만 만들어서 자식 클래스에 물려주고 싶음 : 추상 메서드
	// public int getMoneyPay();
	// 이렇게 하면 오류 : 바디를 요구하는 메서드래
	// --> 바디를 요구하지 않는 메서드를 사용해줘야 해 : 추상 메서드 사용!
	// 추상 메서드 : 선언만 되어있고, 바디가 없는( { }중괄호 ) 메서드
	// abstract 추상 메서드 키워드를 통해서 일반메서드를 추상메서드로 만들 수 있다!
	public abstract int getMoneyPay();
	
	// 이렇게만 해주면 클래스에 오류가 뜸
	// : 일반 클래스는 추상 메서드를 포함할 수 없어 --> 추상 클래스로 바꿔줘야함
	

	
	// Regular/PartTime/TempEmployee가 가지고 있는
	// 공통적인 필드, 메서드가 있음
	
	// Regular/PartTime/TempEmployee가
	// Employee 클래스를 상속받을 예정!
	
	// 1) 필드 : 사번, 이름, pay
	// private : 데이터 보호에는 좋음
	// ---> 클래스 내부에 설계되어 있는 메서드를 통해서만 접근이 가능하도록 도와줌
	
	// protected : 상속 관계에 있는 클래스들 끼리 + 같은 패키지에 있는 클래스들 끼리는
	// 접근이 가능하도록 도와주는 접근 제한자
	
	String empno;
	String name;
	int pay;
	
	
	
	public Employee(String empno, String name, int pay) {
		super();
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}
	
	public void print() {
		System.out.print(empno + " : ");
		System.out.print(name + " : ");
		System.out.println(pay);
		System.out.println("월급은 " + getMoneyPay() + "만원입니다.");
	}
}
