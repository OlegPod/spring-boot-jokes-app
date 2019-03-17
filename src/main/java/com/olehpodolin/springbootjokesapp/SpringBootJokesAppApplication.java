package com.olehpodolin.springbootjokesapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:jokes-config.xml")
public class SpringBootJokesAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJokesAppApplication.class, args);
    }

}
