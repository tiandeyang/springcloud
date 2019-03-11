package com.dytian.servicefeign.service;


import com.dytian.servicefeign.config.FeignSupportConfig;
import com.dytian.yuemee.common.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

@FeignClient(value = "service-shorttext",fallback = ServiceShortTextHystrix.class)
public interface ServiceShortText {

  /*  @RequestMapping(value = "/msg/send",method = RequestMethod.GET)
    Map<Object, Object> sendMsg(@RequestParam("phone") String phone, @RequestParam("code") String code);*/


    @RequestMapping(value = "/msg/send",method = RequestMethod.GET)
    Response sendMsg(@RequestParam("phone") String phone, @RequestParam("code") String code);





}
