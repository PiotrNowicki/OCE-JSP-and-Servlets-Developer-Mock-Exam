package com.nullhaus;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(urlPatterns = "/foo/*", name="NullServlet", asyncSupported=true)
public class NullServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

		if (req.getDispatcherType() == DispatcherType.REQUEST) {
			req.getRequestDispatcher("/baz").forward(req, resp);
		} else if (req.getDispatcherType() == DispatcherType.ASYNC) {
			String hello = (String)req.getAttribute("Hello");

			resp.getWriter().println("Phew, that was a ride!");
			resp.getWriter().println("Oh, by the way, value of Hello is: " + hello);
		}
	}
}
