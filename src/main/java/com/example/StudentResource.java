package com.example;

import org.springframework.stereotype.Component;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;

/**
 * Created by kuswaha on 12/15/16.
 */

@Component
@Path("/student")
public class StudentResource {
    @GET
    @Produces("application/json")
    public String student(){
        return "hello world";
    }
}

