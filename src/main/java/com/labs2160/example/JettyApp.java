package com.labs2160.example;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.server.ServerProperties;
import org.glassfish.jersey.servlet.ServletContainer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JettyApp {

    private static final Logger logger = LoggerFactory.getLogger(JettyApp.class);

    public static final int SERVER_PORT = 8080;

    public static void main(String[] args) throws Exception {

        ServletHolder jerseyServlet = new ServletHolder(ServletContainer.class);
        jerseyServlet.setInitOrder(0);

        final String scanPackages = "com.labs2160.example.rs"; // comma-delimeted packages
        logger.info("Scanning for REST components under packages: {}", scanPackages);
        jerseyServlet.setInitParameter(ServerProperties.PROVIDER_PACKAGES, scanPackages);

        Server server = new Server(SERVER_PORT);
        ServletContextHandler sch = new ServletContextHandler(server, "/", ServletContextHandler.SESSIONS);
        sch.addServlet(jerseyServlet, "/jetty-jersey/*");

        try {
	        server.start();
	        server.join();
        } finally {
        	server.destroy();
        }
    }
}
