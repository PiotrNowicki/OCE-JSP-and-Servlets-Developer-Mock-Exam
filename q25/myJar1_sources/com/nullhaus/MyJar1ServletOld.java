package com.nullhaus;

import javax.servlet.annotation.*;
import javax.servlet.http.*;
import java.io.*;

public class MyJar1ServletOld extends HttpServlet {
    public void doGet(HttpServletRequest req,
                      HttpServletResponse resp) throws IOException {
        resp.getWriter().print("Howdy Stragers! Servlet without annotations from myJar1 reporting in!");
    }
}
