package com.dytian.eurekaclient;

import com.dytian.eurekaclient.service.IWx_userService;
import org.mybatis.spring.annotation.MapperScan;
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




    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name",defaultValue = "dytian") String name){

        return "hi "  + name +", i am from port:" + port;
    }

}
