/**
��������
����������������n����
���������ÿ����������˳��ʹ������������ͬ�±�Ԫ�ض�Ӧ��ˣ�Ȼ����ӵĺ���С��Ҫ�������������Сֵ��
���������������ֱ�Ϊ:1 3����-5��-2 4 1

������ô��Ӧ�˻�ȡ�͵���СֵӦΪ��
����(-5) * 4 + 3 * (-2) + 1 * 1 = -25
�����ʽ
������һ����һ����T��ʾ��������������ÿ�����ݣ��ȶ���һ��n������������ÿ��n������ÿ�����ľ���ֵС�ڵ���1000��
����n<=8,T<=1000
�����ʽ
����һ������ʾ�𰸡�
��������
2
3
1 3 -5
-2 4 1
5
1 2 3 4 5
1 0 1 0 1

�������


-25
6
 */
package ��С�˻�x������;

import java.util.Scanner;

public class Main {
	static int[] num1;
	static int[][] res;
	static int x;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		res = new int[t][2];
		int n;
		int[] num2;
		for (int i = 0; i < t; i++) {
			x = i;
			n = scanner.nextInt();
			num1 = new int[n];
			num2 = new int[n];
			for (int j = 0; j < n; j++) {
				num1[j] = scanner.nextInt();
			}
			for (int j = 0; j < n; j++) {
				num2[j] = scanner.nextInt();
			}
			test(num2, 0);
		}
		for (int i = 0; i < t; i++) {
			System.out.println(res[i][0]);
		}
	}
	
	public static void test(int[] num,int k) {
		if (k>=num.length) {
			check(num);
		}
		for (int i = k; i < num.length; i++) {
			{int t=num[k];num[k]=num[i];num[i]=t;}
			test(num,k+1);
			{int t=num[k];num[k]=num[i];num[i]=t;}
		}
	}
	
	
	public static void check(int[] num) {
		int k = 0;
		for (int i = 0; i < num.length; i++) {
			k += num1[i]*num[i];
		}
		if (res[x][1]==0) {
			res[x][0] = k;
			res[x][1] = 1;
		}else if (k<res[x][0]) {
			res[x][0] = k;
		}
	}

}
