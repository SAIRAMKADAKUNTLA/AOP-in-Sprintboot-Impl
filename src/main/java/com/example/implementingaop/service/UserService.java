package com.example.implementingaop.service;

import com.example.implementingaop.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserService {


    public User createUser() {
        User user=new User();
        user.setId(1234L);
        user.setFirst_name("Sairam");
        user.setLast_name("Kadakuntla");
        user.setCity("Hyderabad");
        log.info(String.valueOf(user));
        return user;
    }
}
