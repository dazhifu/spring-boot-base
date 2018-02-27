package com.mlink.xjdp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mlink.xjdp.dao")
public class Application {
    public static void main(String[] args) {


        SpringApplication.run(Application.class, args);
        System.out.println("ertet");
    }
}

