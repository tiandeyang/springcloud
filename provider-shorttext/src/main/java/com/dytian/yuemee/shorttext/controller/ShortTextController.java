package com.dytian.yuemee.shorttext.controller;

import com.dytian.yuemee.shorttext.service.MsgService;
import com.google.common.base.Preconditions;
import org.nutz.lang.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/msg")
public class ShortTextController {

    @Autowired
    MsgService msgService;

    @RequestMapping(value = "/send",method = RequestMethod.GET)
    public String send(@RequestParam("phone") String phone,@RequestParam("code") String code) throws Exception {

        Preconditions.checkNotNull(phone,"手机号有误");
        Preconditions.checkNotNull(code,"验证码不能为空");

        String status = msgService.sendMsg(phone, code);
        if (Strings.isBlank(status)){
            throw new RuntimeException("发送失败");
        }
        return "1";

    }

}
