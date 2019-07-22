package cn.com.atguigu.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;

/**
 * 自定义异常
 *
 */
@ControllerAdvice
public class MyException extends  RuntimeException{

    public MyException() {
        super("用户不存在");
    }
}
