/**
 * 【PPT 第 67~68 页】Example13：不用 static 的 school（问题演示）
 * 知识点：school 是【实例属性】，每个对象各自持有一份。
 *
 * 运行结果：
 *   姓名:张三，年龄:18，学校:A大学
 *   姓名:李四，年龄:19，学校:A大学
 *   姓名:王五，年龄:20，学校:A大学
 *
 * 引出问题：如果 A 大学改名成 B 大学，而对象已有 10 万个，就要改 10 万遍！
 * 解决方案见 Example14（用 static 修饰 school）。
 */
class Student {
    String name;
    int age;
    String school = "A大学";        // 实例属性：每个对象都有一份独立的副本

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void info() {
        System.out.println("姓名:" + this.name + "，年龄:" + this.age + "，学校:" + school);
    }
}

public class Example13 {
    public static void main(String[] args) {
        Student stu1 = new Student("张三", 18);
        Student stu2 = new Student("李四", 19);
        Student stu3 = new Student("王五", 20);
        stu1.info();
        stu2.info();
        stu3.info();
    }
}
