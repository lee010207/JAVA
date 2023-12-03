package 일차원배열;

import java.util.Random;
import java.util.Scanner;

public class Ex09로또 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		int[] lotto = new int[6];

		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = rd.nextInt(10) + 1;   // 0~9(+1) : 1~10 범위 지정
			//다시 랜덤한 숫자를 재할단 --> 중복 제거
			for(int j = 0; j < i; j++) { 
			// 자기 자신의 앞쪽 인덱스값들이랑만 비교해서 똑같으면 재할당
				if(lotto[i] == lotto[j]) {
				// lotto[i] : 새로 입력되고 있는 값
				// lotto[j] : 이미 앞쪽에 입력되어있는 값(랜덤수 할당됨)
	
					i--;
					// 앞에 있는 인덱스 값이랑 비교하라고
					// 내가 인덱스2면 -> 인덱스 0이랑 인덱스 1이랑 비교
					// 만약에 같은 숫자가 있으면 인덱스 3으로 넘어가지 않고 내자리(인덱스2)를 다시 뽑음 --> 앞에 같은 숫자가 없을 때까지
					break;
					// 앞에 똑같은 숫자가 있으면 비교for문 멈추고 랜덤할당for문으로 
					// break없어도 잘 돌아가는데 break여부에 따라 뭐가 다를까...?
				}
			}
		}
		
		for(int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		
	}

}
