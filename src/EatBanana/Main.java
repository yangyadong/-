/**
描述
A group of researchers are designing an experiment to test the IQ of a monkey. They will hang a banana at the roof of a building, and at the mean time, provide the monkey with some blocks. If the monkey is clever enough, it shall be able to reach the banana by placing one block on the top another to build a tower and climb up to get its favorite food.

The researchers have n types of blocks, and an unlimited supply of blocks of each type. Each type-i block was a rectangular solid with linear dimensions (xi, yi, zi). A block could be reoriented so that any two of its three dimensions determined the dimensions of the base and the other dimension was the height. 

They want to make sure that the tallest tower possible by stacking blocks can reach the roof. The problem is that, in building a tower, one block could only be placed on top of another block as long as the two base dimensions of the upper block were both strictly smaller than the corresponding base dimensions of the lower block because there has to be some space for the monkey to step on. This meant, for example, that blocks oriented to have equal-sized bases couldn't be stacked. 

Your job is to write a program that determines the height of the tallest tower the monkey can build with a given set of blocks.
输入
The input file will contain one or more test cases. The first line of each test case contains an integer n,
representing the number of different blocks in the following data set. The maximum value for n is 30.
Each of the next n lines contains three integers representing the values xi, yi and zi.
Input is terminated by a value of zero (0) for n.
输出
For each test case, print one line containing the case number (they are numbered sequentially starting from 1) and the height of the tallest possible tower in the format "Case case: maximum height = height".
样例输入
1
10 20 30
2
6 8 10
5 5 5
7
1 1 1
2 2 2
3 3 3
4 4 4
5 5 5
6 6 6
7 7 7
5
31 41 59
26 53 58
97 93 23
84 62 64
33 83 27
0
样例输出
Case 1: maximum height = 40
Case 2: maximum height = 21
Case 3: maximum height = 28
Case 4: maximum height = 342
 */
package EatBanana;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int n, x, y, z, m;
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		int d = 1;
		while (n != 0) {
			int[][] num = new int[6 * n][3];
			for (int i = 0; i < n; i++) {
				m = 6 * i;
				x = scanner.nextInt();
				y = scanner.nextInt();
				z = scanner.nextInt();
				{
					num[m + 0][0] = x;
					num[m + 0][1] = y;
					num[m + 0][2] = z;
				}
				{
					num[m + 1][0] = x;
					num[m + 1][1] = z;
					num[m + 1][2] = y;
				}
				{
					num[m + 2][0] = y;
					num[m + 2][1] = x;
					num[m + 2][2] = z;
				}
				{
					num[m + 3][0] = y;
					num[m + 3][1] = z;
					num[m + 3][2] = x;
				}
				{
					num[m + 4][0] = z;
					num[m + 4][1] = y;
					num[m + 4][2] = x;
				}
				{
					num[m + 5][0] = z;
					num[m + 5][1] = x;
					num[m + 5][2] = y;
				}
			}
			Arrays.sort(num, new MyComprator()); // 使用指定的排序器，进行排序
//			for (int i = 0; i < num.length; i++) {
//				System.out.println(num[i][0] + " " + num[i][1] + " " + num[i][2]);
//			}
			int sum = 0;
			int maxn = 0;
			int[] dp = new int[num.length];
			for (int i = 0; i < num.length; i++) {
				dp[i] = num[i][2];
				for (int j = i; j >= 0; j--) {
					if (num[j][0] > num[i][0] && num[j][1] > num[i][1]) {
						dp[i] = Math.max(dp[i], dp[j] + num[i][2]);
					}
				}
				if (dp[i] > maxn) {
					maxn = dp[i];
				}
			}
			System.out.println("Case "+d+": maximum height = "+maxn);
			d++;
			n = scanner.nextInt();
		}
	}

	// 比较器，x坐标从大到小排序；x相同时，按照y从大到小排序
	static class MyComprator implements Comparator {
		public int compare(Object o1, Object o2) {
			// TODO Auto-generated method stub
			int[] arg0 = (int[]) o1;
			int[] arg1 = (int[]) o2;
			if (arg0[0] != arg1[0])
				return arg0[0] < arg1[0] ? 1 : -1;
			else
				return arg0[1] < arg1[1] ? 1 : -1;
		}
	}
}
