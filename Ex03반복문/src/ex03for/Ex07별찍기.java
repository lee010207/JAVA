package ex03for;

public class Ex07별찍기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		for(int j = 1; j <= 1~5 ; j++) {
//			System.out.println("★");
//		}
//		System.out.println();
//		이게 반복
		
		
		for(int i = 1; i <=5 ; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		
//		for(int i = 1; i <= 5; i++) {
//		System.out.println("*".repeat(i));
		
		
		// 역순으로 별찍기
		
		for(int i = 5; i>=1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		// 오른쪽 정렬
		// System.out.print(" ");
		// System.out.print(" ");
		// System.out.print(" ");
		// System.out.print(" ");
		// System.out.print(" ");
		
//		for(int j = 1; j<= 5~1; j++){
//			System.out.print(" ");
//		}
		
		// System.out.print("★");
		
//		for(int j = 1; j<= 1~5; j++){
//			System.out.print("★");
//		}
		
		// System.out.println();
		// 이거 반복
		
//		for(int i = 1; i <= 5; i++) {
//			for(int j = 1; j<= 5 + 1 - i; j++){
//			System.out.print(" ");
//			}
//			for(int j = 1; j <= i; j++){
//			System.out.print("★");
//			}
//			System.out.println();
//		}
		
		for(int i = 5; i>=1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
				for(int k = 5; k >= i; k--) {
					System.out.print("★");
			}
		System.out.println();
		}
		
		
	}

}
