package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.HttpUtil;
import service.Service;

public class RegisterSubjectController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String Sid = request.getParameter("id");
		String title = request.getParameter("title");
		String num = request.getParameter("num");
		String id = (String)request.getSession().getAttribute("id");
		
		Service s = Service.getInstance();
		s.registerSubject(Sid,title,num,id);
		
		HttpUtil.forward(request, response, "/result/registerSubjectResult.jsp");
		
		
	}

}
