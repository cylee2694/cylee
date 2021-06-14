package lib.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import lib.vo.Account;
import lib.vo.Borrow;

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
	public String searchBook(String name) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs= null;
		
		String pub = null;
		try {
				conn = connect();
				pstmt = conn.prepareStatement("select publisher from book where name = ?;");
				pstmt.setString(1, name);
				rs= pstmt.executeQuery();
				
				if(rs.next()) {
					
					pub = rs.getString(1);
				}
				
			}catch(Exception e) {
				System.out.println("search error"+e);
			}
			finally {
				close(conn,pstmt,rs);
		}
		return pub;
	}
	public void register(String name, String publisher, String author, String stock) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
				conn = connect();
				pstmt = conn.prepareStatement("insert into book values(?,?,?,?);");
				pstmt.setString(1, name);
				pstmt.setString(2, publisher);
				pstmt.setString(3, author);
				pstmt.setString(4, stock);
				pstmt.executeUpdate();
		}catch(Exception e) {
			System.out.println("register error"+e);
		}
		finally {
			close(conn,pstmt);
		}
	}
	public String searchBook2(String name) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs= null;
		
		String auth = null;
		try {
				conn = connect();
				pstmt = conn.prepareStatement("select author from book where name = ?;");
				pstmt.setString(1, name);
				rs= pstmt.executeQuery();
				
				if(rs.next()) {
					
					auth = rs.getString(1);
				}
				
			}catch(Exception e) {
				System.out.println("search error"+e);
			}
			finally {
				close(conn,pstmt,rs);
		}
		return auth;
	}
	
	public int searchBook3(String name) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs= null;
		
		int stck = 0;
		try {
				conn = connect();
				pstmt = conn.prepareStatement("select stock from book where name = ?;");
				pstmt.setString(1, name);
				rs= pstmt.executeQuery();
				
				if(rs.next()) {
					
					stck = rs.getInt(1);
				}
				
			}catch(Exception e) {
				System.out.println("search error"+e);
			}
			finally {
				close(conn,pstmt,rs);
		}
		return stck;
	}
	public void delete(String name) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs= null;
		
		try {
				conn = connect();
				pstmt = conn.prepareStatement("delete from book where name = ?;");
				pstmt.setString(1, name);
				pstmt.executeUpdate();
				
				
			}catch(Exception e) {
				System.out.println("delete error"+e);
			}
			finally {
				close(conn,pstmt,rs);
		}
	}
	public ArrayList<Borrow> showBorrow() {
		// TODO Auto-generated method stub
		
		ArrayList<Borrow> list = new ArrayList<Borrow>();
	
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs= null;
		
		Borrow borrow = null;
		try {
				conn = connect();
				pstmt = conn.prepareStatement("select * from borrow;");
				rs= pstmt.executeQuery();
				
				while(rs.next()) {
					borrow = new Borrow();
					borrow.setBorrower(rs.getString(1));
					borrow.setBname(rs.getString(2));
					borrow.setTime(rs.getString(3));
					list.add(borrow);
					
				}
				
			}catch(Exception e) {
				System.out.println("show error"+e);
			}
			finally {
				close(conn,pstmt,rs);
		}
		return list;
	}
	public void borrowBook(String id, String name) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs= null;
		
		try {
				conn = connect();
				pstmt = conn.prepareStatement("insert into borrow values(?,?,CURRENT_TIMESTAMP);");
				pstmt.setString(1, id);
				pstmt.setString(2, name);
				pstmt.executeUpdate();
				
				pstmt = conn.prepareStatement("update book set stock = stock - 1 where name = ?;");
				pstmt.setString(1, name);
				pstmt.executeUpdate();
				
			}catch(Exception e) {
				System.out.println("borrow error"+e);
			}
			finally {
				close(conn,pstmt,rs);
		}
	}
	public void returnBook(String id, String name) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs= null;
		
		try {
				conn = connect();
				pstmt = conn.prepareStatement("delete from borrow where borrower = ? and bname = ?;");
				pstmt.setString(1, id);
				pstmt.setString(2, name);
				pstmt.executeUpdate();
				
				pstmt = conn.prepareStatement("update book set stock = stock + 1 where name = ?;");
				pstmt.setString(1, name);
				pstmt.executeUpdate();
				
			}catch(Exception e) {
				System.out.println("return error"+e);
			}
			finally {
				close(conn,pstmt,rs);
		}
	}
}
