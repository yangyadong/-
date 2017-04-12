/**
问题描述
给定一个N阶矩阵A，输出A的M次幂（M是非负整数）
例如：
　　A =
　　1 2
　　3 4
　　A的2次幂
　　7 10
　　15 22

输入格式
第一行是一个正整数N、M（1<=N<=30, 0<=M<=5），表示矩阵A的阶数和要求的幂数
接下来N行，每行N个绝对值不超过10的非负整数，描述矩阵A的值

输出格式
输出共N行，每行N个整数，表示A的M次幂所对应的矩阵。相邻的数之间用一个空格隔开

样例输入
2 2
1 2
3 4

样例输出
7 10
15 22
 */
package 矩阵乘法;

import java.util.Scanner;

public class Main {

	static int[][] res;
	static int[][] num;
	static int A;
	static int M;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		A = scanner.nextInt();
		M = scanner.nextInt();
		num = new int[A][A];
		res = new int[A][A];
		for (int i = 0; i < A; i++) {
			for (int j = 0; j < A; j++) {
				res[i][j]=num[i][j]=scanner.nextInt();
			}
		}
		if(M==0){
			for (int i = 0; i < A; i++) {
				for (int j = 0; j < A; j++) {
					if(i==j){
						System.out.print(1+" ");
					}else{
						System.out.print(0+" ");
					}
				}
				System.out.println();
			}
		}else {
			if(M!=1){
				cheng(2);
			}
			for (int i = 0; i < A; i++) {
				for (int j = 0; j < A; j++) {
					System.out.print(res[i][j]+" ");
				}
				System.out.println();
			}
		}
	}

	public static void cheng(int m) {
		if(m>M){
			return;
		}else{
			for (int i = 0; i < A; i++) {
				int[] san = new int[A];
				for (int l = 0; l < A; l++) {
					int add=0;
					for (int j = 0; j < A; j++) {
						add+=res[i][j]*num[j][l];
					}
					san[l] = add;
				}
				res[i]=san;
			}
		}
		cheng(m+1);
	}
	
}
