package ex01while;

public class Ex01while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// while, do while, for
		
		// while을 사용하여 1부터 5까지 출력
		
		int num = 1;
		
		while(true) {
			System.out.println(num);
			
			if(num==5) {
				break;
			}
			num++;
		}
		
//		while (num <= 5) {
//			System.out.println(num);
//			// num = num + 1;
//			// num += 1;
//			num++;
//		}
	}

}
