

## Features

- Create stand-alone Spring applications
- Embed Tomcat, Jetty or Undertow directly (no need to deploy WAR files)
- Provide opinionated 'starter' POMs to simplify your Maven configuration
- Automatically configure Spring whenever possible
- Provide production-ready features such as metrics, health checks and externalized configuration
- Absolutely **no code generation** and **no requirement for XML** configuration




## 15. Configuration classes

Spring Boot favors Java-based configuration. Although it is possible to use`SpringApplication` with an XML sources, we generally recommend that your primary source is a single `@Configuration` class. Usually the class that defines the `main` method is also a good candidate as the primary `@Configuration`.

> Many Spring configuration examples have been published on the Internet that use XML configuration. Always try to use the equivalent Java-based configuration if possible. Searching for `Enable*` annotations can be a good starting point.



## 20.2 Automatic restart

The restart technology provided by Spring Boot works by using two classloaders. Classes that don’t change (for example, those from third-party jars) are loaded into a *base* classloader. Classes that you’re actively developing are loaded into a *restart* classloader. When the application is restarted, the *restart* classloader is thrown away and a new one is created. This approach means that application restarts are typically much
faster than “cold starts” since the *base* classloader is already available and populated.





## 24.1 Configuring random values

Practice:

> io.github.ws89.demo.springboot.controller.ExampleController

```java
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
```

> D:\work\git\ws89\demo\spring-boot-demo\spring-boot-web\src\main\resources\application.properties

```properties
random.value=${random.value}
random.int=${random.int}
random.long=${random.long}
random.uuid=${random.uuid}
random1.less.than.ten=${random.int(10)}
random1.in.range=${random.int[101,103]}
```



**Exception:**

```exception
2017-06-30 14:34:01.900  WARN 13740 --- [nio-8080-exec-1] .w.s.m.s.DefaultHandlerExceptionResolver : Failed to bind request element: org.springframework.web.method.annotation.MethodArgumentTypeMismatchException: Failed to convert value of type 'java.lang.String' to required type 'int'; nested exception is java.lang.NumberFormatException: For input string: "cbd2ac5a265e26171f87e76449f4ffac"
```



**note that**:

```
 Properties are considered in the following order:
 
 11.A RandomValuePropertySource that only has properties in random.*.
 >
 15. Application properties packaged inside your jar (application.properties and YAML variants).
 
PropertySource that returns a random value for any property that starts with "random.". Return a byte[] unless the property name ends with ".int or ".long".
```

> If want to use application.properties configuration, `@Value("${random1.less.than.ten}")` instead of `@Value("${random.less.than.ten}")`



> References:
>
> https://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/htmlsingle/#boot-features-external-config 
>
> https://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/htmlsingle/#boot-features-external-config
>
> http://docs.spring.io/spring-boot/docs/1.2.2.RELEASE/api/org/springframework/boot/context/config/RandomValuePropertySource.html




# References

http://projects.spring.io/spring-boot/

https://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/htmlsingle

https://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/htmlsingle/#using-boot-configuration-classes

https://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/htmlsingle/#using-boot-devtools-restart







### Problems

[No valid Maven installation found. Either set the home directory in the configuration dialog or set the M2_HOME environment variable on your system](https://stackoverflow.com/questions/20031182/no-valid-maven-installation-found-either-set-the-home-directory-in-the-configur)





---

created at 2017-06-22 19:57