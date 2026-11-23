/**
 * 【PPT 第 42 页】Example06：定义有参构造方法
 * 知识点：有参构造方法可以在实例化对象的同时为属性赋值，省去先 new 再逐个 setter 的步骤。
 *
 * 运行结果：
 *   我是:张三,年龄:18
 */
class Student {
    private String name;
    private int age;

    public Student(String n, int a) {   // 有参构造方法
        name = n;
        age = a;
    }

    public void read() {
        System.out.println("我是:" + name + ",年龄:" + age);
    }
}

public class Example06 {
    public static void main(String[] args) {
        Student stu = new Student("张三", 18);   // 实例化对象的同时赋值
        stu.read();
    }
}
