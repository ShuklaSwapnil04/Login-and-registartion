package com.webapp.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
/*import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;*/

public class WordCountWebConfig{ //implements WebApplicationInitializer {

//@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub
		/*
		 * XmlWebApplicationContext webAC= new XmlWebApplicationContext();
		 * webAC.setConfigLocation("classpath:appconfig.xml");
		 */
		
		/*
		 * AnnotationConfigWebApplicationContext wac= new
		 * AnnotationConfigWebApplicationContext();
		 * wac.register(SpringApplicationConfig.class);
		 * 
		 * DispatcherServlet ds= new DispatcherServlet(wac);
		 * 
		 * ServletRegistration.Dynamic servlet=servletContext.addServlet("MyDS", ds);
		 * servlet.setLoadOnStartup(1); servlet.addMapping("/wordcount.com/*");
		 */
	}

}
