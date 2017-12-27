package com.springmvc.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by 炜 on 2017/12/27.
 */
@RequestMapping("/spring")
@Controller
public class HiController {

    @RequestMapping(value = "/helloworld", method = RequestMethod.GET, params = {"username","age!=10"}, headers = {"Accept-Lanaguage"})
    public String hi(){
        System.out.println("hello world");
        return "success";
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id){
        System.out.println("this id is " + id);
        return "success";
    }
}
