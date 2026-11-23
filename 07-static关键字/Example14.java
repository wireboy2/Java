/**
 * 【PPT 第 70~71 页】Example14：用 static 修饰 school（共享属性）
 * 知识点：
 *   1. static 属性是【所有对象共享】的，内存中只有一份
 *   2. 可用【类名.属性名】直接访问：Student.school（推荐写法）
 *   3. 任何一个引用修改它，所有对象"看到"的值都变了
 *
 * 运行结果：
 *   姓名:张三，年龄:18，学校:B大学
 *   姓名:李四，年龄:19，学校:B大学      ← stu2、stu3 并没有赋值，但也变成了 B大学
 *   姓名:王五，年龄:20，学校:B大学
 */
class Student {
    String name;
    int age;
    static String school = "A大学";     // static 属性：全类共享一份

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void info() {
        System.out.println("姓名:" + this.name + "，年龄:" + this.age + "，学校:" + school);
    }
}

public class Example14 {
    public static void main(String[] args) {
        Student stu1 = new Student("张三", 18);
        Student stu2 = new Student("李四", 19);
        Student stu3 = new Student("王五", 20);

        stu1.school = "B大学";              // 或推荐写法：Student.school = "B大学";
        stu1.info();
        stu2.info();
        stu3.info();
    }
}
