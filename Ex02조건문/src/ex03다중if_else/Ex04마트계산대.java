package ex03다중if_else;

import java.util.Scanner;

public class Ex04마트계산대 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("상품 개수를 입력하세요 >> ");
		int cnt = sc.nextInt();
		System.out.print("금액을 입력하세요 >> ");
		int pay = sc.nextInt();
		
		if(cnt >= 11) {
			System.out.println((int)(cnt*pay*0.9) +"원이 결제됩니다.");
		}else {
			System.out.println((cnt*pay) +"원이 결제됩니다.");
		}
	}

}
