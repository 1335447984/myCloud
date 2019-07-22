package cn.com.atguigu;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class myMemberApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(myMemberApplication.class).web(true).run(args);
    }
}
