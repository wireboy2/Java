/**
 * 【案例 3-2 · PPT 第 50~51 页】银行存取款
 * 要求：
 *   （1）创建账户，初始存款为 500；（2）存入 1000 元；（3）取出 800 元。
 * 知识点：封装 + 有参构造方法 + setter 校验。
 *
 * 运行结果：
 *   创建账户成功，当前余额：500.0 元
 *   存入 1000.0 元成功，当前余额：1500.0 元
 *   取出 800.0 元成功，当前余额：700.0 元
 */
class Account {
    private String id;          // 账号
    private double balance;     // 余额

    public Account(String id, double balance) {     // 有参构造：创建账户即赋初始值
        this.id = id;
        this.balance = balance;
    }

    public void deposit(double money) {             // 存款
        if (money <= 0) {
            System.out.println("存款金额不合法！");
            return;
        }
        balance += money;
        System.out.println("存入 " + money + " 元成功，当前余额：" + balance + " 元");
    }

    public void withdraw(double money) {            // 取款
        if (money <= 0) {
            System.out.println("取款金额不合法！");
        } else if (money > balance) {
            System.out.println("余额不足，取款失败！");
        } else {
            balance -= money;
            System.out.println("取出 " + money + " 元成功，当前余额：" + balance + " 元");
        }
    }

    public double getBalance() {                    // 查询余额
        return balance;
    }
}

public class BankTest {
    public static void main(String[] args) {
        Account acc = new Account("622202001", 500);    // （1）创建账户，初始存款 500
        System.out.println("创建账户成功，当前余额：" + acc.getBalance() + " 元");

        acc.deposit(1000);                              // （2）存入 1000 元
        acc.withdraw(800);                              // （3）取出 800 元
        acc.withdraw(5000);                             // 演示余额不足的校验
    }
}
