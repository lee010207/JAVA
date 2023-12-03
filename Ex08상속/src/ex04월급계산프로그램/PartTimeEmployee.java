package ex04월급계산프로그램;

public class PartTimeEmployee extends Employee {
	int workDay;
	
	public PartTimeEmployee(String empno, String name, int pay, int workDay) {
		super(empno, name, pay);
		// 상속 관계에 있는 필드는 부모(슈퍼)클래스 사용해서 부모 클래스에서 초기화시켜서 가져옴
		// TODO Auto-generated constructor stub
		
		// Employee에 생성자를 안 만들었을 때는
		// this.empno = empno;
		// this.name = name;
		// this.pay = pay;
		// PartTimeEmployee 클래스에서 새로, 따로 생성자 만들어서 초기화시켜줌		
		this.workDay = workDay;
	}

	@Override
	public int getMoneyPay() {
		// TODO Auto-generated method stub
		return pay*workDay;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
	}
	
	

}
