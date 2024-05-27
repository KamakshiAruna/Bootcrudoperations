package Http_session_tracking;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/session")
public class Sample1 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		String name=req.getParameter("name");
		System.out.println("Class1"+" "+name);
		
		HttpSession session=req.getSession();
		session.setAttribute("k1", name);
		resp.getWriter().print("<a href='cls2'>click here</a>");
	}

}
