package lib.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lib.service.Service;
import lib.vo.Borrow;

public class ShowBorrowController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		

		ArrayList<Borrow> list = new ArrayList<Borrow>();
		
		
		Service s = Service.getInstance();
		list = s.showBorrow();
		
		request.setAttribute("list", list);
		
		HttpUtil.forward(request, response, "/showOutput.jsp");
	}

}
