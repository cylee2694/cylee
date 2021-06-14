package lib.service;

import java.util.ArrayList;

import lib.dao.LibDao;
import lib.vo.Account;
import lib.vo.Borrow;

public class Service {
	private static Service service = new Service();
	private Service() {}
	private LibDao dao = LibDao.getInstance();
	public static Service getInstance() {
		return service;
	}
	public boolean login(String id, String pwd) {
		// TODO Auto-generated method stub
		return dao.login(id,pwd);
	}
	public boolean login2(String id, String pwd) {
		// TODO Auto-generated method stub
		return dao.login2(id,pwd);
	}
	public void join(Account account) {
		// TODO Auto-generated method stub
		dao.join(account);
	}
	public String searchBook(String name) {
		// TODO Auto-generated method stub
		return dao.searchBook(name);
	}
	
	public String searchBook2(String name) {
		// TODO Auto-generated method stub
		return dao.searchBook2(name);
	}
	
	public void register(String name, String publisher, String author, String stock) {
		// TODO Auto-generated method stub
		dao.register(name, publisher, author, stock);
	}
	public int searchBook3(String name) {
		// TODO Auto-generated method stub
		return dao.searchBook3(name);
	}
	public void delete(String name) {
		// TODO Auto-generated method stub
		dao.delete(name);
	}
	public ArrayList<Borrow> showBorrow() {
		// TODO Auto-generated method stub
		return dao.showBorrow();
	}
	public void borrowBook(String id, String name) {
		// TODO Auto-generated method stub
		dao.borrowBook(id,name);
	}
	public void returnBook(String id, String name) {
		// TODO Auto-generated method stub
		dao.returnBook(id,name);
	}
}
