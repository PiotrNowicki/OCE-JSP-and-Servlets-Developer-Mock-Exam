package com.nullhaus;

import java.io.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import javax.servlet.*;

@WebServlet(urlPatterns = {"/baz/*"}, name = "My Servlet")
public class NullServlet2 extends HttpServlet {
    public void doGet(HttpServletRequest req,
                      HttpServletResponse resp) throws ServletException, IOException {
    
        resp.getWriter().println("Testing!");
    }
}

