package com.dytian.eurekaclient;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.dytian.eurekaclient.entity.Wx_user;
import com.dytian.eurekaclient.service.IWx_userService;
import org.mybatis.spring.annotation.MapperScan;
import org.nutz.json.Json;
import org.nutz.json.JsonFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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


    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name",defaultValue = "dytian") String name){

        EntityWrapper<Wx_user> where = new EntityWrapper<>();
        where.eq("user_open_id",name);
        Wx_user wx_user = iWx_userService.selectOne(where);

        return "hi "  + Json.toJson(wx_user,JsonFormat.compact()) +", i am from port:" + port;
    }

}
