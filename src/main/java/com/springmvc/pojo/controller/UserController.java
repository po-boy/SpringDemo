package com.springmvc.pojo.controller;

import com.springmvc.pojo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 炜 on 2017/12/28.
 */
@RequestMapping("/pojo")
@Controller
public class UserController {

    @RequestMapping("/user")
    public String testPOJO(User user){
        System.out.println("****** user " + user.toString());
        return "success";
    }

}
