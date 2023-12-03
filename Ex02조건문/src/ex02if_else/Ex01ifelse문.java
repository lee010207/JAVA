package ex02if_else;

public class Ex01ifelse문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if-else
		// 참일 때와 거짓일 때 두 분류 상황에서 제어를 하고 싶을 때 사용하는 조건문 : true거나 false 두 가지뿐인 경우
		
		int num = 10;
		if(num % 2 == 1) {
			System.out.println(num + "는(은) 홀수입니다.");
		}else {
			System.out.println(num + "는(은) 짝수입니다.");
		}
		// else는 조건식이 필요없음 : if 조건식에 해당되지 않을 경우 모두 else로 넘어오기 때문
	}

}
