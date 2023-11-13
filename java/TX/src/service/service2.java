package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import common.JdbcUtil;

public class service2 {
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public boolean order() {
		con = JdbcUtil.getConnection();
	String sql = "insert into purchase(pc_mid, pc_pid) "	
				+ "values(?, ?)";
		boolean flag = true;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "bbb");
			pstmt.setString(2, "컴퓨터");
			int result = pstmt.executeUpdate();
			if(result>0) {
				System.out.println("상품 등록 성공");
			}else {
				flag = false;
				System.out.println("상품 등록 실패");
			}
			sql = "insert into pay(py_cost, py_pcno) values(3000000, 3)";
			result = pstmt.executeUpdate();
			
			if(result>0) {
				System.out.println("결재 성공");
			}else {
				flag = false;
				System.out.println("결재 실패");
			}
		} catch (SQLException e) {
			flag = false;
			System.out.println("order 예외");
			e.printStackTrace();
		}
		if(flag == false) {
			JdbcUtil.dbRollback(con);
			return false;
		}else {
			JdbcUtil.dbCommit(con);
			return true;
		}
	}

}