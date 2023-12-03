package ex01while;

import java.util.Scanner;

public class Ex03다이어트 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("현재몸무게 : ");
		int Nweight = sc.nextInt();
		
		System.out.print("목표몸무게 : ");
		int Gweight = sc.nextInt();
		
		int n = 1;
		while (true) {
			System.out.print(n + "주차 감량 몸무게 : ");
			int weight = sc.nextInt();
			Nweight = Nweight - weight;
			n++;
			if (Gweight >= Nweight) {
				System.out.println(Nweight + "kg 달성!! 축하합니다!");
				break;
			}
		}
		sc.close();
		
		
//		int cnt = 1;  //주차를 기록할 변수
//		while(nowKg > goalKg) {
//			int minus = 0;
//			System.out.println(cnt + "주차 감량 몸무게 : ");
//			minus = sc.nextInt();
//			cnt++;
//			//nowKg = nowKg - minus;
//			nowkg -= minus;
//		}
//		System.out.println(nowKg + "kg 달성!! 축하합니다!");
	}

}
