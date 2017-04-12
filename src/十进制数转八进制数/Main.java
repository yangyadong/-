/**
编写函数，其功能为把一个十进制数转换为其对应的八进制数。程序读入一个十进制数，调用该函数实现数制转换后，输出对应的八进制数。
 样例输入
 9274
 样例输出
 22072
样例输入
 18
 样例输出
 22
 */
package 十进制数转八进制数;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Stack<Integer> reStack = new Stack<Integer>();
		int temp;
		while (n != 0) {
			temp = n % 8;
			reStack.add(temp);
			n = n / 8;
		}
		while (!reStack.isEmpty()) {
			System.out.print(reStack.pop());
		}
	}
}
