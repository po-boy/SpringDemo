package com.springmvc.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 炜 on 2017/12/27.
 */
@Controller
public class HiController {

    @RequestMapping("/helloworld")
    public String hi(){
        System.out.println("hello world");
        return "success";
    }
}
