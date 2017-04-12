/**
问题描述
　　右右喜欢听故事，但是右右的妈妈总是讲一些“从前有座山，山里有座庙，庙里有个老和尚给小和尚讲故事，讲的什么呢？从前有座山……”这样循环的故事来搪塞右右。
　　我们定义，如果一个字符串是以一个或者一个以上的长度为k的重复字符串所连接成的，那么这个字符串就叫做周期为k的串。
　　例如:
　　字符串’abcabcabcabc’周期为3，因为它是由4个循环’abc’组成的。它同样是以6为周期（两个重复的’abcabc’）和以12为周期（一个循环’abcabcabcabc’）。
　　右右现在想给他的朋友大灰狼转述妈妈讲的故事，请帮他写一个程序，可以测定一个字符串的最小周期。
输入格式
　　一个最大长度为100的无空格的字符串。
输出格式
　　一个整数，表示输入的字符串的最小周期。
样例输入
HaHaHa
样例输出
2
样例输入
Return0
样例输出
7
 */
package 周期字串;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		int num = str.length();
		String res, temp;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				res = str.substring(0, i);
				for (int j = 0; j < num; j += i) {
					temp = str.substring(j, j + i);
					if (!res.equals(temp)) {
						break;
					} else if (j + i == num) {
						System.out.println(i);
						return;
					}
				}
			}
		}
		System.out.println(num);
	}
}
