package Cookies;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookie")
public class Sample1 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		String name=req.getParameter("name");
		System.out.println("class1"+" "+name);
		Cookie cookie=new Cookie("k1", name);
		resp.addCookie(cookie);
		
		
		resp.getWriter().print("<a href='coo'>Click Here</a>");
	}

}
