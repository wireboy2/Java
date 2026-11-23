/**
 * 【PPT 第 17 页】Example01：对象的创建与使用
 * 知识点：
 *   1. new 关键字创建对象，对象在【堆内存】分配空间
 *   2. 通过 "." 运算符访问属性和方法：对象名.属性名 / 对象名.方法名
 *   3. stu1、stu2 是两个完全独立的对象，各自拥有自己的 name 属性
 *
 * 运行结果：
 *   大家好，我是小明
 *   大家好，我是小华
 */
class Student {
    String name;              // 声明姓名属性

    void read() {             // 成员方法：描述对象的行为
        System.out.println("大家好，我是" + name);
    }
}

public class Example01 {
    public static void main(String[] args) {
        Student stu1 = new Student();   // 创建第一个 Student 对象
        Student stu2 = new Student();   // 创建第二个 Student 对象

        stu1.name = "小明";             // 为 stu1 对象的 name 属性赋值
        stu1.read();                    // 调用对象的方法

        stu2.name = "小华";
        stu2.read();
    }
}
