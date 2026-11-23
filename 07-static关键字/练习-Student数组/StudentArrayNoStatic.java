/**
 * 【PPT 第 74~76 页 · 练习 · 版本 1】不用 static 的写法
 * 题目：
 *   1. Student 类，成员变量 id 和 school，成员方法 info() 输出学生信息
 *   2. 创建 size 为 50 的 Student 数组，学号 202301~202350，school = A学校，输出前 5 个
 *   3. 修改所有学生 school 为 B学校，再输出前 5 个
 *
 * 关键对比：不用 static 时，改学校要【循环 50 个对象逐一修改】！
 *
 * 运行结果：
 *   修改前：
 *   学号:202301，学校:A学校
 *   ...（前 5 个）
 *   修改后：
 *   学号:202301，学校:B学校
 *   ...（前 5 个）
 */
class Student {
    int id;                     // 学号
    String school = "A学校";    // 实例属性：每个对象各自一份

    public Student(int id) {
        this.id = id;
    }

    public void info() {
        System.out.println("学号:" + id + "，学校:" + school);
    }
}

public class StudentArrayNoStatic {
    public static void main(String[] args) {
        Student[] students = new Student[50];               // 1. 创建 size=50 的数组
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(202301 + i);          // 学号 202301~202350
        }

        System.out.println("修改前：");
        for (int i = 0; i < 5; i++) {
            students[i].info();                             // 2. 输出前 5 个学生
        }

        for (Student stu : students) {                      // 3. 不用 static：必须循环逐个改！
            stu.school = "B学校";
        }

        System.out.println("修改后：");
        for (int i = 0; i < 5; i++) {
            students[i].info();
        }
    }
}
