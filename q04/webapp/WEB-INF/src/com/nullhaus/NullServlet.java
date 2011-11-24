package com.nullhaus;

import javax.servlet.annotation.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

@WebServlet("/security/*")
public class NullServlet extends HttpServlet {
    public void doGet(HttpServletRequest req,
                      HttpServletResponse resp) throws IOException {
    
        resp.getWriter().println(req.getServletPath());
        resp.getWriter().println(req.getPathInfo());
    }
}

