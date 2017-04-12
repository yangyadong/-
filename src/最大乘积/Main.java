/**
��һ�����ִ���312�� ��N=3��K=1ʱ�����������ַַ���
1)  3*12=36
2)  31*2=62
   ��ʱ��������ĿҪ��Ľ���ǣ�31*2=62
   ���ڣ����������ĺ�����XZ���һ�����������ȷ�Ĵ𰸡�
�������� Input Description
   ��������빲�����У�
   ��һ�й���2����Ȼ��N��K��6��N��40��1��K��6��
   �ڶ�����һ������ΪN�����ִ���
������� Output Description
   �����ʾ����Ļ�ϣ���������룬Ӧ�������õ����˻���һ����Ȼ������
�������� Sample Input
4  2
1231
������� Sample Output
62
 */
package ���˻�;

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
