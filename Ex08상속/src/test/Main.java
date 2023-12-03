package test;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        goBusan(new Train());
        goBusan(new Bus());
        goBusan(new Walk());
		
	}
    
    public static void goBusan(Vehicle v){
        v.go();
    }
		
	

}
