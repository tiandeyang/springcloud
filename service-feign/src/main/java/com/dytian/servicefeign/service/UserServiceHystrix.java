package com.dytian.servicefeign.service;


import org.springframework.stereotype.Component;

@Component
public class UserServiceHystrix implements UserService {


    @Override
    public String addUser(String user) {
        return "pleas try later";
    }
}
