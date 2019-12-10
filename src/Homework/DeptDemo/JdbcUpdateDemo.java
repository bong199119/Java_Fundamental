package Homework.DeptDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcUpdateDemo {
	
		public static void main(String[] args) {
			//1. 드라이브 로드
			
			try {
				Class.forName("org.mariadb.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			//2. 데이터베이스에 연결 시도
			Connection con = null;
			PreparedStatement pstmt = null;
			try {
				con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/acorn?autoReconnect=true",
						"acorn12",
						"acorn12");
				
				
				//3. sql문을 보낼 수 있는 preparedstatement로 객체생성해준다
				
				StringBuffer sql = new StringBuffer();
				sql.append("UPDATE salgrade ");
				sql.append("SET losal = ?, hisal = ? ");
				sql.append("WHERE grade = ? ");
				pstmt = con.prepareStatement(sql.toString());

				
				//4. 바인딩변수 설정
				
				pstmt.setInt(1, 20200);
				pstmt.setInt(2, 1920);
				pstmt.setInt(3, 5);
			
				//5. sql문 전송
				
				int result = pstmt.executeUpdate();
				System.out.printf("갱신된 행의 수 : %d", result);
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
			
		}
		
}
