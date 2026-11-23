/**
 * 【PPT 第 43~44 页】Example07：构造方法的重载
 * 知识点：
 *   1. 一个类可以定义多个构造方法，只要参数类型或参数个数不同即可（方法重载规则一样）
 *   2. new 时根据传入的参数自动匹配对应的构造方法
 *
 * 运行结果：
 *   我是:张三,年龄:0      ← 只传了姓名，age 是默认值 0
 *   我是:张三,年龄:18
 */
class Student {
    private String name;
    private int age;

    public Student() {                  // 无参构造
    }

    public Student(String n) {          // 1 个参数的构造
        name = n;
    }

    public Student(String n, int a) {   // 2 个参数的构造
        name = n;
        age = a;
    }

    public void read() {
        System.out.println("我是:" + name + ",年龄:" + age);
    }
}

public class Example07 {
    public static void main(String[] args) {
        Student stu1 = new Student("张三");         // 匹配 1 参构造方法
        Student stu2 = new Student("张三", 18);     // 匹配 2 参构造方法
        stu1.read();
        stu2.read();
    }
}
