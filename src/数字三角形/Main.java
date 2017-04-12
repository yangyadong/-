/**
问题描述
　　（图３.１－１）示出了一个数字三角形。 请编一个程序计算从顶至底的某处的一条路
　　径，使该路径所经过的数字的总和最大。
　　●每一步可沿左斜线向下或右斜线向下走；
　　●1＜三角形行数≤100；
　　●三角形中的数字为整数0，1，…99；
输入格式
　　文件中首先读到的是三角形的行数。

　　接下来描述整个三角形
输出格式
　　最大总和（整数）
样例输入
5
7
3 8
8 1 0
2 7 4 4
4 5 2 6 5
样例输出
30
 */

package 数字三角形;

import java.util.Scanner;

public class Main {
	
	static int[][] num;
	static int max=0;
	static int row;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		row = scanner.nextInt();
		num = new int[row][];
		for (int i = 0; i < row; i++) {
			num[i] = new int[i+1];
			for (int j = 0; j <= i; j++) {
				num[i][j] = scanner.nextInt();
			}
		}
		max = add(0, 0);
		System.out.println(max);
	}

	public static int add(int i,int j) {
		if (i<row) {
			int a=num[i][j]+add(i+1,j);
			int b=num[i][j]+add(i+1, j+1);
			if (a>b) {
				return a;
			}else{
				return b;
			}
		}
		return 0;
	}
}
