package com.dytian.servicefeign.service;


import com.dytian.yuemee.common.Response;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ServiceShortTextHystrix implements ServiceShortText{

    @Override
    public Response sendMsg(String phone, String code) {
        return Response.fail().setMsg("fail fallback over!");
//        Map<Object, Object> objectObjectMap = new HashMap<>();
//        objectObjectMap.put("code",0);
//        objectObjectMap.put("msg","err");
//        return objectObjectMap;
    }

}
