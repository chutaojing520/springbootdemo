package com.xiaowu.springbootdemo.demo02.dto;

import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author chutaojing
 * @version 1.0
 * @description
 * @date 2021-01-21
 * @see
 * @since 1.0
 */
public class Job {
    private String jobname;
    private String [] works;
    
    public String getJobname() {
        return jobname;
    }
    
    public void setJobname(String jobname) {
        this.jobname = jobname;
    }
    
    public String[] getWorks() {
        return works;
    }
    
    public void setWorks(String[] works) {
        this.works = works;
    }
    
    @Override
    public String toString() {
        return "Job{" +
                "jobname='" + jobname + '\'' +
                ", works=" + Arrays.toString(works) +
                '}';
    }
}
