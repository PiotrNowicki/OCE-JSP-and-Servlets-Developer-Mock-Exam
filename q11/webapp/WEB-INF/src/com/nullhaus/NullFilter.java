package com.nullhaus;

import javax.servlet.*;

public class NullFilter implements Filter {
	static int count;

    	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) {
		System.out.println("FILTERING!");
        }

 	public void init(FilterConfig filterConfig) {
		System.out.println("INITIALIZING! [" + count++ + "]");
	}
}
