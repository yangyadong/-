package 水池数目;

/**
 * 描述
南阳理工学院校园里有一些小河和一些湖泊，现在，我们把它们通一看成水池，假设有一张我们学校的某处的地图，
这个地图上仅标识了此处是否是水池，现在，你的任务来了，请用计算机算出该地图中共有几个水池。
输入
第一行输入一个整数N，表示共有N组测试数据
每一组数据都是先输入该地图的行数m(0<m<100)与列数n(0<n<100)，然后，输入接下来的m行每行输入n个数，
表示此处有水还是没水（1表示此处是水池，0表示此处是地面）
输出
输出该地图中水池的个数。
要注意，每个水池的旁边（上下左右四个位置）如果还是水池的话的话，它们可以看做是同一个水池。
样例输入
2
3 4
1 0 0 0 
0 0 1 1
1 1 1 0
5 5
1 1 1 1 0
0 0 1 0 1
0 0 0 0 0
1 1 1 0 0
0 0 1 1 1
样例输出
2
3
 */

import java.util.Scanner;

public class Main {

	static int[][][] num;
	static int a;
	static int b;
	static int[] res;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		res = new int[n];
		for (int i = 0; i < n; i++) {
			a = scanner.nextInt();
			b = scanner.nextInt();
			num = new int[a][b][2];
			for (int j = 0; j < a; j++) {
				for (int j2 = 0; j2 < b; j2++) {
					num[j][j2][0] = scanner.nextInt();
					num[j][j2][1] = 0;
				}
			}
			check(i);
		}
		for (int i = 0; i < n; i++) {
			System.out.println(res[i]);
		}
	}
	
	public static void check(int i) {
		int k = 0;
		for (int j = 0; j < a; j++) {
			for (int j2 = 0; j2 < b; j2++) {
				if(num[j][j2][0]==1&&num[j][j2][1]==0){
					save(j, j2);
					k++;
				}
			}
		}
		res[i]=k;
	}
	
	public static void save(int i,int j) {
		if(i<0||j<0||i>=a||j>=b){
			return;
		}
		if(num[i][j][0]==1&&num[i][j][1]==0){
			num[i][j][1]=1;
			save(i-1, j);
			save(i+1, j);
			save(i, j-1);
			save(i, j+1);
		}
	}

}
