/**
题目：猜算式
你一定还记得小学学习过的乘法计算过程，比如：
   273
x   15
------
  1365
  273
------
  4095
请你观察如下的乘法算式

    ***
x   ***
--------
    ***
   ***
  ***
--------
  *****
星号代表某位数字，注意这些星号中，
0~9中的每个数字都恰好用了2次。
(如因字体而产生对齐问题，请参看图p1.jpg)
请写出这个式子最终计算的结果，就是那个5位数是多少？
注意：只需要填写一个整数，不要填写任何多余的内容。比如说明文字。
 */
package 模拟赛猜算式;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		char[] num1 = new char[3];
		char[] num2 = new char[3];
		char[] num3 = new char[3];
		char[] num4 = new char[3];
		char[] num5 = new char[3];
		char[] num6 = new char[5];
		int a, b, c, d;
		for (int i = 100; i < 999; i++) {
			for (int j = 100; j < 999; j++) {
				a = j % 10;
				b = ((j - a) / 10) % 10;
				c = j / 100;
				d = i * j;
				if (i * a > 999 || i * b > 999 || i * c > 999) {
					continue;
				}
				if (i * a < 100 || i * b < 100 || i * c < 100) {
					continue;
				}
				if (d > 99999 || d < 10000) {
					continue;
				}
				num1 = String.valueOf(i).toCharArray();
				num2 = String.valueOf(j).toCharArray();
				num3 = String.valueOf(i * a).toCharArray();
				num4 = String.valueOf(i * b).toCharArray();
				num5 = String.valueOf(i * c).toCharArray();
				num6 = String.valueOf(i * j).toCharArray();
				int[] num = new int[10];
				num = sum(num, num1);
				num = sum(num, num2);
				num = sum(num, num3);
				num = sum(num, num4);
				num = sum(num, num5);
				num = sum(num, num6);
				for (int k = 0; k < num.length; k++) {
					// System.out.println(Arrays.toString(num));
					if (num[k] != 2) {
						break;
					} else if (k == num.length - 1) {
						System.out.println(Arrays.toString(num1));
						System.out.println(Arrays.toString(num2));
						System.out.println(Arrays.toString(num3));
						System.out.println(Arrays.toString(num4));
						System.out.println(Arrays.toString(num5));
						System.out.println(Arrays.toString(num6));
						System.out.println(Arrays.toString(num));
					}
				}
			}
		}
	}
	
	public static int[] sum(int[] num,char[] num1) {
		for (int k = 0; k < num1.length; k++) {
			int index = num1[k] - 48;
			num[index]++;
		}
		return num;
	}
	
}
