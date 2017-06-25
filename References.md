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










# References

http://projects.spring.io/spring-boot/

https://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/htmlsingle

https://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/htmlsingle/#using-boot-configuration-classes



### Problems

[No valid Maven installation found. Either set the home directory in the configuration dialog or set the M2_HOME environment variable on your system](https://stackoverflow.com/questions/20031182/no-valid-maven-installation-found-either-set-the-home-directory-in-the-configur)





---

created at 2017-06-22 19:57