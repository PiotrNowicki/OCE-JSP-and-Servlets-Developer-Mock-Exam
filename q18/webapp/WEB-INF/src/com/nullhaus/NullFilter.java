package com.nullhaus;

import javax.servlet.annotation.*;
import javax.servlet.*;
import java.io.*;

public class NullFilter implements Filter {
	static int count;

    	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("FILTERING q18!");
		chain.doFilter(request, response);
        }

 	public void init(FilterConfig filterConfig) {
		System.out.println("INITIALIZING q18! [" + count++ + "]");
	}
}
