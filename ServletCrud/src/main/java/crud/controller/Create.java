package crud.controller;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import crud.dao.StudentDao;
import crud.dto.StudentDto;

@WebServlet("/insert")
public class Create implements Servlet{

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id=req.getParameter("id");
		String name=req.getParameter("name");
		//System.out.println(id+" "+name);
		
		int cid=Integer.parseInt(id);
		StudentDto dto=new StudentDto();
		dto.setId(cid);
		dto.setName(name);
		
		StudentDao dao=new StudentDao();
		String msg=dao.insertData(dto);
		res.getWriter().print(msg);
		
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
