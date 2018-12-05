package com.dytian.yuemee.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@EnableEurekaClient
@SpringBootApplication
@MapperScan("com.dytian.yuemee.user.mapper")
@ComponentScan("com.dytian.*")
public class YuemeeUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(YuemeeUserApplication.class, args);
    }

}
