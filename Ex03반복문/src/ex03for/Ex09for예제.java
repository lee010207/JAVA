package ex03for;

public class Ex09for예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int jsum = 0;
		
		for(int i = 2; i <= 1000; i++) {
			for(int j = 1; j < i; j++) {
				if(i % j == 0) {
					jsum += j;
				}
			}
			if(i == jsum) {
				System.out.println(i);
			}
			jsum = 0;
		}
		
	}
}
