/**
 * 【PPT 第 11~12 页】脚下留心：局部变量与成员变量的不同
 * 知识点：
 *   1. 定义在类中的变量 → 成员变量；定义在方法中的变量 → 局部变量
 *   2. 二者同名是允许的；在方法内通过变量名访问到的是【局部变量】（就近原则）
 *
 * 运行结果：
 *   大家好，我50岁了,我在看书!      ← 输出 50，不是 30！
 */
class Student {
    int age = 30;       // 类中定义的变量被称作成员变量

    void read() {
        int age = 50;   // 方法内部定义的变量被称作局部变量（与成员变量同名）
        System.out.println("大家好，我" + age + "岁了,我在看书!");   // 访问的是局部变量
    }
}

public class LocalVarDemo {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.read();     // 输出 50：方法内同名时，局部变量"遮住"了成员变量
    }
}
