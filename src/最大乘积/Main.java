/**
有一个数字串：312， 当N=3，K=1时会有以下两种分法：
1)  3*12=36
2)  31*2=62
   这时，符合题目要求的结果是：31*2=62
   现在，请你帮助你的好朋友XZ设计一个程序，求得正确的答案。
输入描述 Input Description
   程序的输入共有两行：
   第一行共有2个自然数N，K（6≤N≤40，1≤K≤6）
   第二行是一个长度为N的数字串。
输出描述 Output Description
   结果显示在屏幕上，相对于输入，应输出所求得的最大乘积（一个自然数）。
样例输入 Sample Input
4  2
1231
样例输出 Sample Output
62
 */
package 最大乘积;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n, k;
		n = scanner.nextInt();
		k = scanner.nextInt();
		char[] ns = scanner.next().toCharArray();
		long[][] num = new long[n + 1][n + 1];
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				num[i][j] = num[i][j - 1] * 10 + ((long) ns[j - 1] - 48);
			}
		}
		long[][] dp = new long[n + 1][k + 1];
		for (int i = 1; i <= n; i++) {
			dp[i][0] = num[1][i];
		}
		for (int j = 1; j <= k; j++) {
			for (int i = 2; i <= n; i++) {
				for (int l = 1; l < i; l++) {
					dp[i][j] = Math.max(dp[i][j], dp[l][j - 1] * num[l + 1][i]);
				}
			}
		}
		System.out.println(dp[n][k]);
	}
}
