/**
 * 【PPT 第 82~83 页】Example16：静态代码块
 * 知识点（面试必考）：
 *   1. 执行顺序：静态代码块 → 构造代码块 → 构造方法
 *   2. 静态代码块只在【类第一次被加载】时执行【一次】
 *   3. 构造代码块每次 new 都执行
 *
 * 运行结果：
 *   我是静态代码块          ← 只出现 1 次（3 个对象，只加载 1 次）
 *   我是构造代码块
 *   我是Student类的构造方法
 *   我是构造代码块
 *   我是Student类的构造方法
 *   我是构造代码块
 *   我是Student类的构造方法
 */
class Student {
    String name;    // 成员属性

    {
        System.out.println("我是构造代码块");
    }

    static {
        System.out.println("我是静态代码块");
    }

    public Student() {      // 构造方法
        System.out.println("我是Student类的构造方法");
    }
}

public class Example16 {
    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student();
        Student stu3 = new Student();
    }
}
