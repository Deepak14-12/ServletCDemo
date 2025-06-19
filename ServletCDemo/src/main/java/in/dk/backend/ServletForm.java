package in.dk.backend;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/loginform")
public class ServletForm extends HttpServlet{
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String name = req.getParameter("name1");
	String email = req.getParameter("email1");
	
	PrintWriter pw = resp.getWriter();
	pw.println("name: "+name);
	pw.println("email: "+email);
	
	System.out.println("name: "+name);
	System.out.println("email: "+email);
}

}
