package 학생정보관리프로그램;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Student 클래스를 사용하는 곳!
		StuInfo stu1 = new StuInfo("나예호", "20200801", 20, 10, 80 ,95);
		StuInfo stu2 = new StuInfo("김운비", "20111003", 19, 90, 65, 30);
		
		stu1.show();
		stu2.show();
	}

}
