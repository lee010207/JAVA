package 게임만들기;

import java.util.Random;

public class PlusGame implements GameRule{
	
	int num1;
	int num2;
	
	Random rd = new Random();
	
	@Override
	public int random() {
		// TODO Auto-generated method stub
		return rd.nextInt(9) + 1;
	}

	@Override
	public String getQuizMsg() {
		// TODO Auto-generated method stub
		num1 = random();
		num2 = random();
		
		return num1 + " + " + num2;
	}

	@Override
	public boolean checkAnswer(int ans) {
		// TODO Auto-generated method stub
		
		if(ans == (num1 + num2)) {
			return true;
		}else {
			return false;
		}
	}

}
