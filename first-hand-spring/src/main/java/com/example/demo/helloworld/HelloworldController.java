package com.example.demo.helloworld;

import org.springframework.web.bind.annotation.*;

//Controller
@RestController

public class HelloworldController {


    //GET

    //URI-/hello-world

//    @RequestMapping(method = RequestMethod.GET, path = "/helloworld")
    @GetMapping(path="/helloworld")
    public String helloWorld(){
        return "Hello world";
    }

    @GetMapping(path = "/hello-world")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello world");
    }

    @GetMapping(path = "/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello world , %s",name));
    }
}
