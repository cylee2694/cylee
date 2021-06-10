package lib.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import lib.vo.Account;

public class LibDao {
	
	private static LibDao dao = new LibDao();
	private LibDao() {}
	public static LibDao getInstance() {
		return dao;
	}
	
public Connection connect() {
		
		Connection conn = null;
		try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "rosmrtl1@3");
			
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
				pstmt = conn.prepareStatement("select * from account where id = ? and pwd = ?;");
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
	
	
	public boolean login2(String id, String pwd) {
		// TODO Auto-generated method stub
		boolean result = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs= null;
		try {
				conn = connect();
				pstmt = conn.prepareStatement("select * from admin where id = ? and pwd = ?;");
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
	public void join(Account account) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
				conn = connect();
				pstmt = conn.prepareStatement("insert into account values(?,?);");
				pstmt.setString(1, account.getId());
				pstmt.setString(2, account.getPwd());
				pstmt.executeUpdate();
		}catch(Exception e) {
			System.out.println("join error"+e);
		}
		finally {
			close(conn,pstmt);
		}
	}
}
