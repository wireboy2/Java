# 第3章 面向对象（上）—— 家教配套 Java 代码

每个文件都对应 PPT 中的示例，文件头部注释标明了【PPT 页码】【知识点】【运行结果】，
可直接对照 PPT 讲解。全部代码已在 JDK 17 下编译验证通过。

## 运行方式（任选其一）

**方式一：命令行（推荐演示）**
```bash
javac -encoding UTF-8 文件名.java
java 主类名
```
注意：同目录下的多个文件都定义了 `Student` 类，请一次只编译一个文件，不要 `javac *.java`（会类重复）。

**方式二：IDEA / VS Code**
把整个 `第3章代码` 文件夹作为项目打开，右键单个文件 → Run。

## 文件对照表

| 目录 | 文件 | 对应 PPT 内容 |
|---|---|---|
| 01-类与对象 | Example01.java | 第17页：对象创建与 "." 访问成员 |
| 01-类与对象 | Example02.java | 第19~24页：对象引用传递（引用指向同一块内存） |
| 01-类与对象 | LocalVarDemo.java | 第11~12页：局部变量遮蔽成员变量（输出50不是30） |
| 02-访问控制 | Test.java | 第25~31页：private/default/protected/public 四种权限 |
| 03-封装 | Example03.java | 第33页：未封装导致 age=-18 的bug |
| 03-封装 | Example04.java | 第34~36页：private + setter/getter + 数据校验 |
| 03-封装/案例3-1购书系统 | Book / OrderItem / Order / BookStore | 第37~39页：控制台购书系统（含 Scanner 交互） |
| 04-构造方法 | Example05.java | 第41页：无参构造方法在 new 时才调用 |
| 04-构造方法 | Example06.java | 第42页：有参构造方法赋值 |
| 04-构造方法 | Example07.java | 第43~44页：构造方法重载 |
| 04-构造方法 | Example08.java | 第47~49页：写了有参构造后默认构造"消失"（高频考点） |
| 04-构造方法/案例3-2银行存取款 | BankTest.java | 第50~51页：存1000取800，含余额校验 |
| 04-构造方法/案例3-3手机配置 | PhoneTest.java | 第52~53页：两款手机配置与功能 |
| 05-this关键字 | Example09.java | 第55页：name=name 赋值失败（陷阱演示） |
| 05-this关键字 | Example10.java | 第56页：this.属性 解决重名 |
| 05-this关键字 | Example11.java | 第57~61页：this(...) 调用构造方法（须第一行、不可互调） |
| 05-this关键字 | Example11b.java | 第57页：this 调用成员方法；static 方法中不能用 this |
| 06-代码块 | Example12.java | 第63页：普通代码块限定作用域 |
| 06-代码块 | Example12b.java | 第64~65页：构造块先于构造方法、每次new都执行 |
| 06-代码块 | Example16.java | 第82~83页：静态块→构造块→构造方法，静态块只执行一次 |
| 06-代码块 | Example16b.java | 第84页：只声明不实例化，静态块不执行 |
| 06-代码块 | StaticDemo1.java | 第86页版本1：static块与main同类 → 输出 WorldHello |
| 06-代码块 | StaticDemo2.java | 第86页版本2：分属两个类 → 输出 HelloWorld |
| 06-代码块 | Example17.java | 第87页：综合执行顺序题（PPT 原题，类名 Example） |
| 07-static关键字 | Example13.java | 第67~69页：不用 static（10万个对象改10万遍的问题） |
| 07-static关键字 | Example14.java | 第70~71页：static 属性全类共享，改一处全变 |
| 07-static关键字 | Example15.java | 第77~81页：静态方法用类名调用；静态方法只能访问静态成员 |
| 07-static关键字/练习-Student数组 | StudentArrayNoStatic.java / StudentArrayStatic.java | 第74~76页：50个学生改学校，不用static要循环50次，用static一行搞定 |
| 08-综合案例 | VoteMain.java | 第88页：学生投票系统（防重复投票+统计结果） |

## 家教重点提示（面试/考试高频）

1. **执行顺序**：静态代码块 → 构造代码块 → 构造方法（Example16、Example17）
2. **静态块只执行一次**，随类加载而加载（Example16b）
3. **this(...)** 必须在构造方法第一行，两个构造方法不能互相调用（Example11）
4. **写了有参构造后要手动补无参构造**（Example08）
5. **静态方法只能访问静态成员**（Example15）
6. **引用传递**：两个引用指向同一块堆内存，改谁都一样（Example02）

git remote add origin https://github.com/wireboy2/Java.git