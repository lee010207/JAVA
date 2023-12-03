package 상품관리프로그램;

public class Product {
	private String name;
	private int unitPrice;
	private int amount ;
	
	// 생성자 --> Product
	// : 객체를 생성하는 역할
	// 객체를 생성할 때 반드시 한 번만 호출 된다
	// -> 기본 생성자가 (만들어졌기)존재하기 때문에 컴파일러가 자동으로 불러와줌

	public Product(String name, int unitPrice, int amount) {
		this.name = name;
		this.unitPrice = unitPrice;
		this.amount = amount;
	}
	
	public Product() {
		
	}
	
	// 데이터 값을 돌려주는 메서드 : getter
	public String getName() {
		return name;
	}
	
	public int getUnitPrice() {
		return unitPrice;
	}
	
	public int getAmount() {
		return amount;
	}
	
	// 다른 풀이
	// main에서 전달인자를 받아와 필드에 집어넣어주는 메서드 : setter
	public void setName(String name) {
		this.name = name;
		// 현재 클래스를 지칭하는 키워드
	}
	
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	public void setAmount(int amount) {
		if(amount > 0) {
		this.amount = amount;}
	}


}
