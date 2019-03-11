package com.dytian.servicefeign.service;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class UploadServiceHystrix implements UploadService {
    @Override
    public String handleFileUpload(MultipartFile file) {
        return null;
    }

    @Override
    public String handleFileUpload(MultipartFile[] file) {
        return null;
    }
}
