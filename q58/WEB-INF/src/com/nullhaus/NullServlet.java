package com.nullhaus;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(urlPatterns = "/foo/*", name="NullServlet", asyncSupported=true)
public class NullServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) {

		final AsyncContext ac = req.startAsync();

		ac.start(new Runnable() {
			public void run() {
				ac.dispatch("/page.html");
				ac.complete();
			}
		});
	}
}
