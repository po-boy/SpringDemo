package com.springmvc.modelattribute.controller;

import com.springmvc.pojo.model.School;
import com.springmvc.pojo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@RequestMapping("/springmvc")
@Controller
public class ModelAttributeController {

    private static final String SUCCESS = "success";

    @ModelAttribute
    public void getUser(@RequestParam(value = "id", required = false) Integer id, Map<String, Object> map){
        if( id != null ){
            User user = new User(1,"jim",12);
            map.put("user",user);
        }

    }

    @RequestMapping("/modelattribute")
    public String modelAttributeTest(User user){
        System.out.println("****** user" + user);
        return SUCCESS;
    }

}
