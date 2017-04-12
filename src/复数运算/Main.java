/**

设计复数库，实现基本的复数加减乘除运算。
　　输入时只需分别键入实部和虚部，以空格分割，两个复数之间用运算符分隔；输出时按a+bi的格式在屏幕上打印结果。参加样例输入和样例输出。
　　注意考虑特殊情况，无法计算时输出字符串"error"。
样例输入
2 4 * -3 2
样例输出
-14-8i
样例输入
3 -2 + -1 3
样例输出
2+1i
 * 
 * 

复数的四则运算规定为：
加法法则：
（a+bi）+（c+di）=（a+c）+（b+d）i
减法法则：
（a+bi）-（c+di）=（a-c）+（b-d）i
乘法法则：
（a+bi）·（c+di）=（ac-bd）+（bc+ad）i
除法法则：
（a+bi）/（c+di）=[（ac+bd）/（c²+d²）]+[（bc-ad）/（c²+d²）]i.
 */
package 复数运算;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a, b, c, d;
		String string;
		a = scanner.nextDouble();
		b = scanner.nextDouble();
		string = scanner.next();
		c = scanner.nextDouble();
		d = scanner.nextDouble();
		double x, y;
		switch (string) {
		case "+":
			x = a + c;
			y = b + d;
			System.out.println(format(x, y));
			break;
		case "-":
			x = a - c;
			y = b - d;
			System.out.println(format(x, y));
			break;
		case "*":
			x = a * c - b * d;
			y = b * c + a * d;
			System.out.println(format(x, y));
			break;
		case "/":
			x = c * c + d * d;
			if (x == 0) {
				System.out.println("error");
				return;
			}
			x = (a * c + b * d) / (c * c + d * d);
			y = (b * c - a * d) / (c * c + d * d);
			System.out.println(format(x, y));
			break;
		}
	}

	public static String format(double x, double y) {
		String res = "";
		if (x != 0) {
			res += String.valueOf(check(x));
			if (y > 0) {
				res += "+";
				res += String.valueOf(check(y));
				res += "i";
			} else if (y < 0) {
				res += String.valueOf(check(y));
				res += "i";
			}
		} else {
			if (y != 0) {
				res += String.valueOf(check(y));
				res += "i";
			}
		}
		return res;
	}

	public static String check(double num) {
		String res;
		if (num == (int) num) {
			res = String.valueOf((int)num);
		}else {
			res = String.valueOf(num);
		}
		return res;
	}
	
}
