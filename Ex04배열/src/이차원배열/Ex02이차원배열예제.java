package 이차원배열;

public class Ex02이차원배열예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr = new int [5][5];
		
		// [0][0] [0][1] [0][2] [0][3] [0][4]
		//   21     22     23     24     25
		
		int num =21;   // 21부터 for문 돌면서 1씩 증가한 값이 들어가게
		
		for(int j = 0; j < 5; j++) {
			// j : 0 1 2 3 4 (5번 반복)
			for(int i = 0; i < 5; i++) {
				arr[i][j] = num;
				num++;
			}
		}
		
		for(int j = 0; j < 5; j++) {
			for(int i = 0; i < 5; i++) {
				System.out.print(arr[j][i] + "\t");
			}
			System.out.println();
		}
		
		// [1][0] [1][1] [1][2] [1][3] [1][4]
		//   26     27     28     29     30
		
//		for(int i = 0; i < 5; i++) {
//			arr[1][i] = num;
//			num++;
//		}
		System.out.println();
		
		// 04 03 02 01 00
		// 14 13 12 11 10
		// 24 23 22 21 20
		// 34 33 32 31 30
		// 44 43 42 41 40
		
		//입력부
		int number = 21;
		
		for(int i = 0; i < 5; i++) {
			for(int j = 4; j >= 0; j--) {
				arr[i][j] = number;
				number++;
			}
		}
		// 출력부
		for(int j = 0; j < 5; j++) {
			for(int i = 0; i < 5; i++) {
				System.out.print(arr[j][i] + "\t");
			}
			System.out.println();
		}
		
		// 
		System.out.println();
		
		int numm = 21;
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j<5; j++) {
				arr[i][j] = numm;
				numm ++;
			}
		}
		
		for(int i = 4; i >=0 ; i--) {
			for(int j = 4; j >= 0; j--) {
				System.out.print(arr[j][i] + "\t");
			}
			System.out.println();
		}
 	}

}
