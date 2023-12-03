package 보충수업;

public class PDYJajangmyeon extends PBKJajangmyeon{
	// 추상 클래스를 상속받으면 반드시 추상 메서드를 구체화시켜줘야한다(오버라이딩이 의무임)
	// 추상 메서드를 각 자식 클래스에서 구현해야되는 강제성이 부여됨!
	@Override
	public void makeJajang() {
		// TODO Auto-generated method stub
		System.out.println("30년 전통! 짜장면 + 짬뽕! 짜짬뽕!");
	}

}
