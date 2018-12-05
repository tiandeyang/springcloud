package com.dytian.servicefeign.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@FeignClient(value = "service-user",fallback = UserServiceHystrix.class)
public interface UserService {

    @RequestMapping(value = "/dytian/jd_user/addUser",method = RequestMethod.GET)
    String addUser(@RequestParam("user") String user);



}
