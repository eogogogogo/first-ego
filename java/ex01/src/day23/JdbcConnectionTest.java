package day23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcConnectionTest {
	// 모든 메소드에서 사용
	static Connection con;  // db 접속을 위해서 필요
	static PreparedStatement pstmt; // sql문장을 db에 전달하기위해서 필요
	static ResultSet rs;   // Select 결과 저장하기 위해서 필요
	
	
	private void select() {
		//con=JdbcUtil.getconnection();
		String sql="select * from member2";
	 try {
		pstmt=con.prepareStatement(sql);  //sql문장을 db에 전달 파싱(분석)
		rs=pstmt.executeQuery();   // db에서 select문 실행
		
		while(rs.next()) {
			System.out.println("아이디: "+rs.getString("ID")+", 비번: "+rs.getString("pw")
					+", 이름: "+rs.getString("name")+", 나이: "+rs.getInt("age")+", 생일: "+rs.getDate("birth"));
		}
	} catch (SQLException e) {
		System.out.println("select 예외 발생");
		e.printStackTrace();
	}finally {
		//JdbcUtil.dbClose(rs);
		//JdbcUtil.dbClose(pstmt);
		//JdbcUtil.dbClose(con);
		
		//JdbcUtil.dbClose(rs, pstmt,con);
	}
	System.out.println("SELECT 완료");
	
	}
	private void select(int age, String name) {
		String sql="select * from member2 where age>=? or name=?";
	 try {
		pstmt=con.prepareStatement(sql);  //sql문장을 db에 전달 파싱(분석)
		pstmt.setInt(1, age);
		pstmt.setString(2, name);
		rs=pstmt.executeQuery();   // db에서 select문 실행
		
		while(rs.next()) {
			System.out.println("아이디: "+rs.getString("ID")+", 비번: "+rs.getString("pw")
					+", 이름: "+rs.getString("name")+", 나이: "+rs.getInt("age")+", 생일: "+rs.getDate("birth"));
		}
	} catch (SQLException e) {
		System.out.println("select 예외 발생");
		e.printStackTrace();
	}
	 System.out.println("select 완료");
	}
	private void insert(String id, String pw, String name, int age, String birth) {
		String sql="insert into member2  values(?,?,?,?,?)";   // 변수를 똑바로 놓자. 바보야.. 같은 질문을 두번하네....
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			pstmt.setString(3, name);
			pstmt.setInt(4, age);
			pstmt.setString(5, birth);
			int result = pstmt.executeUpdate();   // insert, update, delete 
			if (result != 0) {
				System.out.println("insert 성공");
			}else {  //result = 0
				System.out.println("insert 실패");
			}
		} catch (SQLException e) {
			System.out.println("insert 예외 발생");
			e.printStackTrace();
		}
	}
	private void delete(String id) {
		String sql="delete from member2 where id=?";   
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			int result = pstmt.executeUpdate();   // insert, update, delete 
			if (result != 0) {
				System.out.println("delete 성공");
			}else {  //result = 0
				System.out.println("delete 실패");
			}
		} catch (SQLException e) {
			System.out.println("delete 예외 발생");
			e.printStackTrace();
		}finally {
			//JdbcUtil.dbClose(rs, pstmt, con);
		}
	}
		private void update(String id, int age) {
		String sql="update member2 set age=? where id=?";   
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, age);
			pstmt.setString(2, id);
			int result = pstmt.executeUpdate();   // insert, update, delete 
			if (result != 0) {
				System.out.println("update 성공");
			}else {  //result = 0
				System.out.println("update 실패");
			}
		} catch (SQLException e) {
			System.out.println("update 예외 발생");
			e.printStackTrace();
		}
	}
	
		// java jdbc dml 작업시 자동 commit 된다.
	public static void main(String[] args) {
		JdbcConnectionTest conTest = new JdbcConnectionTest();
		con=JdbcUtil.getConnection();  // 1.db 접속
		//conTest.select(30, "에이");    // 30대이거나 AAA인 사람 검색
		
		//conTest.select();
		//conTest.insert("FFF","1234","에프",40,"2010-10-10");
		//conTest.select();
		
		// 문제1
		//conTest.delete("BBB");  // 회원 BBB를 삭제
		//conTest.select();
		
		// 문제2
		conTest.update("AAA",50);  // AAA사람의 나이를 50살로 변경
		conTest.select();
		
		
		JdbcUtil.dbClose(rs,pstmt,con);  // 마지막. db접속 종료
	}
		


}