package ex03animal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1 = new Animal();
		a1.move();
		
		Bird b1 = new Bird();
		b1.move();
		
		Penguin p1 = new Penguin();
		p1.move();
		p1.cry();
		
		Animal a2 = new Bird();
		a2.cry();
		
		Bird b2 = (Bird)a2;
		b2.egg();
		
		Animal p2 = new Penguin();
		p2.move();
	}

}
