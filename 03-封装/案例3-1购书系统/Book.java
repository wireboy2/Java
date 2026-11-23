/**
 * 【案例 3-1 · PPT 第 37~39 页】基于控制台的购书系统 —— 图书类 Book
 * 封装练习：所有属性 private，通过 getter/setter 访问。
 */
public class Book {
    private int id;             // 图书编号
    private String name;        // 图书名称
    private double price;       // 图书单价
    private int storage;        // 库存数量

    public Book(int id, String name, double price, int storage) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.storage = storage;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStorage() {
        return storage;
    }

    // 购书成功后扣减库存
    public void setStorage(int storage) {
        this.storage = storage;
    }
}
