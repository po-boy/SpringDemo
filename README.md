
### RequestMapping
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


