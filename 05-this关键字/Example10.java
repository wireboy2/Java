/**
 * 【PPT 第 56 页】Example10：this 调用本类中的属性（解决 Example09 的问题）
 * 知识点：this.name / this.age 明确指定访问【当前对象的成员变量】，
 *         解决参数（局部变量）与成员变量重名的冲突。
 *
 * 运行结果：
 *   我是:张三,年龄:18      ← 正确赋值了！
 */
class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;       // this.name 是成员变量，单独的 name 是参数
        this.age = age;
    }

    public String read() {
        return "我是:" + name + ",年龄:" + age;
    }
}

public class Example10 {
    public static void main(String[] args) {
        Student stu = new Student("张三", 18);
        System.out.println(stu.read());
    }
}
