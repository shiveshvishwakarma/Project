package com.lcwd.todo.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.Arrays;

@RestController
@RequestMapping("/file")
public class FileController {

    Logger logger= LoggerFactory.getLogger(FileController.class);


    @PostMapping("/single")
    public String uploadSingle(@RequestParam("image")MultipartFile file){

        logger.info("Name : {}",file.getName());
        logger.info("ContentType {}",file.getContentType());
        logger.info("Original File Name {}",file.getOriginalFilename());
        logger.info("File Size {}",file.getSize());

        return "File Test";

    }

    @PostMapping("/multiple")
    public String uploadMultiple(@RequestParam("file") MultipartFile[] files){
        Arrays.stream(files).forEach(file->{
            logger.info("File Name {}",file.getOriginalFilename());
            logger.info("File Type {}", file.getContentType());
                    System.out.println("++++++++++++++++++++");
                });
        return "Handling multiple files";
    }

}
