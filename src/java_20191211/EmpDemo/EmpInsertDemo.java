package java_20191211.EmpDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmpInsertDemo {

	public static void main(String[] args) {
		//1. 드라이브 로드
		
		try {
			Class.forName("org.maria.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//2. 마리아디비 연결시도
		
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DriverManager.getConnection("jdbc:mariadb://localhost/acorn","acorn12","acorn12");
			
			//3. preperationstatement로 객체생성
			
			StringBuffer sql = new StringBuffer();
			sql.append("");
			
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//4. 바인딩 변수 설정
		//5. sql문 전송
	}
	

}
