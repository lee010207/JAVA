package 책관리프로그램;

public class Book {
	
	// 1) 필드
	private String title;
	private int price;
	private String writer;
	
	
	// 2) 메서드
	
	// 생성자(기본 생성자 X)
	public Book(String title, int price, String writer) {
		this.title = title;
		this.price = price;
		this.writer = writer;
	}
	
	// 기본 생성자 만들어줌
	// main ---> Book b1 = new Book();  
	// 이렇게 객체 생성하려면 따로 써줘야돼 
	public Book() {
		
	}
	
	// getter : 필드에 있는 값을 메인으로 돌려줌
	public String getTitle() {
		return title;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getWriter() {
		return writer;
	}
	

	
}
