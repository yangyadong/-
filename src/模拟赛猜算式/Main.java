/**
��Ŀ������ʽ
��һ�����ǵ�Сѧѧϰ���ĳ˷�������̣����磺
   273
x   15
------
  1365
  273
------
  4095
����۲����µĳ˷���ʽ

    ***
x   ***
--------
    ***
   ***
  ***
--------
  *****
�ǺŴ���ĳλ���֣�ע����Щ�Ǻ��У�
0~9�е�ÿ�����ֶ�ǡ������2�Ρ�
(��������������������⣬��ο�ͼp1.jpg)
��д�����ʽ�����ռ���Ľ���������Ǹ�5λ���Ƕ��٣�
ע�⣺ֻ��Ҫ��дһ����������Ҫ��д�κζ�������ݡ�����˵�����֡�
 */
package ģ��������ʽ;

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
