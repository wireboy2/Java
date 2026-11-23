/**
 * 【PPT 第 25~31 页】四种访问控制权限演示
 * 知识点（按级别由小到大）：
 *   private < default(不写) < protected < public
 *
 *   修饰符      同一类中   同一包中的类   不同包的子类   全局范围
 *   private        √
 *   default        √           √
 *   protected      √           √             √
 *   public         √           √             √            √
 *
 * 补充要点（家教时强调）：
 *   1. 外部类只能用 public 或 default（不写）修饰；
 *   2. 局部变量【没有】访问权限控制（见下方 cc() 方法内的错误示例）；
 *   3. 一个源文件中若有 public 类，文件名必须与该类名相同。
 */
public class Test {
    public int aa;              // aa 可以被所有的类访问
    protected boolean bb;       // 可以被所有子类以及本包的类使用
    int cc = 10;                // default 访问权限，只能在本包范围内使用
    private int dd = 20;        // private：只能在本类中访问

    void cc() {                 // default 访问权限的方法，本包内可用
        System.out.println("包访问权限");
    }

    // private 权限的内部类，只能在本类中使用
    private class InnerClass {
    }

    public static void main(String[] args) {
        Test t = new Test();
        // 在【本类内部】，四种权限的成员全都可以访问
        System.out.println("public     aa = " + t.aa);
        System.out.println("protected  bb = " + t.bb);
        System.out.println("default    cc = " + t.cc);
        System.out.println("private    dd = " + t.dd);   // 只有本类能访问到
        t.cc();

        // 错误示例：局部变量不能用访问权限修饰符（取消注释会编译报错）
        // public int x = 1;    // 错误！局部变量没有访问权限控制
    }
}
