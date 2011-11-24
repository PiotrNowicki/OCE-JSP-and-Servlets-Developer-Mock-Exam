package com.nullhaus;

import javax.servlet.annotation.ServletSecurity.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import java.io.*;

@ServletSecurity(@HttpConstraint(EmptyRoleSemantic.DENY))
@WebServlet(value = "/foo/*", name = "NullServlet")
public class NullServlet extends HttpServlet {
    public void doGet(HttpServletRequest req,
                      HttpServletResponse resp) throws IOException {
        resp.getWriter().print("Howdy Stragers!");
    }
}
