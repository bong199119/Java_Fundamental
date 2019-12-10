package Homework.DeptDemo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Homework.DeptDemo.dto.SalgradeDto;

public class SalgradeDao {

	static {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
	}

	private static SalgradeDao single;

	private SalgradeDao() {

	}

	public static SalgradeDao getInstance() {

		if (single == null) {
			single = new SalgradeDao();
		}
		return single;

	}

	public boolean insert(SalgradeDto sto) {
		boolean isSuccess = false;
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/acorn?autoReconnect=true", "acorn12",
					"acorn12");

			StringBuffer sql = new StringBuffer();
			sql.append("INSERT INTO salgrade(grade,losal,hisal) ");
			sql.append("VALUES(?,?,?) ");
			pstmt = con.prepareStatement(sql.toString());

			int index = 0;
			pstmt.setInt(++index, sto.getGrade());
			pstmt.setInt(++index, sto.getLo());
			pstmt.setInt(++index, sto.getHi());

			int result = pstmt.executeUpdate();

			isSuccess = true;

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return isSuccess;
	}

	public boolean update(SalgradeDto sto) {
		boolean isSuccess = false;
		
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/acorn?autoReconnect=true", "acorn12",
					"acorn12");

			StringBuffer sql = new StringBuffer();
			sql.append("UPDATE salgrade ");
			sql.append("SET losal = ?, hisal = ? ");
			sql.append("WHERE grade = ? ");
			pstmt = con.prepareStatement(sql.toString());
			
			int index = 0;
			pstmt.setInt(++index, sto.getLo());
			pstmt.setInt(++index, sto.getHi());
			pstmt.setInt(++index, sto.getGrade());

			pstmt.executeUpdate();
			
			isSuccess = true;

		} catch (SQLException e) {

			e.printStackTrace();
		}finally {
			try {

				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return isSuccess;

	}

	public boolean delete(int Salgrade) {
		boolean isSuccess = false;
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/acorn?autoReconnect=true", "acorn12",
					"acorn12");

			StringBuffer sql = new StringBuffer();
			sql.append("DELETE  ");
			sql.append("FROM salgrade ");
			sql.append("WHERE grade = ?");
			pstmt = con.prepareStatement(sql.toString());
			
			int index=0;
			pstmt.setInt(++index, Salgrade);

			int result = pstmt.executeUpdate();
			isSuccess = true;

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return isSuccess;

	}

	public ArrayList<SalgradeDto> select() {
		ArrayList<SalgradeDto> list = new ArrayList<SalgradeDto>();

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/acorn?autoReconnect=true", "acorn12",
					"acorn12");

			StringBuffer sql = new StringBuffer();
			sql.append("SELECT grade, losal, hisal ");
			sql.append("FROM salgrade ");
			sql.append("ORDER BY grade ");
			pstmt = con.prepareStatement(sql.toString());

			rs = pstmt.executeQuery();

			while (rs.next()) {
				int index = 0;
				int grade = rs.getInt(++index);
				int losal = rs.getInt(++index);
				int hisal = rs.getInt(++index);
				list.add(new SalgradeDto(grade, losal, hisal));

			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {

				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}

		}

		return list;
	}

	public SalgradeDto select(int graDe) {
		SalgradeDto sto = null;

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/acorn?autoReconnect=true", "acorn12",
					"acorn12");

			StringBuffer sql = new StringBuffer();
			sql.append("SELECT grade, losal, hisal ");
			sql.append("FROM salgrade ");
			sql.append("WHERE grade = ?");
			//sql.append("ORDER BY grade ");
			
			pstmt = con.prepareStatement(sql.toString());

			int index = 0;
			pstmt.setInt(++index, graDe);
			
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				index = 0;
				int grade = rs.getInt(++index);
				int losal = rs.getInt(++index);
				int hisal = rs.getInt(++index);
				sto = new SalgradeDto(grade, losal, hisal);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
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

		return sto;

	}
	
}
