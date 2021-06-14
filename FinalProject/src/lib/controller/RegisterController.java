package lib.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lib.service.Service;

public class RegisterController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String publisher = request.getParameter("publisher");
		String author = request.getParameter("author");
		String stock = request.getParameter("stock");
		
		Service s = Service.getInstance();
		s.register(name, publisher, author, stock);
		
		HttpUtil.forward(request, response, "/registerOutput.jsp");
	}

}
