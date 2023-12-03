package 상품관리프로그램;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// 자료형 -> 데이터를 담을 수 있는 형태
		Product p1 = new Product();

		/*
		Product [] pdList = new Product[5];
		int j= 0;
		while(true) {
			System.out.print("[1]물건 추가 [2]예산 판매량 조회 [3]종료 >> ");
			int select = sc.nextInt();
			if(select == 1) {
				System.out.print("물건 이름 : ");
				String pdname = sc.next();
				 
				System.out.print("단가 : ");
				int pdprice = sc.nextInt();
				 
				System.out.print("수량 : ");
				int pdamount = sc.nextInt();
				
				Product pd = new Product(pdname, pdprice, pdamount);
				
				pdList[j] = pd;
				j++;

			}
			else if(select == 2) {
				System.out.println("제품명     단가     수량");
				int sum =0;
				for(int i = 0; i < j; i++) {
					System.out.print(pdList[i].getName() + "\t");
					System.out.print(pdList[i].getUnitPrice()+ "\t");
					System.out.print(pdList[i].getAmount() + "개");
					System.out.println();
					sum += pdList[i].getUnitPrice() * pdList[i].getAmount();
				}
				System.out.println("판매총액 : " + sum);
			}
			else if(select == 3) {
				System.out.println("프로그램 종료.");
				break;
			}else {
				System.out.println("잘못 입력");
			}
		}
		*/
		
		
		// ================================================================
		// 다른 풀이
		Product g1 = new Product();
		
		// 캡슐화 : 다이렉트로 필드를 접근하지 않고 안전을 위해 우회해서 접근 --> 데이터를 넣음
		g1.setName("만년필");
		g1.setUnitPrice(150000);
		g1.setAmount(10);
		
		// --> g1.name = "만년필"; 이렇게 직접접근하지 않고 우회 접근하는 이유
		// 데이터 전처리 가능 : 메서드를 통해 조건문으로 들어가는 데이터를 걸러줄 수 있음
		
		ArrayList<Product> gList = new ArrayList<>();
		
		while(true) {
			System.out.print("[1]물건 추가 [2]예산 판매량 조회 [3]종료 >> ");
			int menu = sc.nextInt();
			if(menu == 1) {
				System.out.print("물건 이름 : ");
				String name = sc.next();
				System.out.print("단가 : ");
				int unitPrice = sc.nextInt();
				System.out.print("수량 : ");
				int amount = sc.nextInt();
				
				Product g = new Product(name, unitPrice, amount);
				// 새로운 값이 들어오면 그 전에 값들은 삭제됨
				// 차곡차곡 저장해놓을 공간 필요 : 배열  --> 크기고정
				// 크기가 변하는 가변 배열 사용
				gList.add(g);
				// ArrayList 안에 뒤로 쌓임
			}else if(menu == 2) {
				System.out.println("제품명\t단가\t수량");
				int sum = 0;
				for(int i = 0; i < gList.size(); i++) {
					System.out.print(gList.get(i).getName() + "\t"); 
					System.out.print(gList.get(i).getUnitPrice() + "\t"); 
					System.out.print(gList.get(i).getAmount() + "개");
					System.out.println();
					sum += gList.get(i).getUnitPrice()*gList.get(i).getAmount();
				}
				System.out.println("판매총액 : " + sum);
			}else if(menu == 3) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			}

		}
	}

}
