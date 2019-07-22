package cn.com.atguigu.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class memberController {

    /**
     * 简单请求
     * @return
     */
    @RequestMapping("/helloWorld")
    public String helloWorld(){
        return "hello world";
    }
}
