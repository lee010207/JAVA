package 게임만들기;

public class GameDummy implements GameRule {
	// 인터페이스 실행시키기
	// 틀만 만들어 놓고 개발자2한테 안에 로직을 받았을 때 갈아끼워지게만 만들어주기
	
	@Override
	public int random() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getQuizMsg() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean checkAnswer(int ans) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
