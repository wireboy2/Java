/**
 * 【PPT 第 57 页】Example11b：this 调用成员方法
 * 知识点：this.方法名() 调用本类的成员方法；
 *         注意：static 方法（类方法）中【不能】使用 this。
 *
 * 运行结果：
 *   张开嘴巴
 *   大家好，我在读书!
 */
class Student {
    public void openMouth() {
        System.out.println("张开嘴巴");
    }

    public void read() {
        this.openMouth();       // 通过 this 调用本类的成员方法（也可省略 this 直接写 openMouth()）
        System.out.println("大家好，我在读书!");
    }
}

public class Example11b {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.read();

        // staticTest();        // 类方法中不能用 this：若在下面 static 方法里写 this.read() 会编译报错
    }

    public static void staticTest() {
        // this.read();         // ← 编译错误！this 表示当前对象，而 static 方法调用时可能没有对象
    }
}
