package com.demo.aop.AspectJ;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @Author xdc90
 * @Date 2018/5/31
 */
@Aspect
public class TxAspect {

    @Pointcut("execution(* sayHello())")
    public void excute(){

    }

    @Before("excute()")
    public void beforeDo(){
        System.out.println("before-do");
    }
}
