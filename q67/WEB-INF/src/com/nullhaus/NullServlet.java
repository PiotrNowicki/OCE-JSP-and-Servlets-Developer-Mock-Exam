package com.nullhaus;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(urlPatterns = "/foo/*", name="NullServlet", asyncSupported=true)
public class NullServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException {

		final AsyncContext ac = req.startAsync();
			
		try {
			Class lClass = Class.forName("com.nullhaus.MyListener");
			AsyncListener al = ac.createListener(lClass);
		
			ac.addListener(al);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();		
		}

		ac.setTimeout(3000);

		ac.start(new Thread() {
			public void run() {
				try {
					this.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();				
				}
				ac.complete();
			}
		});
	}
}
