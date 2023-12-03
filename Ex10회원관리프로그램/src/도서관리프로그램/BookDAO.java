package 도서관리프로그램;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BookDAO {
	//데이터베이스에 접근해서 도서등록에 필요한 데이터들을 저장
	public int insert(BookVO vo) {
		// TODO Auto-generated method stub
		
		// 1) 드라이버 동적로딩
		// 전역변수 처리
		Connection conn = null;
		// conn에다 연결 권한을 받아놓고 계속 사용해줄거임
		PreparedStatement psmt = null;
		// 여기서 작성한 sql문을 데이터베이스(오라클)에다가 실어 보내줄 수레 역할
		int row = 0;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 준비물 3가지 : 주소, 계정(접속할) 아이디, 비밀번호
			
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "shopping";
			String db_pw = "12345";
			
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			
			// 2) SQL문 준비
			String sql = "INSERT INTO BOOK VALUES(?, ?, ?, ?)";
			
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, vo.getTitle());
			psmt.setString(2, vo.getName());
			psmt.setInt(3, vo.getPrice());
			psmt.setString(4, vo.getNum());
			
			row = psmt.executeUpdate();
			// 영향을 받은 행이 있는지에 대한 결과값을 받아옴
			// --> Controller를 통해서 Main에 보내줄거임
			
			
			// 3) 결과값 처리
			
			// 4) 자원 반납
			
		} catch (ClassNotFoundException | SQLException e) {
			// 클래스를 찾아오지 못할 예외사항에 대해 catch문으로 잡아줄거야
			// TODO Auto-generated catch block
			System.out.println("데이터베이스 연결 실패!");
			e.printStackTrace();
		}finally {
			try {
				if(psmt != null) {
					psmt.close();
				}
				if(conn != null) {
					conn.close();
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return row;
		
		// cnt로 결과값을 받고 insert()가 cnt를 리턴해서 Contorller에 전달
		// 데이터베이스 저장 성공여부결과값 처리 --> Controller
		
	}

	public ArrayList<BookVO> select() {
		// TODO Auto-generated method stub
		ArrayList<BookVO> list = new ArrayList<>();
		// 이따 Select 조회 완료되면 담을 틀만 만들어놓음
		
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "shopping";
			String db_pw = "12345";
			
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			
			String sql = "SELECT * FROM BOOK ";
			psmt = conn.prepareStatement(sql);
			
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				String title = rs.getString(1);
				String name = rs.getString(2);
				int price = rs.getInt(3);
				String num = rs.getString(4);
				
				// BookVO 데이터를 관리해줄 가변배열을 만들어줌
				BookVO vo = new BookVO(title, name, price, num);
				list.add(vo);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}finally {
			try {
				if(rs != null) {
					rs.close();
				}
				if(psmt != null) {
					psmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
		// BookVO타입인 ArrayList : list를 반환
	}

	public BookVO selectOne(String title) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		BookVO vo = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "shopping";
			String db_pw = "12345";
			
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			
			String sql = "SELECT * FROM BOOK WHERE TITLE = ?";
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, title);
			
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				String t = rs.getString(1);
				String n = rs.getString(2);
				int p = rs.getInt(3);
				String m = rs.getString(4);
				
				
				vo = new BookVO(t, n, p, m);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}finally {
			try {
				if(rs != null) {
					rs.close();
				}
				if(psmt != null) {
					psmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return vo;
	}
}
