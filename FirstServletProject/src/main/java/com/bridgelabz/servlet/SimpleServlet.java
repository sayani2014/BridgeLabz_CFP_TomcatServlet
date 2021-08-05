/**
 * UC1 : Create my First Servlet
 * 
 * @author SAYANI KOLEY
 * @since 05.08.2021
 */

package com.bridgelabz.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * Purpose : Annotation used to declare a servlet. 
 */

@WebServlet("/SimpleServlet")

/*
 * Purpose : Creating a SimpleServlet class
     * 			 The HttpServlet is an abstract class which contains methods that needs to be overridden 
     * 			 by the SimpleServlet class
 */

public class SimpleServlet extends HttpServlet {
	
	/*
	 * Purpose : Method to allow a servlet to handle a GET request. 
	 */
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h3>Hello World Sayani My First Servlet!</h3>");
		out.close();
	}
}
