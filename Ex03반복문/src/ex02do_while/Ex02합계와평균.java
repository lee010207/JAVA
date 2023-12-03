package ex02do_while;

import java.util.Scanner;

public class Ex02합계와평균 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;           // 입력한 숫자를 누적할 변수
		int cnt = 0;           // 입력한 숫자의 개수를 카운팅할 변수
		do {
			System.out.println("숫자를 입력하세요");
			int num = sc.nextInt();
			if(num > 100) {
				break;
			}
			sum += num;
			cnt++;
		}while(true);
		
		double avg1 = (float)sum/(float)cnt;
		int avg2 = (int)(avg1 * 100);            //소수점 두자리수 남기기
		double result = avg2 / 100.0;            //그냥 100으로 나누면 정수형으로 나누는 거라 결과값이 정수형!
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + result);
		
		// System.out.println("평균 : " + sum * 1.0 / cnt);
		// 앞에서부터 연산이 일어나니까 sum이 실수형으로 형변황 -> 정수형이랑 나누니까 실수형태로 나옴
		// System.out.println("평균 : " + (double)sum / cnt);
		
		sc.close();
	}

}
