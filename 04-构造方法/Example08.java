/**
 * 【PPT 第 47~49 页】Example08：默认构造方法的"消失"
 * 知识点（高频考点）：
 *   1. 类中不写构造方法时，系统自动提供【默认无参构造方法】；
 *   2. 一旦手写了【有参】构造方法，系统就【不再提供】默认无参构造方法；
 *   3. 此时再调用 new Student() 就会编译报错！
 *   4. 最佳实践：写了有参构造后，最好手动再补一个无参构造。
 *
 * 运行结果（编译报错，用于教学演示）：
 *   错误: 无法将类 Student中的构造器 Student应用到给定类型;
 *     Student(int n) 与 new Student() 不匹配
 */
class Student {
    int age;

    public Student(int n) {     // 手写了有参构造 → 默认无参构造消失
        age = n;
    }
}

public class Example08 {
    public static void main(String[] args) {
        // Student stu = new Student();   // ← 取消注释后编译报错！因为没有无参构造
        Student stu = new Student(18);    // 解决方法一：用有参构造创建
        System.out.println("age = " + stu.age);
        // 解决方法二：在 Student 类中手动补一个 public Student() { }，new Student() 就能用了
    }
}
