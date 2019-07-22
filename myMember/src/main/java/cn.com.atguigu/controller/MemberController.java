package cn.com.atguigu.controller;


import cn.com.atguigu.exception.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MemberController {

    /**
     * 简单请求
     * @return
     */
    @ResponseBody
    @RequestMapping("/helloWorld")
    public String helloWorld(){
        return "hello world";
    }

    @ResponseBody
    @RequestMapping("/hello")
    public String helloWorld(@RequestParam("userName") String userName){
        if("aa".equals(userName)){
            throw new MyException();
        }
         return "hello world";
    }
}
