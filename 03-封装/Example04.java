/**
 * 【PPT 第 34~36 页】Example04：如何实现封装
 * 知识点：
 *   1. 用 private 修饰属性，外界无法直接访问 stu.age
 *   2. 必须通过 public 的 getter / setter 方法间接操作属性
 *   3. 在 setter 中加入校验逻辑，拦截非法数据 —— 这就是封装的价值！
 *
 * 运行结果：
 *   您输入的年龄有误！
 *   大家好，我是张三，年龄0      ← -18 被拦截，age 保持默认值 0
 */
class Student {
    private String name;    // 私有属性：只能在本类中访问
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {                              // 对非法数据做校验
            System.out.println("您输入的年龄有误！");
        } else {
            this.age = age;
        }
    }

    public void read() {
        System.out.println("大家好，我是" + name + "，年龄" + age);
    }
}

public class Example04 {
    public static void main(String[] args) {
        Student stu = new Student();    // 创建学生对象
        stu.setName("张三");            // 通过 setter 为 name 赋值
        stu.setAge(-18);                // 通过 setter 为 age 赋值 —— 被校验拦截
        stu.read();

        // stu.age = 20;      // 取消注释会编译报错：age 是 private，外界不可见！
    }
}
