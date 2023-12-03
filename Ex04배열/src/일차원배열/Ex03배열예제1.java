package 일차원배열;

public class Ex03배열예제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// (1) 배열 내 가장 큰 값, 가장 작은 값 출력
		
		int [] arr = {23, 45, 95, 17, 6, 89, 47, 56, 68, 17};
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
		
	}

}
