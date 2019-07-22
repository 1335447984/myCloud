package cn.com.atguigu;


import cn.com.atguigu.entity.SysUser;
import cn.com.atguigu.entity.vo.UserInfoVo;
import net.minidev.json.JSONUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * SpringBoot 单元测试类
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class myMemberApplicationTest {
    @Autowired
    UserInfoVo user;

    @Test
    public void querySysUser(){
        System.out.print(user);
    }



}
