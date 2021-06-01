package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import controller.HttpUtil;
import service.Service;

public class LoginController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String name = request.getParameter("name");
		
		Service s = Service.getInstance();
		boolean result = s.login(id,pwd);
		boolean result2 = s.login2(id,pwd);
		String path = null;
		
		if(name.equals("stud")) {
			if(result) {
				HttpSession session = request.getSession();
				session.setAttribute("id", id);
				path = "/StudentMenu.jsp";
			}
			else {
				path = "/login.jsp";
			}
		}
		
		if(name.equals("prof")) {
			if(result2) {
				HttpSession session = request.getSession();
				session.setAttribute("id", id);
				path = "/ProfessorMenu.jsp";
			}
			else {
				path = "/login.jsp";
			}
		}
		HttpUtil.forward(request, response, path);
	}

}
