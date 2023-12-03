package ex02do_while;

import java.util.Scanner;

public class Ex03Login프로그램 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String ID = "Hello";
		String PW = "1234";
		
		do {
			System.out.print("ID : ");
			String id = sc.next();               // 문자열 입력 : sc.next();
			System.out.print("PW : ");
			String pw = sc.next();
			
			if(id.equals(ID) && pw.equals(PW)) {                    
			// 문자열 비교 : 비교하고싶은거내답.equals(비교대상정답)
				
				System.out.println("로그인 성공");
				break;
			}else {
				System.out.println("아이디 또는 비밀번호 틀림");
			}
		}while(true);
		sc.close();
	}

}
