/**
 * 【PPT 第 57~61 页】Example11：this 调用本类的构造方法
 * 知识点：
 *   1. this(参数) 可以在【一个构造方法】里调用【另一个构造方法】
 *   2. this(...) 必须位于构造方法的【第一行】，且只能出现一次
 *   3. 两个构造方法不能用 this 互相调用（会死循环，编译报错）
 *   4. 只能在构造方法中使用 this(...) 调用构造，普通成员方法中不行
 *
 * 运行结果：
 *   实例化了一个新的Student对象。    ← new Student("张三",18) 先执行了 this() 无参构造
 *   我是:张三,年龄:18
 */
class Student {
    private String name;
    private int age;

    public Student() {
        System.out.println("实例化了一个新的Student对象。");
    }

    public Student(String name, int age) {
        this();                 // 调用无参构造方法，必须写在第一行！
        this.name = name;
        this.age = age;
    }

    public String read() {
        return "我是:" + name + ",年龄:" + age;
    }
}

public class Example11 {
    public static void main(String[] args) {
        Student stu = new Student("张三", 18);   // 实例化 Student 对象
        System.out.println(stu.read());
    }
}
