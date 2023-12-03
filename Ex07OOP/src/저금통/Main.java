package 저금통;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * // 1) 저금통 설계도를 사용해서 저금통을 1개 만들어주기 
		 * 		PiggyBank b1 = new PiggyBank();
		 *  ---> 기본 생성자(자동 생성) 사용해서 객체 만들어줌
		 * // 2) 저금통에 초기금앳을 1500원으로 설정
		 * 		 b1.money = 1500; 
		 * // : PiggyBank 설계도에서 money라는 필드를 참조해서 b1으로 가져와라
		 */		
		
		// 1.5)
		//  : 생성자 사용해서 1) + 2) 합쳐보기
		// 객체를 생성 + 필드를 초기화 ---> 새로운 생성자
		PiggyBank b1 = new PiggyBank(1500);
		// 기본값 설정 : 1500
		
		b1.setMoney(2000);
		System.out.println(b1.getMoney());
		
		// 3) 저금통에 700원을 입금
		// deposit 메서드에다가 "700"이라는 값을 전달해서 입금기능 만들어내기
		b1.deposit(700);
		
		// 4) 잔액을 확인
		b1.showMoney();
		
		// 5) 500원을 저금통에서 출금
		b1.withdraw(500);
		
		// 6) 잔액 확인
		b1.showMoney();
		}

}
