/**
问题描述
　　有n个矩阵，大小分别为a0*a1, a1*a2, a2*a3, ..., a[n-1]*a[n]，现要将它们依次相乘，只能使用结合率，求最少需要多少次运算。
　　两个大小分别为p*q和q*r的矩阵相乘时的运算次数计为p*q*r。
输入格式
　　输入的第一行包含一个整数n，表示矩阵的个数。
　　第二行包含n+1个数，表示给定的矩阵。
输出格式
　　输出一个整数，表示最少的运算次数。
样例输入
3
1 10 5 20
样例输出
150
数据规模和约定
　　1<=n<=1000, 1<=ai<=10000。
 */
package 啊不会矩阵乘法DP;

import java.util.Scanner;

public class Main {

	public static void printResult(int[] arrayMatrix) {
		int length = arrayMatrix.length; // 有length个数，可知有length - 1个矩阵
		long[][] dp = new long[length][length]; // dp[0][i]和dp[i][0]均为0，无意义
		long sum;
		for (int len = 2; len < length; len++) { // 依次计算len个矩阵相乘的最小结果，即dp[1][len]
			for (int i = 1, j = len; j < length; i++, j++) { // 此层循环用于计算dp[i][j]值，即矩阵中对角线的元素值
				long min = Long.MAX_VALUE;
				for (int k = i; k < j; k++) { // 此层循环，用于找到dp[i][j]的最小值
					sum = dp[i][k] + dp[k + 1][j] + arrayMatrix[i - 1] * arrayMatrix[k] * arrayMatrix[j];
					if (min > sum)
						min = sum;
				}
				dp[i][j] = min;
			}
		}
		// 输出最终结果
		System.out.println(dp[1][length - 1]);
		return;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if (n <= 1 || n > 1000)
			return;
		int[] arrayMatrix = new int[n + 1];
		for (int i = 0; i <= n; i++)
			arrayMatrix[i] = in.nextInt();
		printResult(arrayMatrix);
	}
}
