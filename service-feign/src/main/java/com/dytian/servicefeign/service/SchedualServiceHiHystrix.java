package com.dytian.servicefeign.service;


import com.dytian.yuemee.common.Response;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystrix implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }

    @Override
    public String addUser(String user) {
        return "sorry addUser is not avalibale "+user;
    }

    @Override
    public String addUser2(String user2) {
        return "sorry addUser2 is not avialbe just now "+user2;
    }

    @Override
    public String sendMsg(String phone, String code) {
        return Response.fail().getMsg();
    }




}
