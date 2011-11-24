package com.nullhaus;

import javax.servlet.annotation.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

@WebServlet(value = "/foo/*", name="NullHaus1")
public class MyJar1Servlet extends HttpServlet {

    static int count;

    public void init(ServletConfig config) throws ServletException {
	System.out.println("########### Initializing Servlet [" + count++ + "]");
        super.init(config);
    }

    public void doGet(HttpServletRequest req,
                      HttpServletResponse resp) throws IOException {
        resp.getWriter().print("Howdy Stragers! Servlet from myJar1 reporting in [" + count +  "]!");
    }
}
