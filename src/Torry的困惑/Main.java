/**
问题描述
　　Torry从小喜爱数学。一天，老师告诉他，像2、3、5、7……这样的数叫做质数。Torry突然想到一个问题，前10、100、1000、10000……个质数的乘积是多少呢？他把这个问题告诉老师。老师愣住了，一时回答不出来。于是Torry求助于会编程的你，请你算出前n个质数的乘积。不过，考虑到你才接触编程不久，Torry只要你算出这个数模上50000的值。
输入格式
　　仅包含一个正整数n，其中n<=100000。
输出格式
　　输出一行，即前n个质数的乘积模50000的值。
样例输入
	1
样例输出
	2
 */
package Torry的困惑;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] res = new int[n+2];
		res[0] = 2;
		res[1] = 3;
		res[2] = 5;
		int i = 3;
		int num = 7;
		double num1;
		while (i < n) {
			num1 = num/2;
			for (int j = 2; j < num1; j++) {
				if (num%j==0) {
					break;
				}else if (j==num1-1) {
					res[i] = num;
					i++;
				}
			}
			num++;
		}
		int res1 = 1;
		for (int j = 0; j < n; j++) {
			res1=(res1*res[j])%50000;
		}
		System.out.println(res1);
	}
}
