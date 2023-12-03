package 이차원배열;

public class Ex04예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[4][3];
		int num = 401;
		
		String[][] resident = {{"송승호","송찬호","정봉균"},
				{"손동연","조준용","이진근"},
				{"이명훈","박병관","임승환"},
				{"박수현","강예진","임명진"}};
		
		for(int j = 0; j < 3; j++) {
			for(int i = 0; i < 4; i ++) {
				arr[i][j] = num;
				num-=100;
				
			}
			num += 401;
		}
		
		System.out.println("_____________________________________________");
		for(int j = 0; j < 4; j++) {
			for(int i = 0; i < 3; i ++) {
				System.out.print("| " + arr[j][i] + "호 : " + resident[j][i] + " |");
			}
			System.out.println();
		}
	
	}
}
