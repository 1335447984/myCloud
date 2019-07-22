package cn.com.atguigu;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SysUser implements Serializable{

    private Long id ;

    private String UserName;

    private String trueName;


}
