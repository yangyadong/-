/**
 问题描述
　　0、1、2三个数字的全排列有六种，按照字母序排列如下：
　　012、021、102、120、201、210
　　输入一个数n
　　求0~9十个数的全排列中的第n个（第1个为0123456789）。
输入格式
　　一行，包含一个整数n
输出格式
　　一行，包含一组10个数字的全排列
样例输入
1
样例输出
0123456789
数据规模和约定
　　0 < n <= 10!
 */
package 排列数;

import java.util.Scanner;

public class Main {
	static int sum = 0;
	static int n;
	static int[] num = new int[10];
	static int[] vis = new int[10];

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		sort(0);
	}

	public static void sort(int pos) {
		if (pos == 10) {
			sum++;
			if (sum == n) {
				for (int i = 0; i < num.length; i++)
					System.out.print(num[i]);
			}
		}
		for (int i = 0; i <= 9; i++) {
			if (vis[i] == 0) {
				num[pos] = i;
				vis[i] = 1;
				sort(pos + 1);
				vis[i] = 0;
			}
		}
	}

}
