package com.nullhaus;

import javax.servlet.annotation.*;
import javax.servlet.http.*;
import java.io.*;

@WebServlet("/foo/*")
public class NullServlet extends HttpServlet {
    public void doGet(HttpServletRequest req,
                      HttpServletResponse resp) throws IOException {
    
	InputStream is = getServletContext().getResourceAsStream("/test.jsp");
	byte[] b = new byte[is.available()];
	is.read(b);

        resp.getWriter().print(new String(b));
    }
}
