/**
����
ACM��zyc���о�01������֪��ĳһ01���ĳ��ȣ�������֪�������С�11���Ӵ������ֳ��ȵ�01�����ж��ٸ�����ϣ�����ܰ������

ע��01���ĳ���Ϊ2ʱ,��3�֣�00��01��10��

����
��һ����һ������n��0<n<=100��,��ʾ��n���������;
�����n�У�ÿ����һ������m(2<=m<=40)����ʾ01���ĳ���;
���
��������С�11���Ӵ������ֳ��ȵ�01�����ж��ٸ���ռһ�С�
��������
2
2
3
�������
3
5
 */
package ACM01��;

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
