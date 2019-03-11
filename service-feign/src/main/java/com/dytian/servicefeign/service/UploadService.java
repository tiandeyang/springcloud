package com.dytian.servicefeign.service;

import com.dytian.servicefeign.config.FeignSupportConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

@FeignClient(name = "service-shorttext",configuration = FeignSupportConfig.class,fallback = UploadServiceHystrix.class)
    public interface UploadService {

        @RequestMapping(value = "/msg/uploadFile", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
        String handleFileUpload(@RequestPart(value = "file") MultipartFile file);


    @RequestMapping(value = "/uploadFile2", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    String handleFileUpload(@RequestPart(value = "file") MultipartFile[] file);


}