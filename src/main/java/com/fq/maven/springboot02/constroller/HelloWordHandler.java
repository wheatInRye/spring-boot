package com.fq.maven.springboot02.constroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordHandler {

    @RequestMapping("/hello")
    public String hello(){

        return "Hello word!";
    }
}
