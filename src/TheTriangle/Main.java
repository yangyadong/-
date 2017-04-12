/**
描述
7
3 8
8 1 0
2 7 4 4
4 5 2 6 5
(Figure 1)
Figure 1 shows a number triangle. Write a program that calculates the highest sum of numbers passed on a route that starts at the top and ends somewhere on the base. Each step can go either diagonally down to the left or diagonally down to the right.

输入
Your program is to read from standard input. The first line contains one integer N: the number of rows in the triangle. The following N lines describe the data of the triangle. The number of rows in the triangle is > 1 but <= 100. The numbers in the triangle, all integers, are between 0 and 99.
输出
Your program is to write to standard output. The highest sum is written as an integer.
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
package TheTriangle;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[][] num = new int[n][];
		for (int i = 0; i < n; i++) {
			num[i] = new int[i+1];
			for (int j = 0; j <= i; j++) {
				num[i][j] = scanner.nextInt();
			}
		}
		for (int i = n-2; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				num[i][j] += num[i+1][j]>num[i+1][j+1]?num[i+1][j]:num[i+1][j+1];
			}
		}
		System.out.println(num[0][0]);
	}
}
