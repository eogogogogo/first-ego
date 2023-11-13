package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import bean.Member;
import common.JdbcUtil;
import exception.MenuWrongException;

public class PhoneBookManager {
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	Scanner sc = new Scanner(System.in);
	public boolean inputData() throws MenuWrongException {
		
		con = JdbcUtil.getConnection();
		System.out.println("데이터 입력을 시작합니다.");
		System.out.println("1.일반, 2.대학, 3.회사");
		System.out.print("선택>> ");
		int menuNum = Main.sc.nextInt();
		if (menuNum < 0 || menuNum > 3) {
			throw new MenuWrongException(menuNum);
		}

		boolean run = true;
		while (run) {
			if (menuNum == 1) {
				String sql = "insert into PHONEMEMBER(p_name, p_phone,p_kind) values(?,?,?)";
				try {
					pstmt = con.prepareStatement(sql);
					System.out.println("이름입력");
					String name = sc.next();
					System.out.println("전화번호 입력");
					String phoneNum = sc.next();
					pstmt.setString(1, name);
					pstmt.setString(2, phoneNum);
					pstmt.setString(3, "N");
					int result = pstmt.executeUpdate();
					if (result != 0) {
						System.out.println("insert 성공");
					}else {  
						System.out.println("insert 실패");
					}
					System.out.println("입력완료");
					run = false;
				} catch (SQLException e) {
					System.out.println("order 예외");
					e.printStackTrace();
				}
			} else if (menuNum == 2) {
				String sql = "insert into PHONEMEMBER(p_name, p_phone, p_kind, p_major, p_year) values(?,?,?,?,?)";
				try {
					pstmt = con.prepareStatement(sql);
					System.out.println("이름입력");
					String name = sc.next();
					System.out.println("전화번호 입력");
					String phoneNum = sc.next();
					System.out.println("전공 입력");
					String major = sc.next();
					System.out.println("학년 입력");
					int year = Main.sc.nextInt();
					pstmt.setString(1, name);
					pstmt.setString(2, phoneNum);
					pstmt.setString(3, "U");
					pstmt.setString(4, major);
					pstmt.setInt(5, year);
					pstmt.executeUpdate();
					System.out.println("입력완료");
				} catch (SQLException e) {
					System.out.println("order 예외");
					e.printStackTrace();
				}
				run = false;
			} else if (menuNum == 3) {
				String sql = "insert into PHONEMEMBER(p_name, p_phone, p_kind, p_company) values(?,?,?,?)";
				try {
					pstmt = con.prepareStatement(sql);
					System.out.println("이름입력");
					String name = sc.next();
					System.out.println("전화번호 입력");
					String phoneNum = sc.next();
					System.out.println("회사명 입력");
					String company = sc.next();
					pstmt.setString(1, name);
					pstmt.setString(2, phoneNum);
					pstmt.setString(3, "C");
					pstmt.setString(4, company);
					pstmt.executeUpdate();
					System.out.println("입력완료");
				} catch (SQLException e) {
					System.out.println("order 예외");
					e.printStackTrace();
				}
				run = false;
			} else {
				System.out.println("다시 입력해 주세요");
			}

			JdbcUtil.dbClose(rs, pstmt, con);
		}
		return false;
	}

	public void searchData() {
		System.out.println("검색할 이름은?");
		String name = sc.next();
		con = JdbcUtil.getConnection();
		String sql = "select * from PHONEMEMBER where p_name=?";
		try {
			pstmt = con.prepareStatement(sql); 
			pstmt.setString(1, name);
			rs = pstmt.executeQuery(); 
			while (rs.next()) {
				System.out.println("번호: " + rs.getInt("p_number") + ", 이름: " + rs.getString("p_name") + ", 핸드폰번호: "
						+ rs.getString("p_phone") + ", 학교: " + rs.getString("p_major") + ", 학년: " 
						+ rs.getInt("p_year")+ ", 직장: " + rs.getString("p_company") + ", 종류: " + rs.getString("p_kind") );
			}
		} catch (SQLException e) {
			System.out.println("select 예외 발생");
			e.printStackTrace();
		}
		System.out.println("select 완료");
		JdbcUtil.dbClose(rs, pstmt, con);
	}

	public void change() {
		con = JdbcUtil.getConnection();
		ArrayList<Member> mList = null;
		String sql = "select * from PHONEMEMBER";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			mList=new ArrayList<Member>();
			while (rs.next()) {

				Member mb = new Member();
				mb.setNumber(rs.getInt("p_number"));
				mb.setName(rs.getString("p_name"));
				mb.setPhone(rs.getString("p_phone"));
				mb.setMajor(rs.getString("p_major"));
				mb.setYear(rs.getInt("p_year"));
				mb.setCompany(rs.getString("p_company"));
				mb.setKind(rs.getString("p_kind"));
				mList.add(mb);
			}
			for (Member member : mList) {
				member.showInfo();
			}
		} catch (SQLException e) {
			System.out.println("전체보기 예외 발생");
			e.printStackTrace();
		}
		System.out.println("번호를 확인해 주세요");
		System.out.println("번호를 입력");
		int number = sc.nextInt();
		System.out.println("바꿀 이름을 입력");
		String name = sc.next();
		System.out.println("바꿀 전화번호을 입력");
		String phoneNum = sc.next();
		
		sql = "update PHONEMEMBER set p_name=? , p_phone=? where p_number=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, phoneNum);
			pstmt.setInt(3, number);
			int result = pstmt.executeUpdate(); 
			if (result >  0) {
				System.out.println("update 성공");
			} else { // result = 0
				System.out.println("update 실패");
			}
		} catch (SQLException e) {
			System.out.println("update 예외 발생");
			e.printStackTrace();
		}
		JdbcUtil.dbClose(rs, pstmt, con);
	}

	public void deleteData() {
		System.out.println("삭제할 이름을 입력");
		String name = sc.next();
		con = JdbcUtil.getConnection();
		String sql = "delete from PHONEMEMBER where p_name=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);
			int result = pstmt.executeUpdate();
			if (result != 0) {
				System.out.println("delete 성공");
			} else {
				System.out.println("delete 실패");
			}
		} catch (SQLException e) {
			System.out.println("delete 예외 발생");
			e.printStackTrace();
		}
		JdbcUtil.dbClose(rs, pstmt, con);
	}

	public void showAllData() {
		con = JdbcUtil.getConnection();
		ArrayList<Member> mList = null;
		String sql = "select * from PHONEMEMBER";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			mList=new ArrayList<Member>();
			while (rs.next()) {
				
				Member mb = new Member();
				mb.setNumber(rs.getInt("p_number"));
				mb.setName(rs.getString("p_name"));
				mb.setPhone(rs.getString("p_phone"));
				mb.setMajor(rs.getString("p_major"));
				mb.setYear(rs.getInt("p_year"));
				mb.setCompany(rs.getString("p_company"));
				mb.setKind(rs.getString("p_kind"));
				mList.add(mb);
			}
			for (Member member : mList) {
				member.showInfo();
			}
		} catch (SQLException e) {
			System.out.println("전체보기 예외 발생");
			e.printStackTrace();
		}JdbcUtil.dbClose(rs, pstmt, con);
	}
}
