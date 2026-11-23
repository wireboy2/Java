/**
 * 【PPT 第 84 页】Example16b：静态代码块的加载时机
 * 知识点：只声明对象（stu = null）不触发类加载相关输出；只有 new 实例化（第一次主动使用类）时，静态代码块才执行。
 *
 * 运行结果：
 *   我是静态代码块          ← 注意：只打印一次，且是在 new 那一行才打印
 */
class Student {
    String name;    // 成员属性

    static {
        System.out.println("我是静态代码块");
    }
}

public class Example16b {
    public static void main(String[] args) {
        Student stu1 = null;        // 只声明引用，不创建对象 —— 此行【不会】触发静态代码块
        // 若程序到此结束（注释掉下一行），控制台不会有任何输出
        stu1 = new Student();       // 第一次主动使用 Student 类 → 类加载 → 执行静态代码块
    }
}
