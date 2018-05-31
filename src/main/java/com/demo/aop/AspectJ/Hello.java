package com.demo.aop.AspectJ;

/**
 * @Author xdc90
 * @Date 2018/5/31
 */
public class Hello {
    public void sayHello () {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        Hello h = new Hello();
        h.sayHello();
    }
}
