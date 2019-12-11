package java_20191211;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionDemo {
	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Connection con = null;
		PreparedStatement pstmt1 = null;
		PreparedStatement pstmt2 = null;
		boolean isSuccess = false;
		
		try {
			con = DriverManager.getConnection(
					"jdbc:mariadb://localhost/acorn","acorn12","acorn12");
			
			StringBuffer sql = new StringBuffer();
			sql.append("INSERT INTO dept(deptno, dname, loc) VALUES(50,'aaa','aaa')");
			con.setAutoCommit(false);//트랜잭션시작
			
			pstmt1 = con.prepareStatement(sql.toString());
			pstmt1.executeUpdate();
			
			sql.setLength(0); // 스트링버퍼를 싹지울수 있음!!! 외워두기
			sql.append("INSERT INTO dept(deptno, dname, loc) VALUES(60,'bbb','bbb)");
			
			pstmt2 = con.prepareStatement(sql.toString());
			pstmt2.executeUpdate();
			
			isSuccess = true;			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
			if(isSuccess){
				con.commit();
			}else{
				con.rollback();
			}
			
			con.setAutoCommit(true); // connection pool을 사용하는 경우에는 반드시 작성해야 하는 코드
			if(pstmt1 != null) pstmt1.close();
			if(pstmt2 != null) pstmt2.close();
			if(con != null) con.close();
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
	}
}
