package 이차원배열;

public class Ex03예제풀이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 00 01 02 03 04
		// 14 13 12 11 10
		int [][] arr = new int[5][5];
		int num = 21;
		
		for(int i = 0; i < 5; i ++) {
			if(i % 2 == 0) {
				for(int j = 0; j < 5; j++) {
					arr[i][j] = num;
					num++;
				}
			}else {
				for(int j = 4; j >= 0; j--) {
					arr[i][j] = num;
					num++;
				}
			}
		}
		
		/*
		 for(int i = 0; i < 5; i ++) {
			for(int j = 0; j < 5 && i % 2 == 0; j++) {
					arr[i][j] = num;
					num++;
			}
			for(int j = 4; j >= 0 && i % 2 == 1; j--) {
					arr[i][j] = num;
					num++;
			}
		}
		이렇게도 결과는 같음
		 */
		for(int i = 0; i < 5; i++) {
			for(int j =0; j<5; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
