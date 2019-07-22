package cn.com.atguigu.entity.vo;

import cn.com.atguigu.entity.SysCompany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * ConfigurationProperties 告诉springboot 将本类中的所有属性和配置文件中相关的配置进行绑定
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@ConfigurationProperties(prefix = "userInfoVo")
@PropertySource(value = "classpath:userInfoVo.properties")
public class UserInfoVo {
    private Long id;
    private String userName;
    private String trueName;
    private Map<String,Object> map;
    private List<Object> lists;
    private SysCompany sysCompany;
}
