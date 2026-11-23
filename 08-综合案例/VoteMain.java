/**
 * 【案例 3-4 · PPT 第 88 页】学生投票系统
 * 需求：班级 10 个学生竞选班干部，每个学生（学号 1~10）只能投一票；
 *       投票成功提示"感谢你的投票"；重复投票提示"请勿重复投票"；
 *       当投票总数达到 10 或人为结束投票时，统计投票人数和投票结果。
 * 知识点：static 共享属性 + 封装 + 数组综合运用。
 *
 * 运行示例（依次输入 1、1、3、0）：
 *   ========== 学生投票系统 ==========
 *   请输入投票学生的学号（1~10，输入 0 结束投票）：1
 *   学号为 1 的学生投票成功，感谢你的投票！
 *   请输入投票学生的学号（1~10，输入 0 结束投票）：1
 *   学号为 1 的学生已投过票，请勿重复投票！
 *   请输入投票学生的学号（1~10，输入 0 结束投票）：3
 *   学号为 3 的学生投票成功，感谢你的投票！
 *   请输入投票学生的学号（1~10，输入 0 结束投票）：0
 *   ========== 投票统计 ==========
 *   共有 2 名学生参与投票
 *   候选人 1 号得票：1 票
 *   ...
 *   目前票数领先：1 号候选人（1 票）
 */
import java.util.Scanner;

class VoteSystem {
    private static final int STUDENT_COUNT = 10;    // 班级学生总人数
    private static boolean[] voted = new boolean[STUDENT_COUNT + 1]; // 下标即学号，标记该学生是否已投票
    private static int[] votes = new int[STUDENT_COUNT + 1];         // 下标即候选人学号，记录得票数
    private static int totalVoters = 0;             // 已投票人数（static 属性，全系统共享一份）

    // 投票：学号对应的候选人得 1 票；返回是否投票成功
    public static boolean vote(int studentId) {
        if (studentId < 1 || studentId > STUDENT_COUNT) {
            System.out.println("学号输入有误，请输入 1~10 之间的学号！");
            return false;
        }
        if (voted[studentId]) {                     // 已投过票 → 拒绝重复投票
            System.out.println("学号为 " + studentId + " 的学生已投过票，请勿重复投票！");
            return false;
        }
        voted[studentId] = true;                    // 标记为已投票，防止重复投票
        votes[studentId]++;                         // 该学号候选人得 1 票
        totalVoters++;                              // 投票总人数 +1
        System.out.println("学号为 " + studentId + " 的学生投票成功，感谢你的投票！");
        return true;
    }

    // 判断投票总数是否已达 10 人
    public static boolean isFull() {
        return totalVoters >= STUDENT_COUNT;
    }

    // 统计投票人数和投票结果
    public static void showResult() {
        System.out.println("========== 投票统计 ==========");
        System.out.println("共有 " + totalVoters + " 名学生参与投票");
        for (int i = 1; i <= STUDENT_COUNT; i++) {
            System.out.println("候选人 " + i + " 号得票：" + votes[i] + " 票");
        }
        if (totalVoters > 0) {                      // 找出得票最高的候选人
            int maxId = 1;
            for (int i = 2; i <= STUDENT_COUNT; i++) {
                if (votes[i] > votes[maxId]) {
                    maxId = i;
                }
            }
            System.out.println("目前票数领先：" + maxId + " 号候选人（" + votes[maxId] + " 票）");
        } else {
            System.out.println("暂无投票数据。");
        }
    }
}

public class VoteMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("========== 学生投票系统 ==========");
        System.out.println("投票说明：输入投票学生的学号（1~10）；达到 10 人或输入 0 时结束投票");

        while (true) {
            System.out.print("请输入投票学生的学号（1~10，输入 0 结束投票）：");
            int id = sc.nextInt();
            if (id == 0) {                  // 人为结束投票
                break;
            }
            VoteSystem.vote(id);            // 执行投票（成功或重复投票都会给出提示）
            if (VoteSystem.isFull()) {      // 投票总数达到 10 人，自动结束
                System.out.println("投票人数已满 10 人，投票结束！");
                break;
            }
        }
        VoteSystem.showResult();            // 统计投票人数和投票结果
        sc.close();
    }
}
