package com.zsw.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZhangShaowei on 2020/12/22 15:29
 */
@RestController
public class HelloWorldApi {

    @GetMapping("hello")
    public String hello(@RequestParam("name") String name) {
        return "hello " + name;
    }

    @GetMapping("helloworld")
    public String helloworld() {
        return "Hello World";
    }

}
