/**
问题描述
　　摩尔斯电码破译。类似于乔林教材第213页的例6.5，要求输入摩尔斯码，返回英文。请不要使用"zylib.h"，只能使用标准库函数。用' * '表示' . '，中间空格用' | '表示，只转化字符表。

　　摩尔斯码定义见：http://baike.baidu.com/view/84585.htm?fromId=253988。


提示
　　清橙进行评测时，输入是以EOF结尾的，而不是换行符。（EOF不是一个字符，“以EOF结尾”是一种通俗但不严谨的说法。）因此可以通过以下方式之一获取输入：

　　1. 一次读入整行字符串，再进行后续解析。

　　2. 使用getchar或scanf一次读入一个字符，通过它们的返回值判断输入结束。
样例输出

 */
package 摩尔斯电码;

import java.util.Scanner;

public class Main {
	private static String[][] strings = {
			{"*-","a"},{"-***","b"},{"-*-*","c"},{"-**","d"},{"*","e"},{"**-*","f"},{"--*","g"},
			{"****","h"},{"**","i"},{"*---","j"},{"-*-","k"},{"*-**","l"},{"--","m"},{"-*","n"},
			{"---","o"},{"*--*","p"},{"--*-","q"},{"*-*","r"},{"***","s"},{"-","t"},{"**-","u"},
			{"***-","v"},{"*--","w"},{"-**-","x"},{"-*--","y"},{"--**","z"},
	};
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		String[] res = string.split("\\|");
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < strings.length; j++) {
				if (res[i].equals(strings[j][0])) {
					System.out.print(strings[j][1]);
					break;
				}
			}
		}
	}
}
