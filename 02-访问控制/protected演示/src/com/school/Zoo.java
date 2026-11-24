package com.school;

/**
 * 情况一：同一包中的普通类访问 protected 成员 → 【允许】
 * Zoo 和 Animal 都在 com.school 包里，protected 对"本包"视同 default。
 */
public class Zoo {
    public void visit() {
        com.school.Animal a = new com.school.Animal();
        System.out.println("[同包类 Zoo]    访问属性 name = " + a.name);  // OK
        a.eat();                                                          // OK
    }
}
