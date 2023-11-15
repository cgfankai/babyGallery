package com.fankai.baby.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class GalleryController {


    @RequestMapping("/")
    public Object hello() {
        LocalDateTime now = LocalDateTime.now();
        return now.format(DateTimeFormatter.BASIC_ISO_DATE);
    }

}
