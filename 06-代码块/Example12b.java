/**
 * 【PPT 第 64~65 页】Example12b：构造代码块
 * 知识点（面试高频）：
 *   1. 直接定义在【类中方法外】的代码块，与成员变量、构造方法同级
 *   2. 每次 new 对象时，构造块都会先于构造方法执行（无论写在类里哪个位置）
 *   3. 常用于提取多个构造方法中的公共代码
 *
 * 运行结果：
 *   我是构造代码块
 *   我是Student类的构造方法
 *   我是构造代码块
 *   我是Student类的构造方法      ← new 两次，构造块就执行两次，且都在构造方法之前
 */
class Student {
    String name;    // 成员属性

    {                               // 构造代码块：与构造方法同级
        System.out.println("我是构造代码块");
    }

    public Student() {              // 构造方法
        System.out.println("我是Student类的构造方法");
    }
}

public class Example12b {
    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student();
    }
}
