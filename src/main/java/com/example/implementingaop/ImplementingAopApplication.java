package com.example.implementingaop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class ImplementingAopApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImplementingAopApplication.class, args);
    }

}
