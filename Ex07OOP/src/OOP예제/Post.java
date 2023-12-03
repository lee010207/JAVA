package OOP예제;

public class Post {
	String author;
	String contents;
	int likes;
	
	public void like() {
		System.out.println("좋아요 클릭");
		likes++;
	}
}
