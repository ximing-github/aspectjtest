package com.mytest.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * ClassName:User
 * Package: com.mytest.beans
 * Description:
 *
 * @Date: 2021/5/11 14:00
 * @Author: 惜名
 */
@Component
public class User {
    @Value("李四")
    private String username;
    @Value("123")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
