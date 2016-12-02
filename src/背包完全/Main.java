/**
测试数据
5 10
3 6
4 8
6 7
2 5
5 9
结果：25
 */
package 背包完全;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[] w = new int[n];
		int[] v = new int[n];
		int[] dp = new int[m+1];
		for (int i = 0; i < n; i++) {
			w[i] = scanner.nextInt();
			v[i] = scanner.nextInt();
		}
		for (int i = 0; i < n; i++) {
			for (int j = w[i]; j <= m; j++) {
				dp[j] = Math.max(dp[j], dp[j-w[i]]+v[i]);
			}
			for (int j = 0; j < dp.length; j++) {
				System.out.printf("%4d",dp[j]);
			}
			System.out.println();
		}
		System.out.println(dp[m]);
	}
}
