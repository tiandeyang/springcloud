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
        String s = schedualServiceHi.addUser(user);
        System.out.println("addUser===respons==="+Json.toJson(s));
        return s;
    }


    @RequestMapping(value = "/addUser2",method = RequestMethod.POST)
    public String addUser2(@RequestParam String user2){
        System.out.println("user==222="+user2);
        String s = schedualServiceHi.addUser2(user2);
        System.out.println("addUser2===respons==="+Json.toJson(s));
        return s;
    }



    @RequestMapping(value = "/user/addUser",method = RequestMethod.POST)
    public String addUser3(@RequestBody Jd_user user){
        System.out.println("user33==="+user);
        String s = userService.addUser(user);
        System.out.println("/user/addUser===respons==="+Json.toJson(s));
        return s;
    }




}
