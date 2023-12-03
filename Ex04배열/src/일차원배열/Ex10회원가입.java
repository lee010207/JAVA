package 일차원배열;

import java.util.Scanner;

public class Ex10회원가입 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String[] id = new String[1];
		String[] pw = new String[1];
		
		System.out.print("[1]회원가입 [2]로그인 [3]종료 >> ");
		int num = sc.nextInt();
		String ID ;
		String PW ;
		
		if(num == 1) {
			for(int i = 0; i < 1; i++) {
				System.out.print("아이디입력 : ");
				id[i] = sc.next();
				System.out.print("비밀번호입력 : ");
				pw[i] = sc.next();
				System.out.println("가입성공");
			}
		}else if(num == 2) {
			System.out.print("아이디입력 : ");
			ID = sc.next();
			System.out.print("비밀번호입력 : ");
			PW = sc.next();
			for(int i = 0; i < 10; i++) {
				if(ID == id[i] && PW == pw[i]) {
					System.out.println("로그인 성공");
				}else {
					System.out.println("로그인 실패");
				}
			}
		}else {
			System.out.println("프로그램 종료");
		}

	}

}
