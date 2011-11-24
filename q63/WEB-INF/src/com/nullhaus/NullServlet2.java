package com.nullhaus;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(urlPatterns = "/baz/*", name="NullServlet2", asyncSupported=true)
public class NullServlet2 extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		req.setAttribute("Hello", "World");

		final AsyncContext ac = req.startAsync();
		ac.dispatch();
	}
}
