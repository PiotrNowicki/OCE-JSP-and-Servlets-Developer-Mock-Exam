package com.nullhaus;

import javax.servlet.annotation.*;
import javax.servlet.http.*;
import java.io.*;

@WebServlet(name="NullServlet")
public class NullServlet extends HttpServlet {
    public void doGet(HttpServletRequest req,
                      HttpServletResponse resp) throws IOException {
        resp.getWriter().print("Howdy Stragers!");
    }
}
