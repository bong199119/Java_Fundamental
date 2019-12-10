package java_20191210;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcUpdateDemo {
	public static void main(String[] args) {
		try {
			//1. org.mariadb.jdbc.Driver 클래스를 메몰에 로딩한다.
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("드라이브로드 성공");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			//2. 데이터 베이스와 연결을 시도한다.
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/acorn?autoReconnect=true",
					"acorn12", //user
					"acorn12");//password
					System.out.println("데이터 베이스 연결 성공");
					
					
					//3. SQL문을 전송할 수 있는 PreparedStatement 객체를 생성한다.
					StringBuffer sql = new StringBuffer();
					sql.append("UPDATE dept ");
					sql.append("SET dname = ?, loc = ? ");
					sql.append("WHERE deptno = ?");
					
					
					
					pstmt = con.prepareStatement(sql.toString());
					
					//4. 바인딩 변수->(?)를 설정한다.
					pstmt.setString(1, "MININGS");
					pstmt.setString(2, "SILICONVALLEY");
					pstmt.setInt(3, 60);
					
					//5. SQL문을 전송한다.
					int result = pstmt.executeUpdate(); // insert, update, delete // DML일때씀  // 여기서 result는 갱신된 행의수
					System.out.printf("갱신된 행의수 : %d", result);
					
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
