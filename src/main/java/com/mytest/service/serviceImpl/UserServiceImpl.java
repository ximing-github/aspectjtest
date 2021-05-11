package com.mytest.service.serviceImpl;

import com.mytest.beans.User;
import com.mytest.service.UserService;
import org.springframework.stereotype.Component;

/**
 * ClassName:UserServiceImpl
 * Package: com.mytest.service.serviceImpl
 * Description:
 *
 * @Date: 2021/5/11 15:29
 * @Author: 惜名
 */
@Component(value ="userService")
public class UserServiceImpl implements UserService {

    @Override
    public User queryByName(String name) {
        System.out.println("执行业务方法");
        return new User();
    }
}
