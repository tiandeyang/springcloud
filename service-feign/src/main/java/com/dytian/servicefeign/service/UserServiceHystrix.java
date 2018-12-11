package com.dytian.servicefeign.service;


import com.dytian.yuemee.common.entity.Jd_user;
import org.springframework.stereotype.Component;

@Component
public class UserServiceHystrix implements UserService {



    @Override
    public String addUser(Jd_user user) {
        return "pleas try later";
    }
}
