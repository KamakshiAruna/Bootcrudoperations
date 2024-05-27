package crud.controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import crud.dao.StudentDao;
import crud.dto.StudentDto;

@WebServlet("/update")
public class Update extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String id=req.getParameter("id");
		String name=req.getParameter("name");
		int cid=Integer.parseInt(id);
		
		StudentDto dto=new StudentDto();
		dto.setId(cid);
		dto.setName(name);
		
		StudentDao dao=new StudentDao();
		String msg=dao.update(dto);
		res.getWriter().print(msg);
		
	}

}
