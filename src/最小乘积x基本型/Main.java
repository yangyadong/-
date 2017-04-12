/**
问题描述
　　给两组数，各n个。
　　请调整每组数的排列顺序，使得两组数据相同下标元素对应相乘，然后相加的和最小。要求程序输出这个最小值。
　　例如两组数分别为:1 3　　-5和-2 4 1

　　那么对应乘积取和的最小值应为：
　　(-5) * 4 + 3 * (-2) + 1 * 1 = -25
输入格式
　　第一个行一个数T表示数据组数。后面每组数据，先读入一个n，接下来两行每行n个数，每个数的绝对值小于等于1000。
　　n<=8,T<=1000
输出格式
　　一个数表示答案。
样例输入
2
3
1 3 -5
-2 4 1
5
1 2 3 4 5
1 0 1 0 1

样例输出


-25
6
 */
package 最小乘积x基本型;

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
