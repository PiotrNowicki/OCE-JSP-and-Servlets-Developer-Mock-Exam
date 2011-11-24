package com.nullhaus;

import javax.servlet.annotation.*;
import javax.servlet.*;

@WebFilter(urlPatterns = {"/*"}, filterName="MyFilter 1")
public class NullFilter implements Filter {
	static int count;

    	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) {
		System.out.println("FILTERING!");
        }

 	public void init(FilterConfig filterConfig) {
		System.out.println("INITIALIZING q13! [" + count++ + "]");
	}
}
