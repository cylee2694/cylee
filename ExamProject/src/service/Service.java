package service;

import dao.Dao;
import service.Service;

public class Service {
	private static Service service = new Service();
	private Service() {}
	private Dao dao = Dao.getInstance();
	public static Service getInstance() {
		return service;
	}
	public boolean login(String id, String pwd) {
		// TODO Auto-generated method stub
		return dao.login(id,pwd);
	}
	public void registerSubject(String Sid, String title, String num, String id) {
		// TODO Auto-generated method stub
		dao.registerSubject(Sid,title,num,id);
	}
	public boolean login2(String id, String pwd) {
		// TODO Auto-generated method stub
		return dao.login2(id,pwd);
	}
	public String EnrollSubject(String id) {
		// TODO Auto-generated method stub
		return dao.EnrollSubject(id);
		
	}
}
