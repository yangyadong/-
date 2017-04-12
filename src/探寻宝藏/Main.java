/**
����
��˵HMH��ɳĮ����һ��M*N�Թ������������౦�ĳ�죬Dr.Kong�ҵ����Թ��ĵ�ͼ���������Թ��ڴ����б�������ı���Ͳ������½ǣ��Թ��Ľ����������Ͻǡ���Ȼ���Թ��е�ͨ·����ƽ̹�ģ������������塣Dr.Kong���������Ļ����˿���ȥ̽�ա�
�������˿�������Ͻ��ߵ����½�ʱ��ֻ�������߻��������ߡ������½������ߵ����Ͻ�ʱ��ֻ�������߻��������ߣ����ҿ��಻�߻�ͷ·��������һ������ྭ��һ�Σ�����Ȼ����˳��Ҳ������·��ÿ�����
Dr.Kongϣ�����Ļ����˿��ྡ����ش�����������д���򣬰���Dr.Kong����һ�£���������ܴ������ٱ��
����
��һ�У� K ��ʾ�ж�����������ݡ� 
��������ÿ��������ݣ�
��1��: M N
��2~M+1�У� Ai1 Ai2 ����AiN (i=1,��..,m)

��Լ��������
2��k��5 1��M, N��50 0��Aij��100 (i=1,��.,M; j=1,��,N)
�������ݶ��������� ����֮����һ���ո�
���
����ÿ��������ݣ����һ�У������˿���Я��������ֵ�ı�����
��������
2
2 3
0 10 10
10 10 80
3 3
0 3 9
2 8 5
5 7 100
�������
120
134
 */
package ̽Ѱ����;

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
