package lib.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import lib.service.Service;

public class DeleteController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session = request.getSession();
		String name = (String)session.getAttribute("name");
	//	String name = (String)request.getAttribute("name");
		Service s = Service.getInstance();
		s.delete(name);
		
		HttpUtil.forward(request, response, "/deleteOutput.jsp");
	}

}
