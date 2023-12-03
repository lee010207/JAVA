package ex04switch;

import java.util.Scanner;

public class Ex04최종조건문실습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("금액을 입력하세요.");
	      int inputMoney = sc.nextInt();
	      
	      System.out.println("메뉴를 고르세요");
	      System.out.print("1.콜라(800원) 2.생수(500원) 3.비타민워터(1500) >> ");
	      int menu = sc.nextInt();
	      
	      // 잔돈이 저장될 변수
	      int changeMoney = 0;
	     
	      if(menu == 1) {
	          
	          if(inputMoney >= 800) {
	             changeMoney = inputMoney - 800;
	          }else {
	             changeMoney = inputMoney;
	             System.out.println("돈이 부족해요ㅠㅠ");
	          }
	          
	       	 }else if(menu == 2) {

	          if(inputMoney >= 500) {
	             changeMoney = inputMoney - 500;
	          }else {
	             changeMoney = inputMoney;
	             System.out.println("돈이 부족해요ㅠㅠ");
	          }
	          
	       	 }else if(menu == 3) {
	          
	          if(inputMoney >= 1500) {
	             changeMoney = inputMoney - 1500;
	          }else {
	             changeMoney = inputMoney;
	             System.out.println("돈이 부족해요ㅠㅠ");
	          }
	          
	       	 }
	      System.out.println("잔돈: " + changeMoney + "원");
	      
	      int cheon = changeMoney / 1000;
	      int ohbaek = changeMoney % 1000 / 500 ;
	      int baek = changeMoney % 1000 % 500 / 100;
	      
	      System.out.println("천원: "+ cheon + "개, 오백원: " + ohbaek + "개, 백원: " + baek + "개");
	      sc.close();
	      
	    /* 잔돈 부족 알림
	     
	      if(menu == 1) {
	         changeMoney = inputMoney - 800;
	      }else if(menu == 2) {
	         changeMoney = inputMoney - 500;
	      }else if(menu == 3) {
	         changeMoney = inputMoney - 1500;
	      }if(changeMoney < 0) {
	    	  System.out.println("돈이 부족해요!");
	    	  System.out.println("잔돈 : " + inputMoney + "원");
	      }else {
	    	  System.out.println("잔돈 : " + changeMoney + "원");
	      }
	      
	     */
	      
	      
		/*
		System.out.println("금액을 입력하세요.");
		int money = sc.nextInt();
		
		System.out.println("메뉴를 고르세요");
		System.out.print("1.콜라(800원) 2.생수(500원) 3.비타민워터(1500원) >> ");
		int menu = sc.nextInt();
		
		switch (menu) {
		case 1 :
			System.out.println("잔돈 : " + (money - 800) + "원");
			break;
		case 2 : 
			System.out.println("잔돈 : " + (money - 500) + "원");
			break;
		case 3 :
			System.out.println("잔돈 : " + (money - 1500) + "원");
			break;
		default :
			System.out.println("메뉴는 3가지 입니다!!");
		}
		*/
		
	}

}
