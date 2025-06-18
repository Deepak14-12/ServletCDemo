package in.dk.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Register extends HttpServlet{
@Override
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//for web 
	PrintWriter pw = response.getWriter();
	pw.print("i am here at register.....");
	//for console
	System.out.println("i am in service of Register....");
}
}
