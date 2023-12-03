package ex03다중if_else;

public class Ex01다중if_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 다중 if - else : 조건이 여러가지일 때!
		int myMoney = 1000 ;
		
		if (myMoney >= 5000) {
			System.out.println("생과일 주스");
		}else if (myMoney >= 4000){
			System.out.println("레몬에이드");
		}else if (myMoney >= 3000) {
			System.out.println("아이스 아메리카노");
		}else if (myMoney >= 2000){
			System.out.println("삼다수");
		}else {
			System.out.println("못 먹어");
		}
	}

}
