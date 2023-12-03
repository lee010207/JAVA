package ex03animal;

public class Bird extends Animal {
	// 조류의 설계도
	// 조류는 동물이 가진 기능을 다 가질 수 있다!
	// 조류도 울고, 움직이고, 숨쉬고, 이름, 성별도 있음
	// 동물이 위의 데이터, 기능을 이미 다 가지고 있음
	// 상속에서 사용되는 키워드 : extends(확장하다)
	
	// 알을 낳다.
	public void egg() {
		System.out.println("풍풍");
	}

	
	// 오버라이딩
	// move를 물려받긴 할건데
	// 안에 들어있는 로직(구현되는 기능, 행위)을 다르게 만들고 싶다
	// : 상속 관계에서 메서드를 재정의 (구현을 다르게, 로직을 다르게)
	// 하는 것을 오버라이딩이라고 한다.
	// 단, 같은 이름을 사용해야한다.
	
	// 단축키 : alt + shit + s
	
	@Override  // 어노테이션 : 오버라이딩 여부 확인 가능
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("날아 씽씽");
	}
	
	

	
}
