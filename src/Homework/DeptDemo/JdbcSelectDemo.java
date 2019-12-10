package Homework.DeptDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcSelectDemo {
	//1. 드라이브 로드
	//2. 데이터베이스에 연결
	//3. sql 보낼 수 있게 preparedstatement 객체 생성
	
	public static void main(String[] args) {
		
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/acorn?autoReconnect=true",
					"acorn12",
					"acorn12");
			
			
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT grade, losal, hisal ");
			sql.append("FROM salgrade ");
			sql.append("ORDER BY grade ");
			pstmt = con.prepareStatement(sql.toString());
			
			rs = pstmt.executeQuery();
			while(rs.next()){
				int index =0;
				int grade = rs.getInt(++index);
				int losal = rs.getInt(++index);
				int hisal = rs.getInt(++index);
				System.out.printf("%d,%d,%d%n",grade,losal,hisal);
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {

				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		
		
		
	}
	
	
}











