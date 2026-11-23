/**
 * 【PPT 第 33 页】Example03：为什么需要封装（问题演示）
 * 知识点：属性不加 private 时，外界可以随意赋值 —— age = -18 明显不合理！
 *
 * 运行结果：
 *   大家好，我是张三，年龄-18      ← 程序不报错，但业务上不合理
 */
class Student {
    String name;    // 声明姓名属性（未封装，外界可直接访问）
    int age;        // 声明年龄属性

    void read() {
        System.out.println("大家好，我是" + name + "，年龄" + age);
    }
}

public class Example03 {
    public static void main(String[] args) {
        Student stu = new Student();    // 创建学生对象
        stu.name = "张三";              // 为对象的 name 属性赋值
        stu.age = -18;                  // 为对象的 age 属性赋值 —— 不合理的值！
        stu.read();                     // 调用对象的方法
    }
}
