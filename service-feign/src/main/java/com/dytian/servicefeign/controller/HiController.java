package com.dytian.servicefeign.controller;


import com.dytian.servicefeign.service.SchedualServiceHi;
import com.dytian.servicefeign.service.UserService;
import com.dytian.yuemee.common.entity.Jd_user;
import com.netflix.hystrix.HystrixCommandProperties;
import org.nutz.json.Json;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class HiController {

    @Autowired
    SchedualServiceHi schedualServiceHi;

    @Autowired
    UserService userService;


    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name){
        System.out.println(Json.toJson(name));
        return schedualServiceHi.sayHiFromClientOne(name);
    }


    @RequestMapping(value = "/addUser",method = RequestMethod.GET)
    public String addUser(@RequestParam String user){
        System.out.println("user==="+user);
        String jd_user = userService.addUser(user);
        System.out.println("respons==="+Json.toJson(jd_user));
        return jd_user;
    }



}
