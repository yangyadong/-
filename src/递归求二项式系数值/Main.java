/** 
问题描述

样例输入
一个满足题目要求的输入范例。
3 10
样例输出
与上面的样例输入对应的输出。
120
数据规模和约定
　　输入数据中每一个数的范围。
　　例：结果在int表示时不会溢出。
 */
package 递归求二项式系数值;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		int n = scanner.nextInt();
		if(k==0||k==n){
			System.out.print(1);
		}else {
			System.out.print(sum(n-1, k)+sum(n-1, k-1));
		}
	}
	
	public static int sum(int m,int n) {
		int x=1;
		int y=1;
		for (int i = n; i > 0; i--) {
			x *=m;
			m--;
			y *=i;
		}
		return x/y;
	}
	
}
