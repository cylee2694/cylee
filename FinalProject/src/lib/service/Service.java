package lib.service;

import lib.dao.LibDao;
import lib.vo.Account;

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
}
