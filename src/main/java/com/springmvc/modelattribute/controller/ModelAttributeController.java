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

    /**
     *
     * @param id
     * @param map
     *
     * pojo入参过程
     * 1、若无@ModelAttribute及@SessionAttributes标识，则通过反射创建pojo
     * 2、若有@ModelAttribute注解的方法，则会通过该方法获取pojo, 并放入map, 默认的key为类名第一个字母小写， 也可用@ModelAttribute标识目标方法的入参从而定义key
     * 3、若无@ModelAttribute注解的方法、则会检查是否有@SessionAttributes注解，若有，将在session中通过key获取value
     * 4、若有以上标识，却获取不到value则抛出异常
     */

    @ModelAttribute
    public void getUser(@RequestParam(value = "id", required = false) Integer id, Map<String, Object> map){
        if( id != null ){
            User user = new User(1,"jim",12);
            User user1 = new User(1,"jim",21);
            map.put("user",user);
            map.put("user01",user1);
        }

    }

    @RequestMapping("/modelattribute")
    public String modelAttributeTest(User user){
        System.out.println("****** user" + user);
        return SUCCESS;
    }

    @RequestMapping("/modelattribute2")
    public String modelAttributeTest02(@ModelAttribute("user01") User user){
        System.out.println("****** user" + user);
        return SUCCESS;
    }


}
