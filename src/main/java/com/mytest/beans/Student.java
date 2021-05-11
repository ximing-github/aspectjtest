package com.mytest.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.swing.plaf.BorderUIResource;

/**
 * ClassName:Student
 * Package: com.mytest.beans
 * Description:
 *
 * @Date: 2021/5/11 14:00
 * @Author: 惜名
 */
@Component("student")
public class Student {
    @Value("11")
    private String id;
    @Value("张三")
    private String name;
    @Autowired
    private School school;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", school=" + school +
                '}';
    }
}
