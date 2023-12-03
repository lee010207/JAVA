package ex04월급계산프로그램;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegularEmployee r1 = new RegularEmployee("SMHRD001", "홍길동", 4000, 400);
		
		r1.print();
		
		TempEmployee t1 = new TempEmployee("SMHRD002", "박문수", 3000);
		
		t1.print();
		
		PartTimeEmployee p1 = new PartTimeEmployee("SMHRD003", "김장독", 10, 17);
		
		p1.print();
		
		// Employee를 객체로 생성하자
		// Employee emp = new Employee("SMHRD004", "조자연", 30 , 20);
		
	}

}
