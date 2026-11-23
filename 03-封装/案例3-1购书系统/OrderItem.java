/**
 * 【案例 3-1 · PPT 第 37~39 页】基于控制台的购书系统 —— 订单项类 OrderItem
 * 一个订单项 = 一本图书 + 购买数量。
 */
public class OrderItem {
    private Book book;      // 图书（引用类型的属性，体现了类与类之间的组合关系）
    private int num;        // 购买数量

    public OrderItem(Book book, int num) {
        this.book = book;
        this.num = num;
    }

    public Book getBook() {
        return book;
    }

    public int getNum() {
        return num;
    }

    // 计算该订单项的小计金额
    public double getSubtotal() {
        return book.getPrice() * num;
    }
}
