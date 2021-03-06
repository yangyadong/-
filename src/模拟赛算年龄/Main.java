/**
标题：算年龄
英国数学家德摩根出生于19世纪初叶（即18xx年）。
他年少时便很有才华。一次有人问他的年龄，他回答说：
“到了x的平方那年，我刚好是x岁”。
请你计算一下，德摩根到底出生在哪一年。
题中的年龄指的是周岁。
请填写表示他出生年份的四位数字，不要填写任何多余内容。
 */
package 模拟赛算年龄;

public class Main {
	public static void main(String[] args) {
		double age;
		for (int i = 1800; i <= 1899; i++) {
			for (int j = 40; j <= 50; j++) {
				age = Math.pow(j, 2);
				if (age - j == i) {
					System.out.println(i);
				}
			}
		}
	}
}
