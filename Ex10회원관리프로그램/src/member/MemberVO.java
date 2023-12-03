package member;

public class MemberVO {
	// id, pw, nick 한번에 묶어서 가지고 있게
	// 사용자 정의형 데이터 타입을 만들어줄 객체를
	// 생성해주는 클래스(MemberVO) 만들어줌
	
	private String id;
	private String pw;
	private String nick;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	
	public MemberVO(String id, String pw, String nick) {
		this.id = id;
		this.pw = pw;
		this.nick = nick;
	}
	
	
}
