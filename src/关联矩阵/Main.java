/**
��������
������һ��n�����m���ߵ�����ͼ����������Ĺ�������
�����ʽ
������һ����������n��m����ʾͼ�н��ͱߵ���Ŀ��n<=100,m<=1000��
����������m�У�ÿ����������a��b����ʾͼ����(a,b)�ߡ�
����ע��ͼ�п��ܺ����رߣ����������Ի���
�����ʽ
���������ͼ�Ĺ�������ע������ı�ߺͽ���˳��
��������
5 9
1 2
3 1
1 5
2 5
2 3
2 3
3 2
4 3
5 4
�������
1 -1 1 0 0 0 0 0 0
-1 0 0 1 1 1 -1 0 0
0 1 0 0 -1 -1 1 -1 0
0 0 0 0 0 0 0 1 -1
0 0 -1 -1 0 0 0 0 1
 */
package ��������;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[][] num = new int[n][m];
		int k = 0, t = 0;
		for (int i = 0; i < m; i++) {
			k = scanner.nextInt();
			t = scanner.nextInt();
			num[k - 1][i] = 1;
			num[t - 1][i] = -1;
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m - 1; j++) {
				System.out.print(num[i][j] + " ");
			}
			System.out.println(num[i][m - 1]);
		}
	}
}
