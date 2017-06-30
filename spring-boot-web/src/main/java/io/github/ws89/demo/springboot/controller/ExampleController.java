package io.github.ws89.demo.springboot.controller;

import io.github.ws89.demo.springboot.controller.beans.YamlConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * Created by WS on 2017/6/22.
 */


@RestController
public class ExampleController {

    @RequestMapping("/")
    String home(){
        return "Hello World! from Spring boot!";
    }


    @Value("${name}")
    private String name;

    @RequestMapping("/externalization_default_value")
    String defaultValue(){
        return name;
    }


    @RequestMapping("/random_value")
    String randomValue(@Value("${random.value}") String value
                        ,@Value("${random.int}") int randomInt
                        ,@Value("${random.long}") long randomLong
                        ,@Value("${random.uuid}") String uuid
                        ,@Value("${random1.less.than.ten}") int lessThanTen
                        ,@Value("${random1.in.range}") int intInRange
                        ){

        Object[] objects = {value
                            ,randomInt
                            ,randomLong
                            ,uuid
                            ,lessThanTen
                            ,intInRange
                            };

        return Arrays.toString(objects);
    }


    @Value("${parent.child.field}")
    private String yamlValue;

    @Autowired
    private YamlConfig yamlConfig;

    @RequestMapping("/yaml_value")
    String yaml(@Value("${parent.child2.field}") String child2Field){

        Object[] objects = new Object[]{ yamlValue
                                         ,child2Field
                                         ,yamlConfig.getValue()
                                        };

        return Arrays.toString( objects );
    }

}
