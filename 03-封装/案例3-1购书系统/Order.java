/**
 * 【案例 3-1 · PPT 第 37~39 页】基于控制台的购书系统 —— 订单类 Order
 * 一个订单 = 订单号 + 多个订单项 + 订单总额。
 */
public class Order {
    private String orderID;             // 订单号
    private double total;               // 订单总额
    private OrderItem[] items;          // 订单项列表（数组）

    public Order(String orderID, OrderItem[] items) {
        this.orderID = orderID;
        this.items = items;
        calcTotal();                    // 创建订单时自动计算总额
    }

    // 遍历订单项，累加总额 —— 体现了"对象调用方法处理自己的数据"
    private void calcTotal() {
        total = 0;
        for (OrderItem item : items) {
            total += item.getSubtotal();
        }
    }

    // 打印订单明细
    public void print() {
        System.out.println("-------------------- 订单信息 --------------------");
        System.out.println("订单号：" + orderID);
        System.out.println("图书编号\t图书名称\t单价\t数量\t小计");
        for (OrderItem item : items) {
            System.out.printf("%d\t\t%s\t\t%.1f\t%d\t%.1f%n",
                    item.getBook().getId(),
                    item.getBook().getName(),
                    item.getBook().getPrice(),
                    item.getNum(),
                    item.getSubtotal());
        }
        System.out.println("订单总额：" + total + " 元");
        System.out.println("---------------------------------------------------");
    }
}
