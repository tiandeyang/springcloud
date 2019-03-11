package com.dytian.yuemee.shorttext.controller;

import com.dytian.yuemee.common.Response;
import com.dytian.yuemee.shorttext.service.MsgService;
import com.google.common.base.Preconditions;
import org.nutz.lang.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;


@RestController
@RequestMapping("/msg")
public class ShortTextController {

    @Autowired
    MsgService msgService;

    @RequestMapping(value = "/send",method = RequestMethod.GET)
    public Response send(@RequestParam("phone") String phone, @RequestParam("code") String code) throws Exception {
        System.out.println("phone===="+phone);
        Preconditions.checkNotNull(phone,"手机号有误");
        Preconditions.checkNotNull(code,"验证码不能为空");
        String status = msgService.sendMsg(phone, code);
        if (Strings.isBlank(status)){
            return Response.fail();
        }
        return Response.ok();
    }



    @RequestMapping(value = "/uploadFile",method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String handleFileUpload(@RequestPart(value = "file") MultipartFile file) throws IOException {
        file.transferTo(new File("D:\\upload\\" + file.getOriginalFilename()));
        return file.getOriginalFilename();
    }

    @RequestMapping(value = "/uploadFile2",method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String handleFileUpload(@RequestPart(value = "file") MultipartFile[] file) {
        String fileName = "";
        for(MultipartFile f : file){
            fileName += f.getOriginalFilename()+"---";
        }
        return fileName;
    }





}
