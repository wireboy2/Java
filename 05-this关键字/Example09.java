/**
 * 【PPT 第 55 页】Example09：成员变量与局部变量重名的"陷阱"
 * 知识点：
 *   构造方法参数 name、age 与成员变量重名时，name = name 中
 *   两个 name 都指【局部变量】（就近原则），成员变量根本没被赋值！
 *
 * 运行结果：
 *   我是:null,年龄:0      ← 属性还是默认值，赋值"赋了个寂寞"
 */
class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        name = name;        // 等号左边也解析为局部变量，自己赋给自己，成员变量没变！
        age = age;
    }

    public String read() {
        return "我是:" + name + ",年龄:" + age;
    }
}

public class Example09 {
    public static void main(String[] args) {
        Student stu = new Student("张三", 18);
        System.out.println(stu.read());
    }
}
