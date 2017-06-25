package controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by WS on 2017/6/22.
 */
@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/")
    String home(){
        return "Hello World! from Spring boot!";
    }


    public static void main(String[] args){
        SpringApplication.run(Example.class,args);
    }

}