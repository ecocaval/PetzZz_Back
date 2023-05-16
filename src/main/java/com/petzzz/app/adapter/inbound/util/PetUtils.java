package com.petzzz.app.adapter.inbound.util;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.core.env.Environment;

import java.net.InetAddress;
import java.net.URI;
import java.net.UnknownHostException;

public class PetUtils {

    private static final PetUtils INSTANCE = new PetUtils();
    private static final String URI_SEPARATOR = "/";
    private PetUtils() {}
    public static PetUtils getInstance() {
        return INSTANCE;
    }

    public URI buildApplicationUriAfterCreate(Environment env, String context, HttpServletRequest request, String addressId) {
        try {
            var servletPath = request.getServletPath();

            if (!servletPath.endsWith(URI_SEPARATOR)) {
                servletPath = servletPath + URI_SEPARATOR;
            }

            var host = findLocalHostAddress();
            var port = findLocalHostPort(env);
            var applicationUri = String.format("http://%s/%s/%s/%s/%s", host, port, context.replace(URI_SEPARATOR, ""), servletPath.replace(URI_SEPARATOR, ""),addressId);

            return new URI(applicationUri);
        } catch (Exception e) {
            return null;
        }
    }

    private Integer findLocalHostPort(Environment env) {
        return env.getProperty("server.port", Integer.class, 8080);
    }

    private String findLocalHostAddress() throws UnknownHostException {
        return InetAddress.getLocalHost().getHostAddress();
    }

}
