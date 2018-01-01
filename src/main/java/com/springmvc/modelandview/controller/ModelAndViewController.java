package com.springmvc.modelandview.controller;

import com.springmvc.pojo.model.School;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.Map;

/**
 * Created by 炜 on 2017/12/28.
 */
@RequestMapping("/springmvc")
@Controller
public class ModelAndViewController {

    private final static String SUCCESS = "success";

    @RequestMapping("/modelview")
    public ModelAndView modelAndViewTest(){
        ModelAndView mv = new ModelAndView(SUCCESS);
        mv.addObject("address", new School("iss","xx"));
        return mv;
    }

    @RequestMapping("/testMap")
    public String testMap(Map<String, Object> map){
        map.put("names", Arrays.asList("jim","jerry"));
        return SUCCESS;
    }
}
