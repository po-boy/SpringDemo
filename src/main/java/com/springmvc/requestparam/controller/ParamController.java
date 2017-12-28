package com.springmvc.requestparam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.jsf.FacesContextUtils;

/**
 * Created by 炜 on 2017/12/28.
 */
@RequestMapping("/requestparam")
@Controller
public class ParamController {

    private final static String SUCCESS = "success";

    @RequestMapping("/doget")
    public String hiController(@RequestParam(value = "age", required = false, defaultValue = "0") Integer age){
        System.out.println("****** param is " + age);
        return SUCCESS;
    }

}
