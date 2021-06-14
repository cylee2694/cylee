package lib.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import lib.service.Service;

public class ReturnBookController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session = request.getSession();
		String id = (String)session.getAttribute("id");
		String name = request.getParameter("name");
		
		Service s = Service.getInstance();
		s.returnBook(id,name);
		
		HttpUtil.forward(request, response, "/returnOutput.jsp");
		
	}

}
