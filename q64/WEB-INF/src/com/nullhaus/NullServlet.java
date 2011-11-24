package com.nullhaus;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(urlPatterns = "/foo/*", name="NullServlet", asyncSupported=true)
public class NullServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

		if (req.getDispatcherType() == DispatcherType.REQUEST) {
			AsyncContext ac = req.startAsync();
			ac.dispatch("/baz");
		} else if (req.getDispatcherType() == DispatcherType.ASYNC) {
			resp.getWriter().println("Shotgun!");
		}
	}
}
