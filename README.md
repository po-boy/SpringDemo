# RequestMapping
    * 1、既可修饰方法也可修饰类
    '''
    @RequestMapping("/spring")
     @Controller
     public class HiController {

         @RequestMapping("/helloworld")
         public String hi(){
             System.out.println("hello world");
             return "success";
         }
     }
     '''
