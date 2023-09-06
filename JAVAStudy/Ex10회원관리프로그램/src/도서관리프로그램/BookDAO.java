package 도서관리프로그램;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BookDAO {
	
	// 데이터베이스에 접근해서 도서등록에 필요한 데이터들을 저장
	public int insert(BookVO vo) {

		
		int row = 0;
		Connection conn = null;
		PreparedStatement psmt = null;
		
		// 1) 드라이버 동적로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 준비물 3가지 : 주소, 아이디, 비밀번호
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "shopping";
			String db_pw = "12345";
			
			conn = DriverManager.getConnection(db_url,db_id,db_pw);	
			
			// 2) SQL문 준비
			String sql = "INSERT INTO BOOK VALUES(?,?,?,?)";
			psmt = conn.prepareCall(sql);
			// ?인자 채워주기
			psmt.setString(1, vo.getTitle());
			psmt.setString(2, vo.getName());
			psmt.setInt(3, vo.getPrice());
			psmt.setString(4, vo.getNum());
			
			row = psmt.executeUpdate(); // 영향을 받은 행이 있는 지에 대한
			// 결과값!!!!!
			// 3) 결과값 처리
			
			// 4) 자원반납
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("데이터베이스 연결 실패");
			e.printStackTrace();
		} finally {
			try {
				if (psmt != null)
					psmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return row; // 데이터베이스 저장 성공여부 결과값 처리는
		// Controller로 보내주기	
	}
	
	public void select() { // public ArrayList<BookVO> select()
		// 테이블에 있는 책 정보들을 저장하는 가변 배열
		ArrayList<BookVO> bookList = new ArrayList<>();
		
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		// 1) 드라이버 동적로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 준비물 3가지 : 주소, 아이디, 비밀번호
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "shopping";
			String db_pw = "12345";
			
			conn = DriverManager.getConnection(db_url,db_id,db_pw);	
			
			// 2) SQL문 준비
			String sql = "SELECT * FROM BOOK";
			psmt = conn.prepareCall(sql);
			
			rs = psmt.executeQuery();
			
			System.out.println("제목\t저자\t가격\t번호");
			System.out.println("======================================");
			while(rs.next()) {
				String title = rs.getString(1);
				String name = rs.getString(2);
				int price = rs.getInt(3);
				String num = rs.getString(4);
				
				BookVO vo = new BookVO(title, name, price, num);
				bookList.add(vo);
				System.out.println(title+"\t"+name+"\t"+price+"\t"+num);
			
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("데이터베이스 연결 실패");
			e.printStackTrace();
		} finally {
			try {
				if (psmt != null)
					psmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			// return bookList; // ArrayList<BookVO>
		}
	}
	
	public BookVO search(String searchTitle) {
		
		BookVO info = null;
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		// 1) 드라이버 동적로딩
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				// 준비물 3가지 : 주소, 아이디, 비밀번호
				String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
				String db_id = "shopping";
				String db_pw = "12345";
				
				conn = DriverManager.getConnection(db_url,db_id,db_pw);	
				
				// 2) SQL문 준비
				String sql = "SELECT * FROM BOOK WHERE(TITLE = ?)";
				psmt = conn.prepareCall(sql);
				psmt.setString(1,searchTitle);
				
				rs = psmt.executeQuery();
				
				if(rs.next()) {
					String search_title = rs.getString("TITLE");
					String search_name = rs.getString("NAME");
					int search_price = rs.getInt("PRICE");
					String search_num = rs.getString("NUM");
					System.out.println("책제목\t책저자\t책가격\t책번호");
					System.out.println("======================================");
					System.out.println(search_title+"\t"+search_name+"\t"+search_price+"\t"+search_num);
					
					info = new BookVO(search_title, search_name, search_price, search_num);
				
				}
			} catch (ClassNotFoundException | SQLException e) {
				System.out.println("데이터베이스 연결 실패");
				e.printStackTrace();
			} finally {
				try {
					if (psmt != null)
						psmt.close();
					if (conn != null)
						conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return info;
	}
}
	
