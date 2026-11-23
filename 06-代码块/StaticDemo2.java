/**
 * 【PPT 第 86 页 · 版本 2】静态代码块与 main 分属两个类
 * 知识点：static 修饰的内容随【类的加载】而加载；main 所在类 Test1 先加载，
 *         Test 类要等到 new Test() 时才加载。
 *
 * 运行结果：HelloWorld
 *   （与 StaticDemo1 的 WorldHello 对比记忆！）
 */
class Test {
    private static String name;

    static {
        name = "World";
        System.out.print(name);
    }
}

public class StaticDemo2 {
    public static void main(String[] args) {
        System.out.print("Hello");
        Test test = new Test();     // 这一步才触发 Test 类加载 → 执行其静态代码块
    }
}
