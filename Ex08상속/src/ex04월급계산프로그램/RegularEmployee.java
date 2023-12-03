package ex04월급계산프로그램;

public class RegularEmployee extends Employee{
	int bonus;

	public RegularEmployee(String empno, String name, int pay, int bonus) {
		super(empno, name, pay);
		// 부모에 있는 생성자를 사용해서 초기화시켜줌
		this.bonus = bonus;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getMoneyPay() {
		// TODO Auto-generated method stub
		return (pay + bonus)/12;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
	}
	
	
}
