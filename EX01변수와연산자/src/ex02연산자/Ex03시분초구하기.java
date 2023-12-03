package ex02연산자;

import java.util.Scanner;

public class Ex03시분초구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3723 -> 1시 2분 3초
		// 단축키 sc -> ctrl+space -> enter
		Scanner sc = new Scanner(System.in);
		
		System.out.print("초 입력: ");
		int totalSecond = sc.nextInt();
		int hour = totalSecond / 3600 ;
		int minute = totalSecond % 3600 / 60;
		int second = totalSecond % 3600 % 60 % 60 ;
		
		System.out.print(hour+"시"+ minute+"분"+ second+"초");
		
		
	}

}
