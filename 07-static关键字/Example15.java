/**
 * 【PPT 第 77~81 页】Example15：静态方法（static 修饰成员方法）
 * 知识点：
 *   1. 静态方法可以【不创建对象】，直接用类名调用：类名.方法名()
 *   2. 静态方法只能访问【静态成员】（因为非静态成员要等对象创建后才分配内存）
 *   3. 实例方法可以访问类方法、类变量、实例方法、实例变量（见 PPT 第 89 页）
 *
 * 运行结果：
 *   姓名:小明，年龄:20，学校:B大学
 *   姓名:小明，年龄:19，学校:B大学
 *   姓名:王五，年龄:20，学校:B大学
 */
class Student {
    private String name;
    private int age;
    private static String school = "A大学";     // 静态属性

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void info() {
        System.out.println("姓名:" + this.name + "，年龄:" + this.age + "，学校:" + school);
    }

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
        this.age = age;
    }

    public static String getSchool() {          // 静态方法
        return school;
    }

    public static void setSchool(String school) {
        Student.school = school;                // 静态方法中用【类名】访问静态属性（推荐）
    }
}

public class Example15 {
    public static void main(String[] args) {
        Student stu1 = new Student("张三", 18);
        Student stu2 = new Student("李四", 19);
        Student stu3 = new Student("王五", 20);

        stu1.setAge(20);                        // 实例方法：通过对象调用
        stu2.setName("小明");
        Student.setSchool("B大学");             // 静态方法：直接用类名调用！

        stu1.info();
        stu2.info();
        stu3.info();

        // 注意：静态方法里不能访问非静态成员，下面取消注释会编译报错
        // public static void test() { System.out.println(name); }   // ✗ name 是实例属性
    }
}
