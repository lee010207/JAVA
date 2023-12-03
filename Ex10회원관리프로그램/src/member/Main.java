package member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// CRUD : 어떠한 프로그램이든 기본적으로 존재해야하는 기능들
		
		// DAO클래스 안에 있는 메서드를 사용하기 위해 객체생성 해주기
		memberDAO dao = new memberDAO();
		
		while(true) {
			System.out.print("1.회원가입 2.로그인 3.회원목록 4.회원정보수정 5.회원탈퇴 6.종료 >>  ");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				System.out.println("======== 회원 가입 =========");
				// 아이디, 비밀번호, 닉네임
				System.out.print("아이디 >> ");
				String id = sc.next();
				System.out.print("비밀번호 >> ");
				String pw = sc.next();
				System.out.print("닉네임 >> ");
				String nick = sc.next();
				
				int cnt = dao.join(id, pw, nick);
				// 자동완성 : create method ~ 해도 됨
				// memberDAO 클래스에다가 join 메서드 만들어줘야 돼

				// 최종 결과만 출력하게 여기다가 옮겨주기 -> 회원가입 여부 출력
				if(cnt > 0) {
					System.out.println("회원가입 성공!");
				}else {
					System.out.println("회원가입 실패...");
				}			
				
			}else if(menu == 2) {
				// 사용자한테 아이디랑 비밀번호 입력받아서
				//테이블에 해당 데이터가 있는지 확인 후
				// 있으면 닉네임 가져와서
				// "(닉네임)님 로그인 성공!" 출력
				
				System.out.print("아이디를 입력하세요 >> ");
				String id = sc.next();
				System.out.print("비밀번호를 입력하세요 >> ");
				String pw = sc.next();
				
				MemberVO info = dao.login(id, pw);
				
				if(info != null) {
					// 로그인 성공 시 
					System.out.println(info.getNick() + "님 환영합니다^.^");
				}else {
					System.out.println("아이디나 비밀번호가 틀렸습니다.");
				}
				
			}else if(menu == 3) {
				// 전체 회원의 정보가 보여지게 만들기
				Connection conn = null;
				PreparedStatement psmt = null;
				ResultSet rs = null;
				 
				
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
				
					String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
					String db_id = "shopping";
					String db_pw = "12345";
					
					
					conn = DriverManager.getConnection(db_url, db_id, db_pw);
					
					String sql = "select * from member";
					psmt = conn.prepareStatement(sql);
					
					// executequery가 가져오는 테이블 형태의 데이터를 
					// rs(ResultSet객체)에 담아줌
					rs = psmt.executeQuery();
					
					// rs.next() : 커서를 한칸씩 이동시키면서 데이터가 있는지 없는지에 대한 
					// 결과값을 true/false로 받아오는 메서드
					// 테이블 안에 데이터가 있을 때까지 반복
					System.out.println("아이디\t비밀번호\t닉네임");
					System.out.println("------------------------------");
					while(rs.next()) {
						String id = rs.getString(1);
						String pw = rs.getString(2);
						String nick = rs.getString(3);
						System.out.print(id + "\t");
						System.out.print(pw + "\t"); 
						System.out.println(nick);
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
				
				
			}else if(menu == 4) {
				// 회원정보 수정
				// 사용자로부터 아이디를 입력받아서 비밀번호를 바꾸자
				System.out.print("아이디 입력 : ");
				String id = sc.next();
				
				System.out.print("바꿀 비밀번호 입력 >> ");
				String pw = sc.next();
				
				int cnt = dao.update(id, pw);

					if(cnt > 0) {
						// update 성공
						System.out.println("비밀번호 변경 성공!");
					}else {
						// update 실패
						System.out.println("비밀번호 변경 실패..");
					}
			
			}else if(menu == 5) {
				// 사용자한테 아이디랑 비밀번호 입력받아서
				// 해당 아이디 비밀번호가 있으면 테이블에서 정보가 사라지게 만들기
				System.out.print("회원 탈퇴 아이디 >> ");
				String id = sc.next();
				System.out.print("회원 탈퇴 비밀번호 >> ");
				String pw = sc.next();
				
				int cnt = dao.delete(id, pw);
					
				if(cnt > 0) {
					System.out.println("회원탈퇴 되었습니다.");
				}else {
					System.out.println("회원 탈퇴 실패!");
				}
				
			}else if(menu == 6) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("!! 정확한 숫자를 입력해주세요");
			}
		}
		
		
	}

}
