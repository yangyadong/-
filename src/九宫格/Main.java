/**
问题描述
　　九宫格。输入1-9这9个数字的一种任意排序，构成3*3二维数组。如果每行、每列以及对角线之和都相等，打印1。否则打印0。
样例输出
与上面的样例输入对应的输出。
例：
4 9 2
3 5 7
8 1 6
结果：1
数据规模和约定
输入1-9这9个数字的一种任意排序。
 */
package 九宫格;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] num = new int[4][4];
		for (int i = 0; i < 3; i++) {
			int res = 0;
			for (int j = 0; j < 3; j++) {
				num[i][j] = scanner.nextInt();
				res += num[i][j];
			}
			num[i][3] = res;
		}
		num[3][0] = num[0][0]+num[1][0]+num[2][0];
		num[3][1] = num[0][1]+num[1][1]+num[2][1];
		num[3][2] = num[0][2]+num[1][2]+num[2][2];
		num[3][3] = num[0][0]+num[1][1]+num[2][2];
		int m = num[0][2]+num[1][1]+num[2][0];
		if (num[0][3]==num[1][3]&&num[0][3]==num[2][3]&&num[0][3]==num[3][0]&&num[3][0]==num[3][1]&&num[3][0]==num[3][2]&&num[3][0]==num[3][3]&&num[3][0]==m) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}
}
