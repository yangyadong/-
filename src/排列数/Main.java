/**
 ��������
����0��1��2�������ֵ�ȫ���������֣�������ĸ���������£�
����012��021��102��120��201��210
��������һ����n
������0~9ʮ������ȫ�����еĵ�n������1��Ϊ0123456789����
�����ʽ
����һ�У�����һ������n
�����ʽ
����һ�У�����һ��10�����ֵ�ȫ����
��������
1
�������
0123456789
���ݹ�ģ��Լ��
����0 < n <= 10!
 */
package ������;

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
