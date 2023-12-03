package ex01상속;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		상속 : 부모클래스의 코드를 자식클래스에서 물려받아 사용하는 것
		
		프로그래밍에서는 상속을 단순히 물려받는거에 그치는게 아니라 물려받은 후 
		자식클래스의 특성에 맞게 확장시키는 개념으로 생각함
		
		자바의 상속을 할때는 extends 키워드 사용!
		
		부모클래스를 Super Class 라고 부르고
		자식클래스를 Sub Class 라고 부름
		
		<예외>
		- 메소드나 필드 앞에 private라고 되어있으면 물려받지 못함
		- 클래스명 앞에 final이라고 적혀 있으면
		  이 클래스는 최종수정이 되면 안되는 클래스를 의미 --> 상속 불가능
		
		<<상속의 특징>>
		(1) 동시에 두개 이상의 상속을 받을 수 없다
		(2) 상속을 여러번 해주는 것은 상관없다
		    a <- b <- c <- d <- e <- f
		(3) 모든 클래스는 최상위 부모로 Object 클래스를 갖는다
		
		 */
		
		
		Animal a = new Animal();
		a.swim();   // swim이 private 메서드면 상속 못받아
		// a.grooming;   --> 이건 안돼(grooming은 자식한테 있는 거니까)
		
		Cat c = new Cat();
		c.swim();
		c.grooming();
	}

}
