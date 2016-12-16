package com.example;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

/**
 * Created by kuswaha on 12/15/16.
 */
@Configuration
public class Config  extends ResourceConfig{
    public Config(){
        register(StudentResource.class);
    }

}

