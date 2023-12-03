package OOP예제;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Post p = new Post();
		p.likes = 0;
		System.out.println(p.likes);
		
		for(int i = 1; i <=5; i++){
	         p.like();
	    }
		
		System.out.println(p.likes);
	}

}
