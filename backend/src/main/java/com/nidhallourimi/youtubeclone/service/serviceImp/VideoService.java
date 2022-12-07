package com.nidhallourimi.youtubeclone.service.serviceImp;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

@Service
public class VideoService {
    
    public void uploadVideo(MultipartFile multipartFile){
        //upload file to aws S3
        //prepare a key
        StringUtils.getFilename(multipartFile.getOriginalFilename());



    }
}

