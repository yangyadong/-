/**
 问题描述
　　给n个有序整数对ai bi，你需要选择一些整数对 使得所有你选定的数的ai+bi的和最大。并且要求你选定的数对的ai之和非负，bi之和非负。
输入格式
　　输入的第一行为n，数对的个数
　　以下n行每行两个整数 ai bi
输出格式
　　输出你选定的数对的ai+bi之和
样例输入
5
-403 -625
-847 901
-624 -708
-293 413
886 709
样例输出
1715
 */
package 啊超时求最大值;

import java.util.Scanner;

public class Main {
	static int res;
	static int[] a;
	static int[] b;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		a = new int[n];
		b = new int[n];
		for (int i = 0; i <n ; i++) {
			a[i] = scanner.nextInt();
			b[i] = scanner.nextInt();
		}
		System.out.println(dp(0,0,n-1));
	}
	
	public static int dp(int x,int y,int n) {
		int ret;
		if(n==0)
			if(x+a[n]>=0&&y+b[n]>=0&&a[n]+b[n]>0)
				ret=a[n]+b[n];
			else
				ret=0;
		else if(a[n]+b[n]>0&&x+a[n]>=0&&y+b[n]>=0)
			ret=Math.max(dp(x,y,n-1),dp(x+a[n],y+b[n],n-1)+a[n]+b[n]);
		else
			ret=dp(x,y,n-1);
		return ret;
	}
}
