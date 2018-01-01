package com.springmvc.sessionAttributes;

import com.springmvc.pojo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.Map;

@SessionAttributes(value = {"user"}, types = {String.class})
@RequestMapping("/springmvc")
@Controller
public class SessionAttributeControlleri {

    private static final String SUCCESS = "success";

    @RequestMapping("/sessionAttributeTest")
    public String sessionAttributeTest(Map<String, Object> map){
        User user = new User("jim",13);
        map.put("user", user);
        map.put("school","iss");
        return SUCCESS;
    }

}
