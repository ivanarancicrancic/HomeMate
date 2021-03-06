package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AthensS extends HttpServlet {	
    /**
     * @param request
     * @param response
     * @throws javax.servlet.ServletException
     * @throws java.io.IOException
     */
    @Override
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
            response.setContentType("text/html");    
            PrintWriter out = response.getWriter();
            String c="Athens";    
            HttpSession session = request.getSession(false);     
            if(session!=null) {
                session.setAttribute("city",c);
            }
            RequestDispatcher rd=request.getRequestDispatcher("city.jsp");
            rd.forward(request,response);    
	}
}
