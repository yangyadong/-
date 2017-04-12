/**
��Ŀ���� Description
��һ����������ΪV����������0����V����20000����ͬʱ��n����Ʒ��0��n����30����ÿ����Ʒ��һ�����������������
Ҫ��n����Ʒ�У���ȡ���ɸ�װ�����ڣ�ʹ���ӵ�ʣ��ռ�Ϊ��С��
�������� Input Description
һ������v����ʾ��������
һ������n����ʾ��n����Ʒ
������n���������ֱ��ʾ��n ����Ʒ�ĸ������
������� Output Description
һ����������ʾ����ʣ��ռ䡣
�������� Sample Input
24
6
8
3
12
7
9
7
������� Sample Output
0
 */
package װ������;

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
