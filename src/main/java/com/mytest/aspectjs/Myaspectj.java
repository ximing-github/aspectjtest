package com.mytest.aspectjs;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.aop.scope.ScopedProxyUtils;
import org.springframework.stereotype.Component;

/**
 * ClassName:Myaspectj
 * Package: com.mytest.aspectjs
 * Description:
 *
 * @Date: 2021/5/11 15:36
 * @Author: 惜名
 */
@Aspect
@Component
public class Myaspectj {
   /* @Before(value="execution(* *(..))")
    public  void myBefore(){
        System.out.println("前置通知，在目标办法执行之前先执行");
    }*/
   /* @Before(value="execution(* *(..))")
    public  void myBefore(JoinPoint jp){
        System.out.println(jp.getArgs()[0]);
    }*/
    /*@AfterReturning(value = "execution(* *(..))",returning = "result")
    public void myReturning(Object result){
        System.out.println("后置通知，可以对方法的返回值做处理");
        System.out.println(result.getClass().getName());
    }*/
   /*@AfterReturning(value = "execution(* *(..))")
    public void myReturning(){
        System.out.println("后置通知，可以对方法的返回值做处理");

    }*/
    @Around(value ="execution(* *..service.*.*(..))" )
    public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
        Object object = null;

        System.out.println(pjp.getTarget().getClass().getName());
        object = pjp.proceed() ;

        return object;
    }

}
