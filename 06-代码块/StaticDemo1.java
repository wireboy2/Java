/**
 * 【PPT 第 86 页】StaticDemo1/2：静态代码块与 main 的执行顺序（两版对比）
 *
 * 版本 1（本文件）：static 块和 main 在【同一个类】里
 *   → 类加载时 static 块先执行，然后才轮到 main 方法
 *   运行结果：WorldHello      （先 World 后 Hello！）
 *
 * 版本 2（见 StaticDemo2.java）：static 块在 Test 类，main 在 Test1 类
 *   → main 先打印 Hello，执行到 new Test() 时 Test 类才加载
 *   运行结果：HelloWorld      （顺序正好相反！）
 */
class Test {
    private static String name;

    static {
        name = "World";
        System.out.print(name);
    }

    public static void main(String[] args) {
        System.out.print("Hello");      // 注意：同文件版本中，static 块先于 main 执行
        Test test = new Test();
    }
}
