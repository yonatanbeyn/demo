package com.example.controller;

import com.example.JPointer;
import jakarta.json.*;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.io.IOException;
import java.io.InputStream;

@Path("/hello")
public class ExampleResource {
// get call
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() throws IOException {

            return JPointer.main1();
        }
    }
