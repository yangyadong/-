/**
Bean-eating is an interesting game, everyone owns an M*N matrix, 
which is filled with different qualities beans. Meantime, there is only one bean in any 1*1 grid. 
Now you want to eat the beans and collect the qualities, but everyone must obey by the following rules: 
if you eat the bean at the coordinate(x, y), you can’t eat the beans anyway at the coordinates listed (if exiting):
 (x, y-1), (x, y+1), and the both rows whose abscissas are x-1 and x+1.
 Now, how much qualities can you eat and then get ?
输入
There are a few cases. In each case, there are two integer M (row number) and N (column number). The next M lines each contain N integers, representing the qualities of the beans. We can make sure that the quality of bean isn't beyond 1000, and 1<=M,N<=500.
输出
For each case, you just output the MAX qualities you can eat and then get.
样例输入
4 6
11 0 7 5 13 9
78 4 81 6 22 4
1 40 9 34 16 10
11 22 0 33 39 6
样例输出
242
 */
package 啊不会吃土豆;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[][] num = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				num[i][j] = scanner.nextInt();
			}
		}
		int[][] dp = new int[m + 1][2];
		int[] sum = new int[n];
		for (int i = 0; i < n; i++) {
			dp[0][0] = num[i][0];
			dp[0][1] = 0;
			for (int j = 1; j < m; j++) {
				if (j == 1)
					dp[j][0] = num[i][j];
				else
					dp[j][0] = Math.max(dp[j - 2][0], dp[j - 2][1]) + num[i][j];
				dp[j][1] = Math.max(dp[j - 1][0], dp[j - 1][1]);
			}
			sum[i] = Math.max(dp[m - 1][0], dp[m - 1][1]);
		}
		dp[0][0] = sum[0];
		dp[0][1] = 0;
		for (int i = 1; i < n; i++) {
			if (i == 1)
				dp[i][0] = sum[i];
			else
				dp[i][0] = Math.max(dp[i - 2][0], dp[i - 2][1]) + sum[i];
			dp[i][1] = Math.max(dp[i - 1][0], dp[i - 1][1]);
		}
		System.out.println(Math.max(dp[n - 1][0], dp[n - 1][1]));
	}
}
