package 보충수업;

public class PCHJajangmyeon extends PBKJajangmyeon{
	// 상속 -> 확장 개념 
	// : 부모 클래스 것도 쓸 수 있고 , 자식 클래스 자기 꺼도 쓸 수 있음 
	// => 더 기능이 많아짐

	public void makeGoonManDo() {
		System.out.println("바삭한 군만두~");
	}
	
	public void makeJajang() {
		// 부모 클래스의 메서드 이름은 그대로 , 기능만 재정립(재정의)
		// 부모 클래스 메서드를 자식 클래스에서 재정의(기능) : 오버라이딩
		// --> 상황에 맞게 변화하고 싶어서 사용 : 재정의된 자식 클래스 메서드 기능으로 구현됨
		System.out.println("30년 전통! 짜장면 위에 민트초코 톡");
	}
}
