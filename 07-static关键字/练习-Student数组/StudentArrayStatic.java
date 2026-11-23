/**
 * 【PPT 第 74~76 页 · 练习 · 版本 2】用 static 的写法
 * 题目同 StudentArrayNoStatic.java，school 改为 static 静态属性。
 *
 * 关键对比：school 被 static 修饰后全类共享一份，
 *          修改只需一行：Student.school = "B学校"; 【不用】遍历数组！
 *
 * 运行结果：与版本 1 相同，但修改学校只需 1 行代码。
 */
class Student {
    int id;
    static String school = "A学校";     // static：所有对象共享一份

    public Student(int id) {
        this.id = id;
    }

    public void info() {
        System.out.println("学号:" + id + "，学校:" + school);
    }
}

public class StudentArrayStatic {
    public static void main(String[] args) {
        Student[] students = new Student[50];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(202301 + i);
        }

        System.out.println("修改前：");
        for (int i = 0; i < 5; i++) {
            students[i].info();
        }

        Student.school = "B学校";           // 3. 用 static：一行搞定所有对象的"学校"！

        System.out.println("修改后：");
        for (int i = 0; i < 5; i++) {
            students[i].info();
        }
    }
}
