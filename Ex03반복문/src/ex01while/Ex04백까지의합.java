package ex01while;

public class Ex04백까지의합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		int sum = 0;
		
		while(num <=100) {
			sum = sum + num;
			// sum += num;
			num++;
		}
		
//		while(true) {
//			sum += num;
//			if(num == 100) {
//				break;
//			}
//			num++;
//		}
		System.out.println(sum);
		
	}
	
}
