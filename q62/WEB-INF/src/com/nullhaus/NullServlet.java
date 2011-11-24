package com.nullhaus;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(urlPatterns = "/foo/*", name="NullServlet", asyncSupported=true)
public class NullServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		req.setAttribute("Hello", "World");

		final AsyncContext ac = req.startAsync();
		ac.setTimeout(-2);

		ac.start(new Runnable() {
			public void run() {
				String attr = (String)ac.getRequest().getAttribute("Hello");

				try {
					PrintWriter pw = ac.getResponse().getWriter();
					pw.println("Async! Value of Hello is: " + attr);
				} catch (IOException e) {
					e.printStackTrace();
				}

				ac.complete();
			}
		});
	}
}
