package 도서관리프로그램;

import java.sql.ResultSet;
import java.util.ArrayList;

public class Controller {
	
	// View랑 Model(DAO)가 소통할 수 있는 중간다리
	
	// 도서등록 : con.insert(vo)로 Main에서 보내준 vo를 받아서
	// --> vo를 받으면 BookDAO 객체 dao를 만들어서
	// --> BookDAO의 메서드인 dao.insert()에 vo를 전달 개념
	// : Main에서 보내준 vo를 받아서 DAO로 보내주는 역할
	// Controller가 main에 있는 vo를 받아줄 수 있는 메서드 insert() 만들어주기
	public void insert(BookVO vo) {
		//BookVO 자료형인 vo를 매개변수로 받아줌
		BookDAO dao = new BookDAO();
		int row = dao.insert(vo);
		
		if(row > 0) {
			System.out.println("도서등록 완료");
		}else {
			System.out.println("도서등록 실패");
		}
	}

	public void select() {
		// TODO Auto-generated method stub
		BookDAO dao = new BookDAO();
		
		ArrayList<BookVO> list = dao.select();
		System.out.println("----------------------------");
		System.out.println("책이름\t책저자\t책가격\t책번호");
		System.out.println("----------------------------");
		
		// 배열 내 데이터 출력
		for(int i = 0; i <list.size(); i ++) {
			System.out.print(list.get(i).getTitle() + "\t");
			System.out.print(list.get(i).getName() + "\t");
			System.out.print(list.get(i).getPrice() + "\t");
			System.out.println(list.get(i).getNum() + "\t");
		}
		// con.select() 결과 --> ArrayList list 내 데이터 출력
		System.out.println();
	}

	public void selectOne(String title) {
		// TODO Auto-generated method stub
		BookDAO dao = new BookDAO();
		BookVO vo = dao.selectOne(title);
		
		System.out.println("책이름\t책저자\t책가격\t책번호");
		System.out.print(vo.getTitle() + "\t");
		System.out.print(vo.getName() + "\t");
		System.out.print(vo.getPrice() + "\t");
		System.out.println(vo.getNum() + "\t");
	}
}