package ex02상속실습;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beginner b = new Beginner();
		b.level = 8;
		b.nickName = "자바자바";
		b.hp = 200;
		b.exp = 50;
		b.mp = 321;
		
		b.snailThrow();
		b.agileMovement();
		
		Warrior w = new Warrior();
		w.level = 15;
		w.nickName = "타락파워전사";
		w.hp = 800;
		w.mp = 100;
		w.exp = 730;
		
		w.smash();
		w.snailThrow();
		
		Wizard a = new Wizard();
		a.snailThrow();
		a.energyBolt();
	}

}
