
## RequestMapping
#### 既可以修饰方法也可以修饰类
```
@RequestMapping("/spring")
@Controller
public class HiController {

    @RequestMapping("/helloworld")
    public String hi(){
        System.out.println("hello world");
        return "success";
    }
}
```
#### 常用属性
```
@RequestMapping("/spring")
@Controller
public class HiController {

    @RequestMapping(value = "/helloworld", method = RequestMethod.GET, params = {"username","age!=10"}, headers = {"Accept-Lanaguage"})
    public String hi(){
        System.out.println("hello world");
        return "success";
    }
}
```
#### Ant风格的URL
1. ?：匹配文件名中的一个字符
2. *：匹配文件名中的任意字符
3. **：** 匹配多层路径

- /user/*/createUser: 匹配 – /user/aaa/createUser、/user/bbb/createUser 等 URL
- /user/**/createUser: 匹配 – /user/createUser、/user/aaa/bbb/createUser 等 URL
- /user/createUser??: 匹配 – /user/createUseraa、/user/createUserbb 等 URL

## PathVariable
```
@RequestMapping("/spring")
@Controller
public class HiController {

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id){
        System.out.println("this id is " + id);
        return "success";
    }
}
```

## HiddenHttpMethodFilter
> 浏览器form表单只支持GET与PPOST请求，HiddenHttpMethodFilter使得支持PUT,DELETE
```
  <filter>
    <filter-name>HiddenHttpMethodFilter</filter-name>
    <filter-class>org.springframework.web.filter.HiddenHttpMethodFilter</filter-class>
  </filter>

  <filter-mapping>
    <filter-name>HiddenHttpMethodFilter</filter-name>
    <url-pattern>/*</url-pattern>
  </filter-mapping>
```

## RequestParam（RequestHeader，CookieValue）
- value：参数名
- required：是否必须。默认为true,表示请求参数中必须包含对应的参数，若不存在，将抛出异常

## POJO
- 按请求参数名和POJO属性名进行自动匹配，自动为该对象填充属性值。支持级联属性

## ServletAPI
- HttpServletRequest
- HttpServletResponse
- HttpSession
- java.security.Principal
- Locale
- InputStream
- OutputStream
- Reader
- Writer

## 处理模型数据
- ModelAndView
- Map 及 Model
- @SessionAttributes
- @ModelAttribute

## 视图解析
>jstlview (fmt 国际化)

1. 导入jar包（standard/jstl）
2. 创建资源文件
3. 配置资源文件
4. 在视图中使用fmt标签

>mvc:view-controller (直接响应页面，不再经过handler)
```
<mvc:view-controller path="/success" view-name="success"></mvc:view-controller>
<mvc:annotation-driven></mvc:annotation-driven>
```
>自定义视图