package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.Member;
import common.JdbcUtil;

//회원관리 서비스
public class MemberService {
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;

	public boolean login(String id, String pw) {
		con = JdbcUtil.getConnection(); // db접속
		String sql = "select * from member2 where id=? and pw=?";// 파싱 1번
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				// 로그인 성공
				return true;
			}
		} catch (SQLException e) {
			System.out.println("login service 예외발생");
			e.printStackTrace();
		} finally {
			JdbcUtil.dbClose(rs, pstmt, con);
		}
		return false;
	}

	public ArrayList<Member> login2(String id, String pw) {
		con = JdbcUtil.getConnection(); // db접속

		ArrayList<Member> mList=null;
		String sql = "select * from member2 where id=? and pw=?";// 파싱 1번
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			rs = pstmt.executeQuery();
			if (rs.next()) { //로그인 성공
				mList =  new ArrayList<Member>();
				if (rs.getString("ID").equals("ADMIN")) { //관리자 로그인
					sql = "select * from member2";// 파싱 1번
					pstmt = con.prepareStatement(sql);
					rs = pstmt.executeQuery();
					//Member mb = new Member();
					while (rs.next()) {
						Member mb = new Member();
						mb.setId(rs.getString("ID"));
						mb.setPw(rs.getString("PW"));
						mb.setAge(rs.getInt("AGE"));
						mb.setName(rs.getString("NAME"));
						mb.setBirth(rs.getDate("BIRTH"));
						mList.add(mb);
					} // while
					return mList;
				} // admin로그인 성공 if
				else {  //회원 로그인
					Member mb = new Member();
					mb.setId(id);
					mb.setPw(pw);
					mb.setAge(rs.getInt("AGE"));
					mb.setName(rs.getString("NAME"));
					mb.setBirth(rs.getDate("BIRTH"));
					mList.add(mb);
					return mList;
				}
			} // 로그인성공 확인 if
			else {// 로그인 실패
				return null;	
			}
		} catch (SQLException e) {
			System.out.println("login service 예외발생");
			e.printStackTrace();
		} finally {
			JdbcUtil.dbClose(rs, pstmt, con);
		}
		return null;
	}

}// class End
