/**
滑动解锁是智能手机一项常用的功能。你需要在3x3的点阵上，从任意一个点开始，反复移动到一个尚未经过的"相邻"的点。这些划过的点所组成的有向折线，如果与预设的折线在图案、方向上都一致，那么手机将解锁。
所谓两个点“相邻”：当且仅当以这两个点为端点的线段上不存在尚未经过的点。
此外，许多手机都约定：这条折线还需要至少经过4个点。
为了描述方便，我们给这9个点从上到下、从左到右依次编号1-9。即如下排列：
1 2 3
4 5 6
7 8 9
那么1->2->3是非法的，因为长度不足。
1->3->2->4也是非法的，因为1->3穿过了尚未经过的点2。
2->4->1->3->6是合法的，因为1->3时点2已经被划过了。
某大神已经算出：一共有389112种不同的解锁方案。没有任何线索时，要想暴力解锁确实很难。
不过小Hi很好奇，他希望知道，当已经瞥视到一部分折线的情况下，有多少种不同的方案。
遗憾的是，小Hi看到的部分折线既不一定是连续的，也不知道方向。
例如看到1-2-3和4-5-6，
那么1->2->3->4->5->6，1->2->3->6->5->4, 3->2->1->6->5->4->8->9等都是可能的方案。
你的任务是编写程序，根据已经瞥到的零碎线段，求可能解锁方案的数目。
输入：
每个测试数据第一行是一个整数N(0 <= N <= 8)，代表小Hi看到的折线段数目。
以下N行每行包含两个整数 X 和 Y (1 <= X, Y <= 9)，代表小Hi看到点X和点Y是直接相连的。
输出：
对于每组数据输出合法的解锁方案数目。
例如：
输入：
8
1 2 2 3
3 4 4 5
5 6 6 7
7 8 8 9
程序应该输出：
2
再例如：
输入：
4
2 4
2 5
8 5
8 6
程序应该输出：
258
 */
package 模拟赛滑动解锁;

import java.util.Scanner;

public class Main {
	private static int N; // 表示看到的边数
	private static int[][] path; // 连接的点数
	private static boolean[] keep = new boolean[10];
	private static int count; // 表示能有多少个可能的结果

	private static boolean isBool(int a, int b) {
		// 8种情况
		int dig[][] = new int[][] { { 1, 3, 2 }, { 4, 6, 5 }, { 7, 9, 8 }, { 1, 7, 4 }, { 2, 8, 5 }, { 3, 9, 6 },
				{ 1, 9, 5 }, { 3, 7, 5 } };
		for (int i = 0; i < 8; i++) {
			if (a == dig[i][0] && b == dig[i][1] || a == dig[i][1] && b == dig[i][0])
				if (!keep[dig[i][2]])
					return false;
		}
		return true;
	}

	/*
	 * @N 必须连接的个数
	 * 
	 * @step 当前连接的点数
	 * 
	 * @a 记录连接的序号
	 */
	private static void dfs(int number, int step, int[] process) {
		if (step >= 2) {
			int a = process[step - 2];
			int b = process[step - 1];
			// 如果为false的话， 那么直接就跳出这次遍历情况
			if (!isBool(a, b))
				return;
		}
		if (step == number) {
			for (int i = 0; i < N; i++) {
				int a = path[i][0];
				int b = path[i][1];
				for (int j = 0; j < step - 1; j++) {
					if (a == process[j] && b == process[j + 1] || a == process[j + 1] && b == process[j])
						break;
					if (j == step - 2)
						return;
				}
			}
			count++;
			return;
		} else if (step > number)
			return;

		for (int i = 1; i <= 9; i++) {
			if (!keep[i]) {
				keep[i] = true;
				process[step] = i; // 当前位置的值
				dfs(number, step + 1, process);
				keep[i] = false; // 回溯
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		path = new int[N + 1][2];
		int[] process = new int[10];

		for (int i = 0; i < N; i++) {
			path[i][0] = sc.nextInt();
			path[i][1] = sc.nextInt();
		}
		// 如果N的数字大于4，那么就是必须连接到N个数， 否则按连接到4为基准
		for (int i = N > 4 ? N : 4; i <= 9; i++)
			dfs(i, 0, process);

		System.out.println(count);
		sc.close();
	}
}
