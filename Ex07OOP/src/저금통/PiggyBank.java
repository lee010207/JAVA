package 저금통;

public class PiggyBank {
	// 저금통이 설계되는 곳
	
	// 1. Field
	// 값은 안넣고 틀만 만들어놓음 : 설계도니까
	private int money;
	// private (사적인)
	// : 클래스 내부에 있는 메서드를 통해서만 접근 가능하도록 도와주는 접근제한자
	// - private으로 감싸진 필드에 접근하고 싶으면 클래스 내부에 메서드가 설계되어 있어야 함

	// getter / setter
	// : private으로 감싸진 필드에 접근할 수 있도록 클래스 내부에 만들어진 메서드
	// 수정 : set --> 매개변수가 있음(main으로 부터 값으로 받아와서 필드 money에 넣어줘야 하기 떄문에)
	public void setMoney(int money) {
		this.money = money;
	}
	
	// 가져와서 확인 : get
	public int getMoney() {
		return money;
	}
	
	// 1.5) 생성자(메서드) : 새로운 생성자 만들기 ( 기본 생성자 사용안할거니까 안만들어줘 )
	// <1> 생성자의 이름은 클래스의 이름과 동일하다 (대소문자도 구분)
	// <2> 생성자도 메서드다
	// <3> 생성자는 리턴타입이 없다(void X)
	// <4> 새로운 생성자를 만들면 기본생성자는 사용할 수 없다
	// ----> 기본 생성자도 사용ㅇ하고 싶으면 코드로 작성해줘야 함
	// <5> 기본생성자는 클래스를 만들 때 생략되어 있다
	public PiggyBank(int money) {
		this.money = money;
		// 현재 필드에 있는 money 초기화 시켜줌
	}
	
	// 2. Method
	// 입금 : deposit
	public void deposit(int money) {
		// 매개변수 int money
		// : main에서 받아온 입금할 금액
		// 내가 가지고 있는 money = 현재 필드 money + main에서 받아온 입금 금액
		System.out.println(money + "원이 입금되었습니다.");
		this.money = this.money + money;
	}
	// 출금 : withdraw
	public void withdraw(int money) {
		System.out.println(money + "원이 출금되었습니다.");
		this.money  -= money;
	}
	// 잔액을 확인 : showMoney
	public void showMoney() {
		System.out.println("현재 잔액 : " + money);
	}
	// 매개변수 money를 사용하지 않기 때문에 바로 필드 money를 가리키고 있어서 따로 this 사용 안함
}
