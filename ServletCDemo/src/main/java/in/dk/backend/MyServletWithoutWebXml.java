package in.dk.backend;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/link")
public class MyServletWithoutWebXml extends HttpServlet {
@Override
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter pw = response.getWriter();
	pw.print("i am in service() method of MyServlet Without web.xml file using annotation.");
	System.out.println("i am in service() method of MyServlet Without web.xml file using annotation.");
}
}
