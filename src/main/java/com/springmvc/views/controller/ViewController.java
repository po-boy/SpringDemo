package com.springmvc.views.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 炜 on 2018/1/8.
 */
@Controller
@RequestMapping("/springmvc")
public class ViewController {

    @RequestMapping("/hiview")
    public String helloView(){
        return "helloView";
    }
}
