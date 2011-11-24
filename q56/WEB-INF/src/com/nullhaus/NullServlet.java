package com.nullhaus;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(urlPatterns = "/foo/*", name="NullServlet")
public class NullServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("I'm inside!");	

		final AsyncContext ac = req.startAsync();

		ac.start(new Runnable() {
			public void run() {
				System.out.println("*** I'm an async thread!");
				ac.complete();
			}
		});

		System.out.println("I'm leaving! Bye!");
	}
}
