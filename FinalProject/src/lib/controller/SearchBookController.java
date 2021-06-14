package lib.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lib.service.Service;
import lib.vo.Book;

public class SearchBookController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name = request.getParameter("name");
		Book book = new Book(name);
		
		Service s = Service.getInstance();
		String pub = s.searchBook(name);
		String auth = s.searchBook2(name);
		int stck = s.searchBook3(name);
		
		book.setPublisher(pub);
		book.setAuthor(auth);
		book.setStock(stck);
		
		request.setAttribute("name", name);
		request.setAttribute("pub", pub);
		request.setAttribute("auth", auth);
		request.setAttribute("stck", stck);
		HttpUtil.forward(request, response, "/searchBookResult.jsp");

	}

}
