package xshop.app;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;

import java.io.PrintWriter;
import java.io.IOException;


public class HomeServlet extends HttpServlet{

	 protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		   resp.sendRedirect("user-login");
	}
}