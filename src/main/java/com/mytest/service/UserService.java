package com.mytest.service;

import com.mytest.beans.User;

/**
 * ClassName:UserService
 * Package: com.mytest.service
 * Description:
 *
 * @Date: 2021/5/11 15:24
 * @Author: 惜名
 */
public interface UserService {
    User queryByName(String name);
}
