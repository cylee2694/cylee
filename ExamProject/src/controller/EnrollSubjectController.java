package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.Service;

public class EnrollSubjectController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
		
		Service s = Service.getInstance();
		String subName = s.EnrollSubject("id"); //°ú¸ñ¸í
		
		request.setAttribute("subName", subName);
		HttpUtil.forward(request, response, "/result/enrollSubjectResult.jsp");
		
		
	}

}
