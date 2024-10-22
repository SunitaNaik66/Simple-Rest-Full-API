package com.SimpleRestApi.RestController;

import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/msg")
    public String getMsgs(){
        String msg="wellcome to my world";
        return msg;
    }

    @GetMapping("/greet")
    public  String greet(@PathParam("name") String name){
        String greet= name +" "+ "good morning";
        return  greet;
    }
}
