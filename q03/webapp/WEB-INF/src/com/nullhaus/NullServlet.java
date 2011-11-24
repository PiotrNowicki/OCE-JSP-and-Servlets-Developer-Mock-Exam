package com.nullhaus;

import javax.servlet.annotation.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

@WebServlet("/myServlet")
public class NullServlet extends HttpServlet {
    public void doPost(HttpServletRequest req,
                       HttpServletResponse resp) throws IOException {
        String[] param = req.getParameterValues("var");
    
        resp.getWriter().println(Arrays.toString(param));
    }
}

