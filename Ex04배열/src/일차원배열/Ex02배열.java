package 일차원배열;

public class Ex02배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 10, 4, 8, 17, 22, 31};
		
		// (1) : 배열 내 모든 값 출력
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println();
		
		//(2) : 배열 내 짝수 값만 출력
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				System.out.println(arr[i]);
			}
		}

		System.out.println();
		
		// (3) : 배열 내 가장 큰 수만 출력
		int temp = arr[0];     
		// --> 배열 안의 값이 음수일 경우 temp(기준값)만 출력
		// 정확한 결과값들 받아볼 수가 없음 : 배열 안에 들어있는 값들로만 비교 해야 함
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > temp) {
				temp = arr[i];
			}
		}
		System.out.println(temp);
		
		int [] array =new int[5];
		array[1]=10;
		array[2]=10;
		array[3]=10;
		array[4]=10;
		array[5]=10;
				
		
	}

}
