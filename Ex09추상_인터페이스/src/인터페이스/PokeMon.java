package 인터페이스;

public interface PokeMon {
	// 포켓몬 게임 만들자
	// 포켓몬 게임에 들어있는 모든 캐릭터들은 
	// 공격, 특수공격을 할 수 있어야 돼
	
	// 인터페이스
	// 1) 필드 : 절대 변하지 않을 것들만
	// ex) 주민 번호, 성별
	// final String name = "홍길동";
	// final 키워드 사용
	
	// 2) 메서드( only 추상 메서드)
	// 일반 공격 : atk()
	public abstract void atk();
	
	// 특수 공격 : specialAtk()
	public abstract void specialAtk();
	
}
