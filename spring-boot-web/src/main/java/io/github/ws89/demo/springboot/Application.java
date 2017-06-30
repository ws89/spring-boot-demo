package io.github.ws89.demo.springboot;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by WS on 2017/6/22.
 */

// @SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
@EnableAutoConfiguration
@ComponentScan
@Configuration
public class Application {


    public static void main(String[] args){

      //  startup1(args);

        startup2(args);
    }

    static void startup1(String[] args){
        SpringApplication.run(Application.class,args);
    }

    static void startup2(String[] args){
        SpringApplication springApplication = new SpringApplication(Application.class);
        springApplication.setBannerMode(Banner.Mode.OFF);
        springApplication.run( args );

    }

}
