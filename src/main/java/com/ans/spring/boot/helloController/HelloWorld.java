package com.ans.spring.boot.helloController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @RequestMapping("/hello")
    public String hello()
    {
        return "Salam!!";
    }

    @RequestMapping("/greet")
    public String greet()
    {
        return "how you doing Sir!";
    }
}
