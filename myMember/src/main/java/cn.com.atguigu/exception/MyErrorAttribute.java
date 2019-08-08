package cn.com.atguigu.exception;

import org.springframework.boot.autoconfigure.web.DefaultErrorAttributes;
import org.springframework.boot.autoconfigure.web.ErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;

import java.util.Map;

/**
 * 自定义异常数据生成方法，
 */
@Component  //加到容器中
public class MyErrorAttribute extends DefaultErrorAttributes {

    @Override
    public Map<String, Object> getErrorAttributes(RequestAttributes requestAttributes, boolean includeStackTrace) {
        Map<String,Object>map=super.getErrorAttributes(requestAttributes,includeStackTrace);
        map.put("companyName","MyCompanyCode");
        return map;
    }
}
