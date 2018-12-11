package com.dytian.servicefeign.service;


import com.dytian.yuemee.common.entity.Jd_user;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@FeignClient(value = "service-user",fallback = UserServiceHystrix.class)
public interface UserService {

    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    String addUser(@RequestBody Jd_user user);



}
