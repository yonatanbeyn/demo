package com.example;

import jakarta.json.*;

import java.io.IOException;
import java.io.InputStream;

public class JPointer {
    public static String main1() throws IOException, IOException {
        try (InputStream is =
                     JPointer.class.getClassLoader().getResourceAsStream("user.json");
             JsonReader jr = Json.createReader(is)) {
            JsonStructure js = jr.read();
            JsonPointer jp = Json.createPointer("/user/profile");
            JsonValue jv = jp.getValue(js);
            return jv.toString();
        }
    }
}