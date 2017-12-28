package com.springmvc.modelandview.controller;

import com.springmvc.pojo.model.School;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by 炜 on 2017/12/28.
 */
@RequestMapping("/modelview")
@Controller
public class ModelAndViewController {

    private final static String SUCCESS = "success";

    @RequestMapping("/viewtest")
    public ModelAndView modelAndViewTest(){
        ModelAndView mv = new ModelAndView(SUCCESS);
        mv.addObject("address", new School("iss","xx"));
        return mv;
    }

}
