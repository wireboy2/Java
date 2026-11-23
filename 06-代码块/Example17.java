/**
 * 【PPT 第 87 页】Example17：综合执行顺序题（PPT 原题中类名是 Example）
 * 知识点：静态代码块 → main 方法（其中普通代码块按出现顺序执行）→ 每次 new 触发构造块 → 构造方法
 *
 * 运行结果：
 *   这是静态代码块
 *   这是普通代码块
 *   这是main方法
 *   这是构造代码块
 *   这是构造方法
 *   这是构造代码块
 *   这是构造方法
 */
public class Example17 {
    {
        System.out.println("这是构造代码块");
    }

    static {
        System.out.println("这是静态代码块");
    }

    public Example17() {
        System.out.println("这是构造方法");
    }

    public static void main(String[] args) {
        {
            System.out.println("这是普通代码块");       // main 内的普通代码块，顺序执行
        }
        System.out.println("这是main方法");
        Example17 ex1 = new Example17();    // 构造块 → 构造方法
        Example17 ex2 = new Example17();    // 构造块 → 构造方法（静态块不再执行）
    }
}
