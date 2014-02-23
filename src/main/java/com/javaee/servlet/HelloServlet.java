package com.javaee.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Bill on 2/19/14.
 */
@WebServlet(name="hello", urlPatterns="/HelloServlet")
public class HelloServlet  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (final PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>My Hello Servlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Hello Servlet</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
