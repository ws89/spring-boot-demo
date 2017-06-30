package io.github.ws89.demo.springboot.controller.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by mikon on 2017-06-30.
 */
@ConfigurationProperties(prefix = "config")
@Component
public class YamlConfig {

    private String value;

    public String getValue(){
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
