package com.nullhaus;

import javax.servlet.*;
import java.util.*;

public class MyInitializer implements ServletContainerInitializer {
    public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {
	try {
		Class<MyJar1Servlet> clazz = (Class<MyJar1Servlet>)Class.forName("com.nullhaus.MyJar1Servlet");
		
		Servlet s = ctx.createServlet(clazz);		
		ServletRegistration.Dynamic d = ctx.addServlet("NullHaus1", s);

		d.addMapping("/baz/*");
		Collection l = d.getMappings();

		System.out.println("##### Servlet registered and created!" + l);
	} catch	(ClassNotFoundException e) {
		e.printStackTrace();
		ctx.addServlet("NullHaus1", "com.nullhaus.MyJar1Servlet");
	}
	
    }
}
