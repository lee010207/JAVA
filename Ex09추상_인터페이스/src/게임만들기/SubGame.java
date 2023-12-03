package 게임만들기;

import java.util.Random;

public class SubGame implements GameRule {
	int num1;
	int num2;
	
	@Override
	public int random() {
		// TODO Auto-generated method stub
		Random rd = new Random();
		
		return rd.nextInt(10) + 1;
		
	}

	@Override
	public String getQuizMsg() {
		// TODO Auto-generated method stub
		num1 = random();
		num2 = random();
		if(num1 > num2) {
			return num1 + " - " + num2;
		}else {
			return num2 + " - " + num1;
		}
	
	}

	@Override
	public boolean checkAnswer(int ans) {
		// TODO Auto-generated method stub
		if(num1 > num2) {
			if(ans == (num1 - num2)) {
				return true;
			}else {
				return false;
			}
		}else {
			if(ans == (num2 - num1)) {
				return true;
			}else {
				return false;
			}
		}
	}
	
}
