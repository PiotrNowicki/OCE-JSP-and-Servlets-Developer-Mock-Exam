package com.nullhaus;

import javax.servlet.annotation.*;
import javax.servlet.http.*;
import java.io.*;

@WebServlet("/myServlet")
public class NullServlet extends HttpServlet {
    public void doPost(HttpServletRequest req,
                       HttpServletResponse resp) throws IOException {
        String param = req.getParameter("var");
    
        resp.getWriter().println("[" + param + "]");
    }
}

