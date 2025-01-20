package com.lib.book.shop.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;

public class LibContextListener implements ServletContextListener {

    private static final Logger logger = LogManager.getLogger(LibContextListener.class);

    @Override
    public void contextDestroyed(ServletContextEvent ctxEvent) {
        // Optional: Perform any Log4j cleanup here
        logger.info("Context destroyed.");
    }

    @Override
    public void contextInitialized(ServletContextEvent ctxEvent) {
        ServletContext ctx = ctxEvent.getServletContext();

        // Set the custom property for log file path
        String path = ctx.getRealPath("/") + "logs/";
        System.setProperty("lib.root.path", path);

        // Get the path to the Log4j 2 configuration file
        String configFilePath = ctx.getRealPath("/WEB-INF/classes/lib-log4j2.properties");

        // Configure Log4j 2
        Configurator.initialize(null, configFilePath);

        logger.info("Log4j 2 initialized with configuration file: " + configFilePath);
    }
}
