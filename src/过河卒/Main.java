/**
A 点有一个过河卒，需要走到目标 B 点。卒行走规则：可以向下、或者向右。同时在棋盘上的任一点有一个对方的马（如上图的C点），
该马所在的点和所有跳跃一步可达的点称为对方马的控制点。例如上图 C 点上的马可以控制 9 个点（图中的P1，P2 … P8 和 C）。卒不能通过对方马的控制点。
　　棋盘用坐标表示，A 点（0，0）、B 点（n,m）(n,m 为不超过 20 的整数，并由键盘输入)，
同样马的位置坐标是需要给出的（约定: C不等于A，同时C不等于B）。现在要求你计算出卒从 A 点能够到达 B 点的路径的条数。
1<=n,m<=15
输入描述 Input Description
　键盘输入
　　　B点的坐标（n,m）以及对方马的坐标（X,Y）{不用判错}

输出描述 Output Description
　　屏幕输出
　　　　一个整数（路径的条数）。

样例输入 Sample Input
　6 6 3 2

样例输出 Sample Output
17
 */
package 过河卒;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n,m,x,y;
		n = scanner.nextInt();
		m = scanner.nextInt();
		x = scanner.nextInt();
		y = scanner.nextInt();
		int[][] num = new int[n+1][m+1];
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= m; j++) {
				num[i][j] = 1;
			}
		}
		num[x][y] = 0;
		if(x-2>=0){
			if (y-1>=0) {
				num[x-2][y-1] = 0;
			}
			if (y+1<m) {
				num[x-2][y+1] = 0;
			}
		} 
		if(x-1>=0){
			if (y-2>=0) {
				num[x-1][y-2] = 0;
			}
			if (y+2<m) {
				num[x-1][y+2] = 0;
			}
		}


		if(x+2<n){
			if (y-1>=0) {
				num[x+2][y-1] = 0;
			}
			if (y+1<m) {
				num[x+2][y+1] = 0;
			}
		} 
		if(x+1<n){
			if (y-2>=0) {
				num[x+1][y-2] = 0;
			}
			if (y+2<m) {
				num[x+1][y+2] = 0;
			}
		}
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= m; j++) {
				if (num[i][j]==0 || (i==0 && j==0)) {
					continue;
				}else if (i==0) {
					num[i][j] = num[i][j-1];
				}else if (j==0) {
					num[i][j] = num[i-1][j];
				}else {
					num[i][j] = num[i-1][j]+num[i][j-1];
				}
			}
		}
		System.out.println(num[n][m]);
	}
	
}
