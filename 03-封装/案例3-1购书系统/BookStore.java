/**
 * 【案例 3-1 · PPT 第 37~39 页】基于控制台的购书系统 —— 主程序（控制台交互）
 * 功能：
 *   1. 输出所有图书信息（编号、书名、单价、库存）
 *   2. 提示输入图书编号和购买数量进行选购（可连续购买多本，输入 0 结束）
 *   3. 输出订单信息（订单号、订单明细、订单总额）
 *
 * 运行示例（用户输入 1 → 2 → 0）：
 *   欢迎光临购书系统！
 *   图书编号  图书名称    单价    库存
 *   1         Java基础    45.5    20
 *   2         数据结构    38.0    15
 *   3         操作系统    42.0    12
 *   请输入图书编号（输入 0 结束购书）：1
 *   请输入购买数量：2
 *   购书成功！
 *   ...
 *   -------------------- 订单信息 --------------------
 *   订单号：20261123001
 *   ...
 *   订单总额：129.0 元
 */
import java.util.Scanner;

public class BookStore {
    public static void main(String[] args) {
        // 初始化库存图书（用构造方法直接给属性赋值）
        Book[] books = {
                new Book(1, "Java基础", 45.5, 20),
                new Book(2, "数据结构", 38.0, 15),
                new Book(3, "操作系统", 42.0, 12)
        };
        OrderItem[] items = new OrderItem[books.length];    // 最多买 3 种书
        int itemCount = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("========== 欢迎光临购书系统！ ==========");
        // 1. 输出所有图书信息
        System.out.println("图书编号\t图书名称\t单价\t库存");
        for (Book b : books) {
            System.out.printf("%d\t\t%s\t\t%.1f\t%d%n",
                    b.getId(), b.getName(), b.getPrice(), b.getStorage());
        }

        // 2. 循环购书，输入 0 结束
        while (true) {
            System.out.print("请输入图书编号（输入 0 结束购书）：");
            int bookId = sc.nextInt();
            if (bookId == 0) {
                break;
            }
            Book selected = null;
            for (Book b : books) {          // 根据编号查找图书
                if (b.getId() == bookId) {
                    selected = b;
                    break;
                }
            }
            if (selected == null) {
                System.out.println("图书编号不存在，请重新输入！");
                continue;
            }
            System.out.print("请输入购买数量：");
            int num = sc.nextInt();
            if (num <= 0 || num > selected.getStorage()) {
                System.out.println("购买数量不合法或超出库存，请重新输入！");
                continue;
            }
            selected.setStorage(selected.getStorage() - num);   // 扣减库存
            items[itemCount++] = new OrderItem(selected, num);
            System.out.println("购书成功！感谢你的选购。");
        }

        // 3. 输出订单信息
        if (itemCount == 0) {
            System.out.println("您没有购买任何图书，期待下次光临！");
        } else {
            OrderItem[] finalItems = new OrderItem[itemCount];
            System.arraycopy(items, 0, finalItems, 0, itemCount);   // 压缩数组
            Order order = new Order("20261123001", finalItems);
            order.print();
        }
        sc.close();
    }
}
