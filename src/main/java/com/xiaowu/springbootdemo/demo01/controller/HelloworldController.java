package com.xiaowu.springbootdemo.demo01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author chutaojing
 * @version 1.0
 * @description springboot 第一个入门程序 helloworld
 * @date 2021-01-21
 * @see
 * @since 1.0
 */
@Controller
public class HelloworldController {
    /**
     * @param
     * @return java.lang.String
     * @Description
     * @Author chutaojing
     * @Exception
     * @Date 2021/01/21
     */
    @ResponseBody
    @RequestMapping("/hello")
    public String helloworld() {
        return "springboot helloworld";
    }
}
