package crud.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import crud.dao.StudentDao;
import crud.dto.StudentDto;

@WebServlet("/fall")
public class FetchAll extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		StudentDao dao=new StudentDao();
		List<StudentDto> l=dao.fetchAll();
		//res.getWriter().print(l);
		req.setAttribute("data", l);
		RequestDispatcher rd=req.getRequestDispatcher("fetchall.jsp");
		rd.forward(req, res);
		
	}

}
