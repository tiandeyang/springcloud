package com.dytian.eurekaclient;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.dytian.eurekaclient.entity.Wx_user;
import com.dytian.eurekaclient.service.IWx_userService;
import org.mybatis.spring.annotation.MapperScan;
import org.nutz.json.Json;
import org.nutz.json.JsonFormat;
import org.nutz.lang.Times;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;

@RestController
@EnableEurekaClient
@SpringBootApplication
@MapperScan("com.dytian.eurekaclient.mapper")
@ComponentScan("com.dytian.*")
public class EurekaClientApplication {


    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
    }


    @Value("${server.port}")
    String port;

    @Autowired
    IWx_userService iWx_userService;


    @GetMapping("/hi2")
    public String home(@RequestParam(value = "name",defaultValue = "dytian") String name){
        System.out.println("name===="+name);
        EntityWrapper<Wx_user> where = new EntityWrapper<>();
        where.eq("user_open_id",name);
        Wx_user wx_user = iWx_userService.selectOne(where);
        System.out.println("wx_user == "+wx_user);
        return "hi "  + Json.toJson(wx_user,JsonFormat.compact()) +", i am from port:" + port;
    }

    @RequestMapping(value = "/addUser",method = RequestMethod.GET)
    public String addUser(@RequestParam(value = "user") String userStr) {
        System.out.println("userStr====="+userStr);
        if (1==1){
            return "hello girl !!!!"+userStr;
        }
        return "hello";
    }


    @RequestMapping(value = "/addUser2",method = RequestMethod.POST)
    public String addUser2(@RequestParam(value = "user2") String userStr) {
        System.out.println("userStr=222===="+userStr);
        if (1==1){
            return "hello girl 22!!!!"+userStr;
        }
        return "hello";
    }



}
