/**
问题描述
　　已知n和m，打印n^1，n^2，...，n^m。要求用静态变量实现。n^m表示n的m次方。已知n和m，打印n^1，n^2，...，n^m。要求用静态变量实现。n^m表示n的m次方。（每行显示5个数，每个数宽为12，右对齐）
样例输入
一个满足题目要求的输入范例。
例：
3 8
样例输出
与上面的样例输入对应的输出。
例：
           3           9          27          81         243
         729        2187        6561
数据规模和约定
　　输入数据中每一个数的范围。
　　例：n^m小于int 的表示范围。
 */
package 求指数;

import java.util.Scanner;

public class Main {
	static int res;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		for (int i = 1; i <= m; i++) {
			res = (int)Math.pow(n, i);
			System.out.format("%12d", res);
			if (i%5==0) {
				System.out.println();
			}
		}
		
	}
}
