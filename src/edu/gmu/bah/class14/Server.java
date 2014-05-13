package edu.gmu.bah.class14;

import java.net.URI;

public class Server {
    public static final String BASE_URI = "http://localhost:8080/gmulibrary";

    public static HttpServer startServer() {
        ResourceConfig config = new ResourceConfig().packages("edu.gmu.library.rest");

        return GrizzlyHttpServerFactory.createHttpServer(URI.create(BASE_URI),config);
    }

    public static void main(String[] args) throws Exception {
        final HttpServer server = startServer();
        System.out.printf("Jersey library app started with WADL available at"
         + "%s application.wadl\nHit enter to stop it...\n",BASE_URI);
        System.in.read();
        server.shutdownNow();
    }
}