package com.dytian.servicefeign.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@FeignClient(value = "service-hi",fallback = SchedualServiceHiHystrix.class )
public interface SchedualServiceHi {

    @RequestMapping(value = "/hi2",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

    @RequestMapping(value = "/addUser",method = RequestMethod.GET)
    String addUser(@RequestParam(value = "user") String user);


    @RequestMapping(value = "/addUser2",method = RequestMethod.POST)
    String addUser2(@RequestParam(value = "user2") String user2);


}
