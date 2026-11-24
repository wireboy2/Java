package com.farm;

import com.school.Animal;

/**
 * 情况二：不同包中的【子类】访问 protected 成员 → 【允许】
 * Dog 在 com.farm 包，通过 extends Animal 继承到了 protected 成员。
 *
 * 经典陷阱（面试/考试考点）：
 *   跨包子类只能通过【自己（Dog）】的身份访问继承来的 protected 成员，
 *   不能通过父类 Animal 类型的引用去访问。取消下面注释会编译报错：
 *
 *   public void wrong(Animal a) {
 *       System.out.println(a.name);   // 错误！a 是父类引用，访问权只对"本包"开放
 *   }
 */
public class Dog extends Animal {
    public void show() {
        System.out.println("[跨包子类 Dog] 访问继承来的属性 name = " + name);  // OK，等价于 this.name
        eat();                                                                 // OK，等价于 this.eat()
    }
}
