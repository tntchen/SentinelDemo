package com.nflow.sentinel;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.nflow.sentinel.mapper")
public class SentinelDemoServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SentinelDemoServiceApplication.class, args);
    }

}
