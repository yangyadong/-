/**
问题描述
　　给定一个十进制整数，返回其对应的二进制数的位数。例如，输入十进制数9，其对应的二进制数是1001，因此位数是4。
样例输入
一个满足题目要求的输入范例。
9
样例输出
4
与上面的样例输入对应的输出。

数据规模和约定
　　输入数据中每一个数的范围。
　　例：输入在int表示范围内。

 */
package 递归求二进制表示位数;

import java.util.Scanner;

public class Main {
	static int res = 0;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		check(n);
		System.out.print(res);
	}
	public static void check(int n) {
		res++;
		if(n/2!=0){
			check(n/2);
		}
	}
}
