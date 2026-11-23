/**
 * 【PPT 第 63 页】Example12：普通代码块（局部代码块）
 * 知识点：
 *   1. 方法内部用 {} 括起来的一段代码就是普通代码块
 *   2. 作用：限定变量的作用域（生命周期），尽早释放、节约内存
 *   3. 两个不同代码块中可以定义同名变量，互不影响
 *
 * 运行结果：
 *   这是普通代码块。age:18
 *   age:30
 */
public class Example12 {
    public static void main(String[] args) {
        {
            int age = 18;                               // 普通代码块中的局部变量
            System.out.println("这是普通代码块。age:" + age);
        }   // 代码块结束后，这个 age 的作用域结束，可以被回收
        int age = 30;                                   // 与上面的 age 同名，但作用域不同，互不影响
        System.out.println("age:" + age);
    }
}
