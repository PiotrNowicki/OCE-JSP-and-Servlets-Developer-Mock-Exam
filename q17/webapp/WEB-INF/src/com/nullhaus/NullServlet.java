package com.nullhaus;

import java.io.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import javax.servlet.*;

@WebServlet("/foo/*")
public class NullServlet extends HttpServlet {
    public void doGet(HttpServletRequest req,
                      HttpServletResponse resp) throws ServletException, IOException {
    
        //req.getRequestDispatcher("/test").include(req, resp);
	getServletContext().getNamedDispatcher("My Servlet").include(req, resp);
    }
}

