package com.lib.book.shop.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LibContextListener implements ServletContextListener {
	public void contextDestroyed(ServletContextEvent ctxEvent) {
	}

	public void contextInitialized(ServletContextEvent ctxEvent) {
		ServletContext ctx = ctxEvent.getServletContext();
		String path = ctx.getRealPath("/") + "logs\\";
		System.setProperty("lib.root.path", path);
		String str = ctx.getRealPath("/WEB-INF/classes/lib-log4j.properties");
		PropertyConfigurator.configure(str);
		Logger log = Logger.getLogger(this.getClass());
		log.info("Properties file :" + str);
	}
}