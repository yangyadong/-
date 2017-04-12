/**
��������
������n�����󣬴�С�ֱ�Ϊa0*a1, a1*a2, a2*a3, ..., a[n-1]*a[n]����Ҫ������������ˣ�ֻ��ʹ�ý���ʣ���������Ҫ���ٴ����㡣
����������С�ֱ�Ϊp*q��q*r�ľ������ʱ�����������Ϊp*q*r��
�����ʽ
��������ĵ�һ�а���һ������n����ʾ����ĸ�����
�����ڶ��а���n+1��������ʾ�����ľ���
�����ʽ
�������һ����������ʾ���ٵ����������
��������
3
1 10 5 20
�������
150
���ݹ�ģ��Լ��
����1<=n<=1000, 1<=ai<=10000��
 */
package ���������˷�DP;

import java.util.Scanner;

public class Main {

	public static void printResult(int[] arrayMatrix) {
		int length = arrayMatrix.length; // ��length��������֪��length - 1������
		long[][] dp = new long[length][length]; // dp[0][i]��dp[i][0]��Ϊ0��������
		long sum;
		for (int len = 2; len < length; len++) { // ���μ���len��������˵���С�������dp[1][len]
			for (int i = 1, j = len; j < length; i++, j++) { // �˲�ѭ�����ڼ���dp[i][j]ֵ���������жԽ��ߵ�Ԫ��ֵ
				long min = Long.MAX_VALUE;
				for (int k = i; k < j; k++) { // �˲�ѭ���������ҵ�dp[i][j]����Сֵ
					sum = dp[i][k] + dp[k + 1][j] + arrayMatrix[i - 1] * arrayMatrix[k] * arrayMatrix[j];
					if (min > sum)
						min = sum;
				}
				dp[i][j] = min;
			}
		}
		// ������ս��
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
