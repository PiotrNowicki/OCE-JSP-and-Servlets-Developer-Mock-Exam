package com.nullhaus;

import javax.servlet.annotation.*;
import javax.servlet.http.*;
import java.io.*;

@WebServlet(urlPatterns={"/foo/*"}, 
            name="NullHaus1", 
            initParams=@WebInitParam(name="var1", value="Howdy!"))
public class NullHausServlet extends HttpServlet {
    public void doGet(HttpServletRequest req,
                      HttpServletResponse resp) throws IOException {
         String param = getInitParameter("var1");
         resp.getWriter().print("Parameter Value: " + param);
    }
}
