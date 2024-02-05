package com.numetry.servlet;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/firsturl")
public class FirstServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String p=request.getParameter("password");
		if(p.equals("numetry")){
			RequestDispatcher rd=request.getRequestDispatcher("welcome");
			rd.forward(request, response);
			
		}
		else{
			out.print("<h1 style='color:red;text-align:center'>Invalid Username and Password!</h1>");
			RequestDispatcher rd=request.getRequestDispatcher("login.html");
			rd.include(request, response);
		}
		
	}

}
