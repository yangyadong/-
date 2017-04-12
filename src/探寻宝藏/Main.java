/**
描述
传说HMH大沙漠中有一个M*N迷宫，里面藏有许多宝物。某天，Dr.Kong找到了迷宫的地图，他发现迷宫内处处有宝物，最珍贵的宝物就藏在右下角，迷宫的进出口在左上角。当然，迷宫中的通路不是平坦的，到处都是陷阱。Dr.Kong决定让他的机器人卡多去探险。
但机器人卡多从左上角走到右下角时，只会向下走或者向右走。从右下角往回走到左上角时，只会向上走或者向左走，而且卡多不走回头路。（即：一个点最多经过一次）。当然卡多顺手也拿走沿路的每个宝物。
Dr.Kong希望他的机器人卡多尽量多地带出宝物。请你编写程序，帮助Dr.Kong计算一下，卡多最多能带出多少宝物。
输入
第一行： K 表示有多少组测试数据。 
接下来对每组测试数据：
第1行: M N
第2~M+1行： Ai1 Ai2 ……AiN (i=1,…..,m)

【约束条件】
2≤k≤5 1≤M, N≤50 0≤Aij≤100 (i=1,….,M; j=1,…,N)
所有数据都是整数。 数据之间有一个空格。
输出
对于每组测试数据，输出一行：机器人卡多携带出最多价值的宝物数
样例输入
2
2 3
0 10 10
10 10 80
3 3
0 3 9
2 8 5
5 7 100
样例输出
120
134
 */
package 探寻宝藏;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		int m, n;
		int[][] num = new int[55][55];
		for (int i = 0; i < k; i++) {
			m = scanner.nextInt();
			n = scanner.nextInt();
//			num = new int[m+1][n+1];
			for (int j = 1; j <= m; j++) {
				for (int j2 = 1; j2 <= n; j2++) {
					num[j][j2] = scanner.nextInt();
				}
			}
			System.out.println(DP(m, n, num));
		}
	}

	public static int DP(int m, int n, int[][] map) {
		if (m == 1 || n == 1) {
			return 0;
		}
		int[][][] dp = new int[2 * 55][55][55];
		int i, j, k;
		for (k = 3; k < m + n; k++) {
			for (i = 2; i < k && i <= m; i++) {
				if (k - i >= n || k - i < 1)
					continue;
				for (j = 1; j < k - 1 && j <= m - 1; j++) {
					if (i == j)
						continue;
					if (k - j > n || k - j <= 1)
						continue;
					dp[k][i][j] = Math.max(Math.max(dp[k - 1][i - 1][j], dp[k - 1][i - 1][j - 1]),
							Math.max(dp[k - 1][i][j - 1], dp[k - 1][i][j]));
					dp[k][i][j] += map[i][k - i] + map[j][k - j];
				}
			}
		}
		return dp[m + n - 1][m][m - 1] + map[m][n];
	}

}
