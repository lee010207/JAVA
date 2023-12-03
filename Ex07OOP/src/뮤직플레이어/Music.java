package 뮤직플레이어;

public class Music {
	// 1)가수명(String) 2)노래제목(String) 3)출시년도(int) 4)시간(int) 5)노래경로
	private String singer;
	private String title;
	private int year;
	private int time;
	// 외부로부터 접근을 바로 못하고 클래스에서만 접근할 수 있게 제한하는 접근제한자 : private
	private String path;
	

	public String getSinger() {
		return singer;
	}



	public void setSinger(String singer) {
		this.singer = singer;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public int getYear() {
		return year;
	}



	public void setYear(int year) {
		this.year = year;
	}



	public int getTime() {
		return time;
	}



	public void setTime(int time) {
		this.time = time;
	}

	
	//  노래경로 겟터/세터 만들어주기	
	public String getPath() {
		return path;
	}



	public void setPath(String path) {
		this.path = path;
	}

	
	// 똑같은 이름의 메서드를 정의할 수, 또 만들 수 있는 방법 : 오버로딩 
	// (1) 매개변수 개수가 다름
	// (2) 매개변수의 데이터 타입이 다름
	// 둘 중에 하나만 만족하면 만들 수 있음
	// 리턴타입이랑은 전혀 상관 없음 only 매개변수만 관여함!!
	// 왜 써? : 동일하게 획일화 해서 쓰기 위해서, 사용자 입장에서 편리(여러 이름을 외울 필요가 없어)
	public Music(String singer, String title, int year, int time, String path) {
		super();
		this.singer = singer;
		this.title = title;
		this.year = year;
		this.time = time;
		this.path = path;
	}



	// 필수값(필드)을 기본으로 넣어서 객체를 만들어주는 생성자
	// 자동완성 : alt + shift + s -> generate constructor using fields
	public Music(String singer, String title, int year, int time) {
		super();
		this.singer = singer;
		this.title = title;
		this.year = year;
		this.time = time;
	}
	
	
	
	
}
