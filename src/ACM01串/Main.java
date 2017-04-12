/**
描述
ACM的zyc在研究01串，他知道某一01串的长度，但他想知道不含有“11”子串的这种长度的01串共有多少个，他希望你能帮帮他。

注：01串的长度为2时,有3种：00，01，10。

输入
第一行有一个整数n（0<n<=100）,表示有n组测试数据;
随后有n行，每行有一个整数m(2<=m<=40)，表示01串的长度;
输出
输出不含有“11”子串的这种长度的01串共有多少个，占一行。
样例输入
2
2
3
样例输出
3
5
 */
package ACM01串;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			check(scanner.nextInt());
		}
	}
	public static void check(int k) {
		int[] dp = new int[41];
		dp[2] = 3;
		dp[3] = 5;
		for (int i = 4; i <= k; i++) {
			dp[i] = dp[i-1]+dp[i-2];
		}
		System.out.println(dp[k]);
	}
}
