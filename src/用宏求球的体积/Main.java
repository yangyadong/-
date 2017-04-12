/**
问题描述
　　使用宏实现计算球体体积的功能。用户输入半径，系统输出体积。不能使用函数，pi=3.1415926,结果精确到小数点后五位。
样例输入
一个满足题目要求的输入范例。
例：
1.0
样例输出
与上面的样例输入对应的输出。
例：
1.0
结果：4.18879
数据规模和约定
　　输入数据中每一个数的范围。
　　数据表示采用double类型。
 */
package 用宏求球的体积;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double pi = 3.1415926;
		Scanner scanner = new Scanner(System.in);
		double r = scanner.nextDouble();
		double res = Math.pow(r, 3)*pi*4/3;
		System.out.format("%.5f", res);
	}
}
