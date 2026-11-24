package com.farm;

import com.school.Zoo;

/**
 * 测试类：验证 protected 的两种合法访问 + 一种非法访问
 *
 * 情况三：不同包中的【普通类】访问 protected 成员 → 【禁止】
 * FarmTest 与 Animal 既不同包（com.farm ≠ com.school），也不是它的子类，
 * 所以取消注释的代码会编译报错：
 *
 *   Animal a = new Animal();
 *   System.out.println(a.name);   // 错误：name 在 Animal 中是 protected
 *
 * 运行结果：
 *   [同包类 Zoo]    访问属性 name = 动物
 *   动物 在吃东西
 *   [跨包子类 Dog] 访问继承来的属性 name = 动物
 *   动物 在吃东西
 *   不同包的普通类无法访问 protected 成员（编译报错演示见注释）
 */
public class FarmTest {
    public static void main(String[] args) {
        new Zoo().visit();      // 情况一：同包访问，OK
        new Dog().show();       // 情况二：跨包子类访问，OK

        // 情况三：跨包普通类访问 —— 编译报错，取消注释即可验证
        // Animal a = new Animal();
        // System.out.println(a.name);

        System.out.println("不同包的普通类无法访问 protected 成员（编译报错演示见注释）");
    }
}
