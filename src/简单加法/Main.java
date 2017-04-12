/**
问题描述
　　小于10的自然数中有四个数字能除尽3或5（3， 5， 6， 9），它们的和为23。
　　请计算所有小于1000的自然数中能除尽3或5的数字的合。然后使用标准输出cout，输出你的结果。
输入格式
　　无。
输出格式
　　一行一个整数，表示你的结果。
 */
package 简单加法;

public class Main {
	public static void main(String[] args) {
		int res = 0;
		for (int i = 0; i < 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				res += i;
			}
		}
		System.out.println(res);
	}
}
