package 보충수업;

public abstract class PBKJajangmyeon {
	public abstract void makeJajang();
}
// 자식 클래스에서 알아서 다 구체화시키니까(각자 기능을 따로 만드니까)
// 굳이 부모 클래스가 기능을 가질 필요가 없음 => 추상 클래스로 만들어 줌
// 추상 메서드 쓰려고 : 틀만 가진 메서드