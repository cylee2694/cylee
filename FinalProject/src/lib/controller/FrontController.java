package lib.controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FrontController extends HttpServlet{
	HashMap<String, Controller> map = null;

	
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		map = new HashMap<String, Controller>();
		map.put("/login.do", new LoginController());
		map.put("/join.do", new JoinController());
		map.put("/searchBook.do", new SearchBookController());
		map.put("/searchBook2.do", new SearchBookController2());
		map.put("/searchBook3.do", new SearchBookController3());
		map.put("/register.do", new RegisterController());
		map.put("/delete.do", new DeleteController());
		map.put("/showBorrow.do", new ShowBorrowController());
		map.put("/borrowBook.do", new BorrowBookController());
		map.put("/returnBook.do", new ReturnBookController());
		
		
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uri = req.getRequestURI();
		String contextPath = req.getContextPath();
		String path = uri.substring(contextPath.length());
		
		System.out.println(path);
		
		Controller cont = map.get(path);
		cont.execute(req, resp);
	}
}
