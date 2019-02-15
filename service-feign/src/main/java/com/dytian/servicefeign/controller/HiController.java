package com.dytian.servicefeign.controller;


import com.dytian.servicefeign.service.SchedualServiceHi;
import com.dytian.servicefeign.service.ServiceShortText;
import com.dytian.servicefeign.service.UserService;
import com.dytian.yuemee.common.Response;
import com.dytian.yuemee.common.entity.Jd_user;
import com.netflix.hystrix.HystrixCommandProperties;
import org.nutz.json.Json;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
public class HiController {

    @Autowired
    SchedualServiceHi schedualServiceHi;

    @Autowired
    UserService userService;

    @Autowired
    ServiceShortText serviceShortText;


    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam("name") String name){
        System.out.println("name==="+Json.toJson(name));
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

    @RequestMapping(value = "/sendmsg",method = RequestMethod.GET)
    public String sendmsg(@RequestParam("phone") String phone, @RequestParam("code") String code){
        Response response = serviceShortText.sendMsg(phone, code);
        return response.getMsg();
//        Map<Object, Object> objectObjectMap = serviceShortText.sendMsg(phone, code);
//        return Json.toJson(objectObjectMap);
    }

    @RequestMapping(value = "/sendmsg2",method = RequestMethod.GET)
    public String sendmsg2(@RequestParam("phone") String phone, @RequestParam("code") String code){
        String a = schedualServiceHi.sendMsg(phone, code);
        return a;
    }



}
