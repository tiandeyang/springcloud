package com.dytian.yuemee.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableEurekaClient
@SpringBootApplication
@MapperScan("com.dytian.yuemee.order.mapper")
@ComponentScan("com.dytian.*")
public class YuemeeOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(YuemeeOrderApplication.class, args);
    }

}
