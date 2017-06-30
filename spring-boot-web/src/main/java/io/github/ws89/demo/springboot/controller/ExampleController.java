package io.github.ws89.demo.springboot.controller;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by WS on 2017/6/22.
 */


@RestController
// @SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
//@EnableAutoConfiguration
//@ComponentScan
//@Configuration
public class ExampleController {

    @RequestMapping("/")
    String home(){
        return "Hello World! from Spring boot!";
    }

}
