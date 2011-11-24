package com.nullhaus;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebListener
public class MyListener implements AsyncListener {
	public void onComplete(AsyncEvent event) {
		System.out.println("#Async listener [onComplete]");
	}

	public void onError(AsyncEvent event) {
		System.out.println("#Async listener [onError]");
	}

	public void onStartAsync(AsyncEvent event) {
		System.out.println("#Async listener [onStartAsync]");
	}

 	public void onTimeout(AsyncEvent event)  {
		System.out.println("#Async listener [onTimeout]");
	}
}
