package com.xiaowu.springbootdemo;

import com.xiaowu.springbootdemo.demo02.dto.User;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootdemoApplicationTests {
    @Autowired
    private User user;
    /**
     * @description 测试@ConfigurationProperties值注入方式
     * @author chutaojing
     * @version 1.0
     * @see
     * @since 1.0
     * @date 2021/01/21
     */
    public void printUser(){
        System.out.println(user);
    }
}
