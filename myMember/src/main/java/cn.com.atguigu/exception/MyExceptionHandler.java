package cn.com.atguigu.exception;

import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class MyExceptionHandler {

    /**
     * 这样定义浏览器和客户端都返回的是JSON数据
     * @param e
     * @return
     */
   /*   @ResponseBody
    @ExceptionHandler(MyException.class)
  public Map<String,Object> handleException(Exception e){
        Map<String,Object> map=new HashMap<>();
        map.put("code","user.not.exception");
        map.put("message",e.getMessage());
        return  map;
    }*/

    /**
     * 转发到/error进行自适应响应效果处理
     * @param e
     * @return
     */
   @ExceptionHandler(MyException.class)
   public String  handleException(Exception    e, HttpServletRequest request){
        Map<String,Object> map=new HashMap<>();
       request.setAttribute("javax.servlet.error.status_code",400);//必须设置。否则不会进入我们设置的错误页面
        map.put("code","user.not.exception");
        map.put("message",e.getMessage());
        return  "forward:/errors/error.html";
    }

}
