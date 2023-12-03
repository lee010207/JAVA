package member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class memberDAO {

	// 데이터베이스에 연결하고 사용하는 것을 담당하는 클래스
	// DAO클래스가 모든 JDBC 기능을 수행
	
	
	public int join(String id, String pw, String nick) {
		// TODO Auto-generated method stub
		
		
		// 1. 드라이버 설치(동적로딩) :  불러올 경로 입력
		// java에서 오라클 dbms를 쓰기 위한 jdbc 설치하는 코드
		// 오라클 폴더안에 jbdc 폴더 안에 driver폴더 안에 oracledriver 클래스 가져와라
		// Class.forName("oracle.jdbc.driver.OracleDriver");
		// 이렇게만 쓰면 오류 --> 예외사항 발생
		// 왜? : 오타가 있거나 파일이 존재하지 않을때 클래스를 못찾을 수 있음
		
		// try 밖에서도(다른 곳 -> finally 에서도) 쓸 수 있게 해주려고 여기다 선언
		int cnt = 0;
		Connection conn =null;
		PreparedStatement psmt = null;
		
		
		// 0. 드라이버 파일을 프로젝트 안에 넣어주기
		// try 안에다가 작성 : 예외사항 처리
		try {
			// (1) 드라이버 설치
			// 왜 동적 로딩??
			// : 컴파일러는 아래의 코드를 만나기 전까지 어떠한 DBMS에
			//   드라이버를 사용하는지 모르고 아래의 코드를 만나는 순간
			//   해당 드라이버를 찾아서 설치를 한다
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. 커넥션 열기
			// - DB가 존재하는 url(주소) , ID(DB 계정) , 비밀번호(DB계정 접속 비번) 필요!!
			// database에 접근할 수 있는 포트번호 : 1521
			// 오라클 별칭 : xe
			// MariaDB 별칭 : mdb
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "shopping";
			String db_pw = "12345";
			
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			// 연결에 실패한 경우 -> id, pw 틀리거나 url이 잘못된 경우 : null을 반환
			// 이외의 예외 사항 처리 --> add catch clause surrounding try
			
			if(conn != null) {
				System.out.println("DB연결 성공");
			}else {
				System.out.println("DB연결 실패");
			}
			// 3. SQL문 실행
			// SQL문을 실행하기 위한 조건!!
			// (1) SQL문장이 이상이 없는지 검토를 받아야함
			String sql = "INSERT INTO MEMBER VALUES(?,?,?)";
			// ( )안에 값은 사용자가 입력한 거에 따라 계속 바뀌니까 ?로 둠
			
			// sql문장에 이상이 있는 경우 : 여기서 오류가 나면
			// 이 밑에 있는 코드는 실행이 안되고
			// catch(SQLException e) 여기로 넘어감
			// connection 연결은 위에 있으니까 계속 실행되고 있음
			// ~~
			
			// conn이 대부분 데이터베이스 권한을 다 가지고 있음
			// --> conn한테 이상 없는지 검토 요청
			// conn.prepareStatement(sql);
			// + 검토 후 이상이 없으면 사용자가 입력한 데이터로 ?자리에 넣어줘야 함
			psmt = conn.prepareStatement(sql);
			// psmt 객체 : sql문을 완성하고 실행할 수 있는 객체임
			// - 1) sql문 완성시키기
			// DB는 1부터 시작 --> ?에 번호가 붙음
			psmt.setString(1, id);           // 첫번째 값(?)을 id로 채워라 
			psmt.setString(2, pw);           // 두번째 값(?)을 pw로 채워라 
			psmt.setString(3, nick);           // 세번째 값(?)을 nick로 채워라 
			
			// - 2) sql문 실행
			// executeUpdate() : sql 문장을 실행하는 메서드
			// 실행한 문장의 개수를 int형태로 반환
			cnt = psmt.executeUpdate();
			// 성공하면 1이 담기고, 실패하면 0이 담김
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 예외사항 해결 방법 : surround with try/catch
		// try에 예외사항이 발생할 만한 코드를 작성
		// catch : 해당 예외사항이 발생하면 오류를 감지 및 포착
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// ~~
			// try 잘 실행되거나
			// 또는 오류나서 중간에 catch로 넘어간다고 하더라도
			// finally에는 마지막에 반드시 넘어오게 만들어주기
			
			// 4. 연결끊기
			// -> 연결을 끊을 때는 역순으로 끊어준다
			try {
				if(psmt != null) {
					psmt.close();
				}
				// 무조건 닫아줄 필요 없으니까 null 아닐 때만 닫아주기
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			// psmt.close();
			// 오류 : try-catch 밖에 있으니까 예외처리가 안돼
			// 해결 -> 따로 예외 처리해줌 : surround with try-catch
			
		}
		
		return cnt;
	}

	public int delete(String id, String pw) {
		// TODO Auto-generated method stub
		int cnt = 0;
		Connection conn = null;
		PreparedStatement psmt = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "shopping";
			String db_pw = "12345";
			
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			
			String sql = "delete from member where id = ? and pw = ?";
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, id);
			psmt.setString(2, pw);
			cnt = psmt.executeUpdate();
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("DB 연결 실패");
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
				System.out.println("DB close Fail..");
				e.printStackTrace();
			}
		}
		return cnt;
	}

	public int update(String id, String pw) {
		// TODO Auto-generated method stub
		// Query
		// UPDATE 테이블명 SET 요렇게 바꿀래 컬럼명 WHERE 요거 바꿀래 컬럼명
		// WHERE문 : 사용자가 입력한 아이디에 해당하는 비밀번호를 변경
		
		int cnt = 0;
		Connection conn = null;
		PreparedStatement psmt = null;
		

	
			// 동적 로딩
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				// 준비물 3개
				String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
				String db_id = "shopping";
				String db_pw = "12345";
				
				conn = DriverManager.getConnection(db_url, db_id, db_pw);
				// 예외사항이 발생할 수 있음 --> try-catch로 잡아줘야 함
				
				// SQL문 준비
				String sql = "update member set pw = ? where id = ?";
				psmt = conn.prepareStatement(sql);
				
				// ? 인자 채워주기
				psmt.setString(1, pw);
				psmt.setString(2, id);
				
				cnt = psmt.executeUpdate();
				// 영향을 받은 행이 있는지 없는지에 대한 결과값을 받아옴
				
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				// OracleDriver라는 클래스가 없거나 --> ojdbc.jar
				// 대소문자 구분
				// id, pw
				System.out.println("데이터 베이스 연결 실패");
				e.printStackTrace();
			}finally {
				//finally : 예외 상황이 발생하더라도 꼭 한번은 실행되는 코드들이
				// { } 안으로 와줘야함
				// 예외사항이 발생하더라도 닫아줄 수 있도록 finally 구문 안으로 들어오게 만들어줘야돼
				// 사용한 적이 있으면 닫아줄거야 : conn, psmt를 close 해줌
				// conn, psmt를 { } try문이나 catch문 밖에 선언해줘서 전역변수처럼 사용할수 있게 만들어줌
			
					try {
						// 역순으로 닫아주기!!!
						if(psmt != null) {
							psmt.close();
						}
						if(conn != null) {
							conn.close();
						}
						
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						System.out.println("자원 반납 오류");
						e.printStackTrace();
					}
				}
		return cnt;
	}

	public MemberVO login(String id, String pw) {
		// TODO Auto-generated method stub
		// MemberVO 자료형인 레퍼런스 변수 info 생성 틀만!
		MemberVO info = null;
		// 레퍼런스 변수는 아무것도 없을 때 null을 담을 수 있음
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		 
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "shopping";
			String db_pw = "12345";
			
			
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			
			String sql = "select * from member where id = ? and pw = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			
			// executequery가 가져오는 테이블 형태의 데이터를 
			// rs(ResultSet객체)에 담아줌
			rs = psmt.executeQuery();
			
			// rs.next() : 커서를 한칸씩 이동시키면서 데이터가 있는지 없는지에 대한 
			// 결과값을 true/false로 받아오는 메서드
			// 테이블 안에 데이터가 있을 때까지 반복
			
			if(rs.next()) {
				String ID = rs.getString(1);
				// rs.getString("ID"); 
				// 몇번째 컬럼인지 모르겠을 때--> 이렇게 가져오고 싶은 컬럼명을 쓸 수도 있음
				String PW = rs.getString(2);
				// rs.getString("PW");
				String nick = rs.getString(3);
				// rs.getString("NICK");
				
				// 한줄씩 내려가면서 아래 데이터가 있으면 ture(rs.next()) --> while 계속 돌아
				// 테이블 내에 데이터가 있을 떄까지(없으면 false 반환 : while문 끝)
				// --> getString(1) : 1번째id컬럼에서 저장된 아이디(String)를 가져오고
				// 2번째 --> 같은 행에 저장된 비밀번호
				// 3번째 --> 같은 행에 저장된 닉네임
				// 가져온 데이터를 각각 ID, PW, nick 변수에 저장
				
				// info 안에 데이터를 담기 위해서 객체 하나 생성해줌
				info = new MemberVO(ID, PW, nick);
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
		
		return info;
	}
}
