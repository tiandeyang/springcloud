package com.dytian.yuemee.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@EnableEurekaClient
@SpringBootApplication
@MapperScan("com.dytian.yuemee.product.mapper")
@ComponentScan("com.dytian.*")
public class YuemeeProApplication {

    public static void main(String[] args) {
        SpringApplication.run(YuemeeProApplication.class, args);
    }

}
