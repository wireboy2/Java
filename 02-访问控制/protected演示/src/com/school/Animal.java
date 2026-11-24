package com.school;

/**
 * 定义 protected 成员的类（位于 com.school 包）
 * protected：本包可见 + 其他包的【子类】可见
 */
public class Animal {
    protected String name = "动物";     // protected 属性

    protected void eat() {              // protected 方法
        System.out.println(name + " 在吃东西");
    }
}
