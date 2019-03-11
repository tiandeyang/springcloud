package com.dytian.servicefeign.config;

import feign.codec.Encoder;
import feign.form.spring.SpringFormEncoder;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.cloud.openfeign.support.SpringEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignSupportConfig {

  /**
   * 仅支持 单文件 上传
   * @return
   */
//  @Bean
//  public Encoder feignFormEncoder() {
//   return new SpringFormEncoder();
//  }


  /**
   * 支持单文件 跟 多文件上传
   * @return
   */
//  @Bean
//  public Encoder feignFormEncoder() {
//    return new FeignSpringFormEncoder();
//  }

  @Autowired
  private ObjectFactory<HttpMessageConverters> messageConverters;


  @Bean
  public Encoder feignFormEncoder () {
    return new SpringFormEncoder(new SpringEncoder(messageConverters));
  }



}