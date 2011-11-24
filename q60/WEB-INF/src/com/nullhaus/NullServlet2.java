package com.nullhaus;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(urlPatterns = "/baz/*", name="NullServle2", asyncSupported=false)
public class NullServlet2 extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

		resp.getWriter().println("Howdy from NullServlet2!");

		req.getRequestDispatcher("/foo").forward(req, resp);
	}
}
