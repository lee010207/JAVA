package 학생정보관리프로그램;

public class StuInfo {
	// 학생정보관리프로그램에 대한 설계도
	
	// 1) 필드 : 캡슐화 하기(private으로 감싸주기)
	private String name;
	private String number;
	private int age;
	private int scoreJava;
	private int scoreWeb;
	private int scorePython;
	// private : 클래스 내부에 메서드(겟터,세터)를 통해서만 접근이 가능
	// ---> setter 사용은 지양함 
	// : 데이터의 무결성(정확성/일관성)을 지켜주기 위해프라이빗 데이터를 함부로 바꾸면 안돼
	// getter / setter : 데이터의 무결성(정확성/일관성)
	
	// 단축키 : alt + shift + s 
	// --> generate getters and setters
	// --> 생성하고 싶은 겟터, 세터 선ㅌ 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScoreJava() {
		return scoreJava;
	}

	public void setScoreJava(int scoreJava) {
		this.scoreJava = scoreJava;
	}

	public int getScoreWeb() {
		return scoreWeb;
	}

	public void setScoreWeb(int scoreWeb) {
		this.scoreWeb = scoreWeb;
	}

	public int getScorePython() {
		return scorePython;
	}

	public void setScorePython(int scorePython) {
		this.scorePython = scorePython;
	}
	
	// main 전달인자 받을 매개변수 있는 새로운 생성자 만들어주기
	public StuInfo(String name, String number, int age, 
	         int scoreJava, int scoreWeb, int scorePython) {
	      // main으로 부터 받아온 매개변수를 현재 필드에 대입
	      this.name = name;
	      this.number = number;
	      this.age = age;
	      this.scoreJava = scoreJava;
	      this.scoreWeb = scoreWeb;
	      this.scorePython = scorePython;
	   }

	
	// 학생정보 출력해주는 메서드 만들기 : 출력기능 ---> void
	public void show() {
		System.out.println(name + "님 안녕하세요!");
		System.out.println("[ " + number + ", " + age + "살 ]");
		System.out.println(name + "님의 Java 점수는 " + scoreJava + "점 입니다.");
		System.out.println(name + "님의 Web 점수는 " + scoreWeb + "점 입니다.");
		System.out.println(name + "님의 Python 점수는 " + scorePython + "점 입니다.");
		System.out.println("================================");
	}
}
