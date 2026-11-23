/**
 * 【案例 3-3 · PPT 第 52~53 页】查看手机配置与功能
 * 要求：两款手机，配置信息包括品牌、型号、操作系统、价格、内存；
 *       功能包括自动拨号、游戏、播放歌曲；打印到控制台。
 * 知识点：类的定义 + 封装 + 有参构造方法 + 方法封装行为。
 *
 * 运行结果：
 *   -------- 手机1 --------
 *   品牌：华为，型号：Mate 60，操作系统：HarmonyOS 4.0，价格：6999.0 元，内存：12G
 *   自动拨号中，正在呼叫最近联系人...
 *   正在运行游戏：王者荣耀
 *   正在播放歌曲：《晴天》
 *   -------- 手机2 --------
 *   品牌：小米，型号：14 Ultra，操作系统：Android 14，价格：5999.0 元，内存：16G
 *   ...
 */
class Phone {
    private String brand;       // 品牌
    private String model;       // 型号
    private String os;          // 操作系统
    private double price;       // 价格
    private int memory;         // 内存（GB）

    public Phone(String brand, String model, String os, double price, int memory) {
        this.brand = brand;
        this.model = model;
        this.os = os;
        this.price = price;
        this.memory = memory;
    }

    public void showConfig() {      // 打印配置信息
        System.out.println("品牌：" + brand + "，型号：" + model + "，操作系统：" + os
                + "，价格：" + price + " 元，内存：" + memory + "G");
    }

    public void call() {            // 自动拨号
        System.out.println("自动拨号中，正在呼叫最近联系人...");
    }

    public void playGame() {        // 游戏
        System.out.println("正在运行游戏：王者荣耀");
    }

    public void playMusic() {       // 播放歌曲
        System.out.println("正在播放歌曲：《晴天》");
    }
}

public class PhoneTest {
    public static void main(String[] args) {
        Phone p1 = new Phone("华为", "Mate 60", "HarmonyOS 4.0", 6999, 12);
        Phone p2 = new Phone("小米", "14 Ultra", "Android 14", 5999, 16);

        System.out.println("-------- 手机1 --------");
        p1.showConfig();
        p1.call();
        p1.playGame();
        p1.playMusic();

        System.out.println("-------- 手机2 --------");
        p2.showConfig();
        p2.call();
        p2.playGame();
        p2.playMusic();
    }
}
