/**
 * 【PPT 第 41 页】Example05：定义无参构造方法
 * 知识点：
 *   1. 构造方法在【实例化对象时】被自动调用（new Student() 那一刻）
 *   2. 构造方法三要素：方法名与类名一致；无返回值类型声明（连 void 都不能写）；不能 return 值
 *
 * 运行结果：
 *   声明对象...
 *   实例化对象...
 *   调用了无参构造方法      ← 注意：声明 stu = null 时不会调用，只有 new 才调用！
 */
class Student {
    public Student() {
        System.out.println("调用了无参构造方法");
    }
}

public class Example05 {
    public static void main(String[] args) {
        System.out.println("声明对象...");
        Student stu = null;         // 声明对象：只是在栈里放了一个引用，没有创建对象
        System.out.println("实例化对象...");
        stu = new Student();        // 实例化对象：此刻才在堆里开辟空间并调用构造方法
    }
}
