package 도서관리프로그램;

public class BookVO {
	// 제목, 저자, 가격, 번호
	// 이걸 한번에 묶어줄 수 있는, 담아줄
	// BookVO 자료형(객체) 만들어주기!
	
	private String title;
	private String name;
	private int price;
	private String num;
	
	public String getTitle() {
		return title;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public String getNum() {
		return num;
	}
	
	public BookVO(String title, String name, int price, String num) {
		super();
		this.title = title;
		this.name = name;
		this.price = price;
		this.num = num;
	}
}
