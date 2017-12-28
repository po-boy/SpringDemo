package com.springmvc.requestmapping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 炜 on 2017/12/28.
 */
@RequestMapping("/mapping")
@Controller("mappingController")
public class HiController {

    @RequestMapping(value = "/operation/{id}", method = RequestMethod.GET)
    public String doGet(@PathVariable("id") Integer id){
        System.out.println("****** do get " + id);
        return "success";
    }

    @RequestMapping(value = "/operation/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public String doDelete(@PathVariable("id") Integer id){
        System.out.println("****** do delete " + id);
        return "success";
    }

    @RequestMapping(value = "/operation/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public String doPut(@PathVariable("id") Integer id){
        System.out.println("****** do put " + id);
        return "success";
    }

    @RequestMapping(value = "/operation/{id}", method = RequestMethod.POST)
    public String doPost(@PathVariable("id") Integer id){
        System.out.println("****** do post " + id);
        return "success";
    }
}
