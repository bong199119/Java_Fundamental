package Homework.DeptDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcInsertDemo {
	
	public static void main(String[] args) {
		//1. 드라이브 로드
		
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//2. 디비에 연결

		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/acorn?autoReconnect=true",
					"acorn12",
					"acorn12");
			
			
			//3. sql문 전송 할 수 있는 preparedstatement 객체 생성
			
			StringBuffer sql = new StringBuffer();
			sql.append("INSERT INTO salgrade(grade,losal,hisal) ");
			sql.append("VALUES(?,?,?) ");
			pstmt = con.prepareStatement(sql.toString());


			//4. 바인딩 변수 설정
			pstmt.setInt(1, 2);
			pstmt.setInt(2, 5000);
			pstmt.setInt(3, 900);
			
			//5. sql문 전송
			int result = pstmt.executeUpdate();
			System.out.printf("갱신된 행의 수 %d",result);
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
