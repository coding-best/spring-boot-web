package org.szcoders.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootWebApplication {

    public static void main (String[] args) {
        SpringApplication.run(SpringBootWebApplication.class, args);
        System.out.println("*************************** spring-boot-web 启动成功 ****************************");
    }
}
