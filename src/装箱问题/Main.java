/**
题目描述 Description
有一个箱子容量为V（正整数，0＜＝V＜＝20000），同时有n个物品（0＜n＜＝30），每个物品有一个体积（正整数）。
要求n个物品中，任取若干个装入箱内，使箱子的剩余空间为最小。
输入描述 Input Description
一个整数v，表示箱子容量
一个整数n，表示有n个物品
接下来n个整数，分别表示这n 个物品的各自体积
输出描述 Output Description
一个整数，表示箱子剩余空间。
样例输入 Sample Input
24
6
8
3
12
7
9
7
样例输出 Sample Output
0
 */
package 装箱问题;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int v,n;
		v = scanner.nextInt();
		n = scanner.nextInt();
		int[] w = new int[n];
		for (int i = 0; i < n; i++) {
			w[i] = scanner.nextInt();
		}
		int[] dp = new int[v+1];
		for (int i = 0; i < n; i++) {
			for (int j = v; j >= w[i]; j--) {
				dp[j] = Math.max(dp[j], dp[j-w[i]]+w[i]);
			}
		}
		System.out.println(v-dp[v]);
	}
}
