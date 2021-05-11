package com.mytest;

import com.mytest.beans.Student;
import com.mytest.beans.User;
import com.mytest.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName:Test
 * Package: com.mytest
 * Description:
 *
 * @Date: 2021/5/11 15:56
 * @Author: 惜名
 */
public class MyTest {
   @Test
    public void test(){
       ApplicationContext applicationContext =
               new ClassPathXmlApplicationContext("applicationContext.xml");
      UserService userService = (UserService) applicationContext.getBean("userService");
      userService.queryByName("a");
   }
    @Test
    public void test01(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        System.out.println(userService.queryByName("a"));

    }
    @Test
    public void test02(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
       Student student =(Student) applicationContext.getBean("student");
        System.out.println(student);

    }

}
