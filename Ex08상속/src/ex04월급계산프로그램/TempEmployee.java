package ex04월급계산프로그램;

public class TempEmployee extends Employee {

	public TempEmployee(String empno, String name, int pay) {
		super(empno, name, pay);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getMoneyPay() {
		// TODO Auto-generated method stub
		return pay/12;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
	}
	
}
