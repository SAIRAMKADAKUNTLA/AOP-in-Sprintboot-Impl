package com.example.implementingaop.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class UserAspect {

    @Before(value = "execution(* com.example.implementingaop.service.UserService.createUser())")
        public void beforeAll(){
            log.info("starting");
        }

        @After(value = "execution(* com.example.implementingaop.service.UserService.createUser())")
    public  void afterAll(){
        log.info("end!!!!");
        }


}
