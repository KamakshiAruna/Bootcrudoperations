package crud.controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import crud.dao.StudentDao;
import crud.dto.StudentDto;

@WebServlet("/fid")
public class FetchById extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String pk=req.getParameter("pk");
		int cid=Integer.parseInt(pk);
		
		StudentDao dao=new StudentDao();
		StudentDto dto=dao.fetchById(cid);
		res.getWriter().print(dto);
		
	}
	

}
