package ex01while;

public class Ex02홀수만출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1부터 100까지 홀수만 출력
		int num = 1 ;
		
		while (true) {
			System.out.println(num);
			if(num == 99){
				break;
			}
			num = num + 2;
		}
		
//		while (num <= 100) {
//			System.out.println(num);
//			num += 2;
//	}
		
//		while (true) {
//			if(num % 2 == 1) {
//				System.out.println(num);
//			}
//			if (num == 100) {
//				break;
//			}
//		}
		
//		while (num <= 100) {
//			
//			if(num%2 == 1) {
//				System.out.println(num);
//			}
//			num++;
//		}
	}

}
