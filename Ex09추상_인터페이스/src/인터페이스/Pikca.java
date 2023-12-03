package 인터페이스;

public class Pikca implements PokeMon{
	// 피카츄 캐릭터를 사장님이 주신 인터페이스를 통해 완성하기
	// 인터페이스를 사용하는 키워드 : implements(구현)
	
	// 인터페이스는 반드시 추상메서드, 상수만 포함할 수 있음
	// 인터페이스는 다중 상속이 가능!!
	// --> 기능 확장을 용이하게 만들기 위해서
	
	// 반드시 구현해야 되는 메서드 추가(추상 클래스 상속할 때)
	// 인터페이스도 추상 클래스와 마찬가지로 구현을 강제화하고 있음
	// 추상클래스보다 구현을 훨씬 강조하는 형태
	@Override
	public void atk() {
		// TODO Auto-generated method stub
		System.out.println("펀치");
	}

	@Override
	public void specialAtk() {
		// TODO Auto-generated method stub
		System.out.println("백만볼트");
	}

}
