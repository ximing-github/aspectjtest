package com.mytest.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * ClassName:School
 * Package: com.mytest.beans
 * Description:
 *
 * @Date: 2021/5/11 14:02
 * @Author: 惜名
 */
@Component
public class School {
    @Value("北京")
    private String address;
    @Value("123456789")
    private String phone;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "School{" +
                "address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
