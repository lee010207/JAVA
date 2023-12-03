package ex02do_while;

public class Ex01do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// while : 조건을 먼저 확인한 후 true일 때만 반복실행
		// do_while : 무조건 한번은 실행 한 조건이 true일 때 반복
		int num = 10;
		
		do {
			System.out.println("야호!");
			num--;
		}while(num > 100);
		
		
//		while(num > 100) {
//			System.out.println("야호!");
//			num--;
//		}

	}

}
