package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import common.JdbcUtil;

public class ShoppingService {
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	
		public boolean order() {
			con=JdbcUtil.getConnection();  //db접속
			String sql="insert into purchase(pc_mid, pc_pid) values(?,?)";
			try {
				pstmt=con.prepareStatement(sql);    // sql 파싱  컴파일링.
				pstmt.setString(1, "bbb");
				pstmt.setString(2, "컴퓨터");
				int result=pstmt.executeUpdate();    // sql 실행
				if(result>0) {    // 성공한다면
					System.out.println("상품주문등록 성공");
					sql="insert into pay(py_cost, py_pcno) values(2000000,2)";
					pstmt=con.prepareStatement(sql);    // sql 파싱  컴파일링.
					result=pstmt.executeUpdate();
					if(result>0) {
						System.out.println("결재 성공");
						//con.commit();
						JdbcUtil.dbCommit(con);
						return true;
					}else {
						System.out.println("결재 실패");
						//con.rollback();
						JdbcUtil.dbRollback(con);
						return false;
					}
				}else {
					System.out.println("상품주문등록 실패, 결재TX 실패");
				}
			} catch (SQLException e) {
				System.out.println("order 예외");
				e.printStackTrace();
			}
			return false;
		}
}
