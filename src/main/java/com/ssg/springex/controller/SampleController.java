package com.ssg.springex.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Log4j2
public class SampleController {
    @GetMapping("/hello") //기존 MVC에서 doGet() 처리를 @GetMapping으로 자동화
    public void hello() {
        log.info("hello~~ spring Web MVC~~~");
    }
}
