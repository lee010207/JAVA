package 성적관리프로그램;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		ArrayList<Student> list = new ArrayList<>();
		
		
		
		System.out.println("============성적 관리 프로그램==============");
		while(true) {
			System.out.print("[1]성적입력 [2]전체조회 [3]학생검색 [4]프로그램 종료 >> ");
			int menu = sc.nextInt();
			if(menu == 1) {
				System.out.print("이름 : ");
				String name = sc.next();
				
				System.out.print("학번 : ");
				String number = sc.next();
				
				System.out.print("Java 점수 : ");
				int java = sc.nextInt();
				
				System.out.print("Web 점수 : ");
				int web = sc.nextInt();
				
				System.out.print("Android 점수 : ");
				int and = sc.nextInt();
				
				Student sd = new Student(name, number, java, web, and);
				list.add(sd);
				
			}else if( menu == 2) {
				System.out.println("================전체 조회==============");
				
				if(list.size() > 0) {
					System.out.println("이름\t학번\tJava\tWeb\tAndroid");
					for(int i = 0; i < list.size(); i++) {
						System.out.print(list.get(i).getName() + "\t");
						System.out.print(list.get(i).getNumber() + "\t");
						System.out.print(list.get(i).getScoreJava() + "\t");
						System.out.print(list.get(i).getScoreWeb() + "\t");
						System.out.println(list.get(i).getScoreAndroid());
						
					}

				}else {
					System.out.println("조회할 데이터가 없습니다.");
				}
				System.out.println("====================================");
			}else if(menu == 3) {
				System.out.print("검색할 이름 입력 : ");
				String search = sc.next();
				int temp = 0;
				for(int i = 0; i < list.size(); i++) {
					boolean IsName = search.equals(list.get(i).getName());
					
					if(IsName) {
						System.out.print(list.get(i).getName() + "\t");
						System.out.print(list.get(i).getNumber() + "\t");
						System.out.print(list.get(i).getScoreJava() + "\t");
						System.out.print(list.get(i).getScoreWeb() + "\t");
						System.out.println(list.get(i).getScoreAndroid());
					}else{
						temp++;
					}
				}
				if(temp == list.size()) {
					System.out.println("검색한 이름의 정보가 없습니다.");
				}

			}else if(menu == 4) {
				System.out.println("프 로 그 램 종 료");
				break;
			}else {
				System.out.println("잘못 입력 다시 입력");
			}
		}
		
	}

}
