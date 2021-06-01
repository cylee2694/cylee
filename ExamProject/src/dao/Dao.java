package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Dao {
	
	private static Dao dao = new Dao();
	private Dao() {}
	public static Dao getInstance() {
		return dao;
	}
	
public Connection connect() {
		
		Connection conn = null;
		try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/exam", "root", "rosmrtl1@3");
			
		}catch(Exception e) {
			System.out.println("MDAO:connect"+e);
		}
		return conn;
	}
	
	public void close(Connection conn, PreparedStatement pstmt) {
		
		if(pstmt != null) {
			try {
					pstmt.close();
			}catch(Exception e) {
				System.out.println("pstmt close error"+e);
			}
		}
		
		if(conn != null) {
			try {
					conn.close();
			}catch(Exception e) {
				System.out.println("conn close error"+e);
			}
		}
	}
	
	public void close(Connection conn, PreparedStatement pstmt, ResultSet rs) {
		if(rs!=null) {
			try {
					rs.close();
			}catch(Exception e) {
				System.out.println("rs close error"+e);
			}
			close(conn,pstmt);
		}
	}
	
	public boolean login(String id, String pwd) {
		// TODO Auto-generated method stub
		boolean result = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs= null;
		try {
				conn = connect();
				pstmt = conn.prepareStatement("select * from student where id = ? and pwd = ?;");
				pstmt.setString(1, id);
				pstmt.setString(2, pwd);
				rs= pstmt.executeQuery();
				if(rs.next()) { 
					result = true;
				}
				else
					result = false;
				
		}catch(Exception e) {
			System.out.println("login error"+e);
		}
		finally {
			close(conn,pstmt,rs);
		}
		return result;
	}
	public void registerSubject(String Sid, String title, String num, String id) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
				conn = connect();
				pstmt = conn.prepareStatement("insert into subject values(?,?,?,?);");
				pstmt.setString(1, Sid);
				pstmt.setString(2, title);
				pstmt.setString(3, num);
				pstmt.setString(4, id);
				pstmt.executeUpdate();
		}catch(Exception e) {
			System.out.println("registerSubject error"+e);
		}
		finally {
			close(conn,pstmt);
		}
	}
	public boolean login2(String id, String pwd) {
		// TODO Auto-generated method stub
		boolean result = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs= null;
		try {
				conn = connect();
				pstmt = conn.prepareStatement("select * from prof where id = ? and pwd = ?;");
				pstmt.setString(1, id);
				pstmt.setString(2, pwd);
				rs= pstmt.executeQuery();
				if(rs.next()) { 
					result = true;
				}
				else
					result = false;
				
		}catch(Exception e) {
			System.out.println("login error"+e);
		}
		finally {
			close(conn,pstmt,rs);
		}
		return result;
	}
}
