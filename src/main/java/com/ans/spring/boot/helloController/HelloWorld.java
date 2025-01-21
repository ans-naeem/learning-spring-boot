package com.ans.spring.boot.helloController;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @Cacheable("hello")
    @RequestMapping("/hello")
    public String hello()
    {
        System.out.println("goint to db and doing some very expensive task here.");
        return "Salam!!";
    }

    @RequestMapping("/greet")
    public String greet()
    {
        return "how you doing Sir!";
    }
}
