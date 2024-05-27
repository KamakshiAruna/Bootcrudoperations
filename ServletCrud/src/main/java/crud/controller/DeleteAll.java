package crud.controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import crud.dao.StudentDao;

@WebServlet("/dall")
public class DeleteAll extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		StudentDao dao=new StudentDao();
		String msg=dao.deleteAll();
		res.getWriter().print(msg);
		
	}

}
