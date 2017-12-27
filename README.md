
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
#### Ant风格的URL
> ?：匹配文件名中的一个字符
> *：匹配文件名中的任意字符
> **：** 匹配多层路径

* /user/*/createUser: 匹配 – /user/aaa/createUser、/user/bbb/createUser 等 URL
*/user/**/createUser: 匹配 – /user/createUser、/user/aaa/bbb/createUser 等 URL
*/user/createUser??: 匹配 – /user/createUseraa、/user/createUserbb 等 URL

