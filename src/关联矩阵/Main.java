/**
问题描述
　　有一个n个结点m条边的有向图，请输出他的关联矩阵。
输入格式
　　第一行两个整数n、m，表示图中结点和边的数目。n<=100,m<=1000。
　　接下来m行，每行两个整数a、b，表示图中有(a,b)边。
　　注意图中可能含有重边，但不会有自环。
输出格式
　　输出该图的关联矩阵，注意请勿改变边和结点的顺序。
样例输入
5 9
1 2
3 1
1 5
2 5
2 3
2 3
3 2
4 3
5 4
样例输出
1 -1 1 0 0 0 0 0 0
-1 0 0 1 1 1 -1 0 0
0 1 0 0 -1 -1 1 -1 0
0 0 0 0 0 0 0 1 -1
0 0 -1 -1 0 0 0 0 1
 */
package 关联矩阵;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[][] num = new int[n][m];
		int k = 0, t = 0;
		for (int i = 0; i < m; i++) {
			k = scanner.nextInt();
			t = scanner.nextInt();
			num[k - 1][i] = 1;
			num[t - 1][i] = -1;
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m - 1; j++) {
				System.out.print(num[i][j] + " ");
			}
			System.out.println(num[i][m - 1]);
		}
	}
}
