package com.xiaowu.springbootdemo.demo02.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * @author chutaojing
 * @version 1.0
 * @description 测试yml语法。@ConfigurationProperties要起作用。还需要把其注解的类加入到spring容器中
 * @date 2021-01-21
 * @see
 * @since 1.0
 */
@Component
@ConfigurationProperties(prefix = "userinfo")
public class User {
    private String name;
    private int age;
    private Date brith;
    private List<String> hobby;
    private Job[] jobs;
    private Map<String, String> map;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public Date getBrith() {
        return brith;
    }
    
    public void setBrith(Date brith) {
        this.brith = brith;
    }
    
    public List<String> getHobby() {
        return hobby;
    }
    
    public void setHobby(List<String> hobby) {
        this.hobby = hobby;
    }
    
    public Job[] getJobs() {
        return jobs;
    }
    
    public void setJobs(Job[] jobs) {
        this.jobs = jobs;
    }
    
    public Map<String, String> getMap() {
        return map;
    }
    
    public void setMap(Map<String, String> map) {
        this.map = map;
    }
    
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", brith=" + brith +
                ", hobby=" + hobby +
                ", jobs=" + Arrays.toString(jobs) +
                ", map=" + map +
                '}';
    }
}
