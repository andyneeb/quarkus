package org.acme.quickstart;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {

    private static final String HELLO = "Hello ";

    public String greeting(String name) {
        return HELLO + name;
    }

}
