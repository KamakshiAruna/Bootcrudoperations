package crud.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import crud.dao.StudentDao;
import crud.dto.StudentDto;

@WebServlet("/did")
public class DeleteById extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		String pk=req.getParameter("pk");
		int cid=Integer.parseInt(pk);
		
		StudentDao dao=new StudentDao();
	   String msg=dao.deleteById(cid);
	   resp.getWriter().print(msg);
	}

}
