/**
问题描述
　　给定一个长度为n的字符串S，还有一个数字L，统计长度大于等于L的出现次数最多的子串（不同的出现可以相交），如果有多个，输出最长的，如果仍然有多个，输出第一次出现最早的。
输入格式
　　第一行一个数字L。
　　第二行是字符串S。
　　L大于0，且不超过S的长度。
输出格式
　　一行，题目要求的字符串。

　　输入样例1：
　　4
　　bbaabbaaaaa

　　输出样例1：
　　bbaa

　　输入样例2：
　　2
　　bbaabbaaaaa

　　输出样例2：
　　aa
数据规模和约定
　　n<=60
　　S中所有字符都是小写英文字母。
提示
　　枚举所有可能的子串，统计出现次数，找出符合条件的那个
 */
package 字串统计;

import java.util.Scanner;

public class Main {
	static String string;
	static int l;
	static String res;
	static String result;
	static int resultNum = 0;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		string = scanner.next();
		for (l = num; l <= string.length(); l++) {
			int m = string.length() - l;
			for (int i = 0; i < m; i++) {
				res = string.substring(i, i + l);
				check();
			}
		}
		System.out.println(result);
	}

	public static void check() {
		int num = 0;
		int m = string.length() - l;
		for (int i = 0; i < m; i++) {
			if (res.equals(string.substring(i, i + l))) {
				num++;
			}
		}
		if (result != null) {
			if (num > resultNum || (num == resultNum && result.length() < res.length())) {
				result = res;
				resultNum = num;
			}
		} else {
			result = res;
			resultNum = num;
		}
	}

}
