package com.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Desc:
 * @Auther: dengyanliang
 * @Date: 2023/12/15 18:12
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public Object hello(){
        return "hello world~";
    }

}
