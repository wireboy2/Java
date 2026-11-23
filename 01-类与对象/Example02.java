/**
 * 【PPT 第 19~24 页】Example02：对象的引用传递
 * 知识点：
 *   1. 类属于【引用数据类型】：一块堆内存可以同时被多个栈内存变量引用
 *   2. stu2 = stu1; 并不是"复制对象"，而是让 stu2 也指向 stu1 的那块堆内存
 *   3. 通过任何一个引用修改属性，两个引用"看到"的数据都变了
 *   4. 注意：一个栈内存只能指向一个堆内存，想改指向必须先断开旧指向
 *
 * 运行结果：
 *   大家好，我是小明，年龄50
 *   大家好，我是小明，年龄50      ← stu1 的 age 也变成了 50！
 */
class Student {
    String name;    // 声明姓名属性
    int age;        // 声明年龄属性

    void read() {
        System.out.println("大家好，我是" + name + "，年龄" + age);
    }
}

public class Example02 {
    public static void main(String[] args) {
        Student stu1 = new Student();   // 声明 stu1 对象并实例化
        Student stu2 = null;            // 声明 stu2 对象，但不对其进行实例化

        stu2 = stu1;                    // 引用传递：stu2 与 stu1 指向同一块堆内存

        stu1.name = "小明";             // 为 name 属性赋值
        stu1.age = 20;
        stu2.age = 50;                  // 通过 stu2 修改 age —— 实际改的是同一块内存

        stu1.read();
        stu2.read();
    }
}
