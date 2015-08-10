package com.goeswhere.minwizard;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class App extends Application<SimpleConfiguration> {
    public static void main(String[] args) throws Exception {
        new App().run(args);
    }

    @Override
    public String getName() {
        return "hello-world";
    }

    @Override
    public void initialize(Bootstrap<SimpleConfiguration> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(SimpleConfiguration configuration,
                    Environment environment) {
        final SimpleResource resource = new SimpleResource(configuration.defaultName);
        environment.jersey().register(resource);
    }

}
