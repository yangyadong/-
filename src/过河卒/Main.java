/**
A ����һ�������䣬��Ҫ�ߵ�Ŀ�� B �㡣�����߹��򣺿������¡��������ҡ�ͬʱ�������ϵ���һ����һ���Է���������ͼ��C�㣩��
�������ڵĵ��������Ծһ���ɴ�ĵ��Ϊ�Է���Ŀ��Ƶ㡣������ͼ C ���ϵ�����Կ��� 9 ���㣨ͼ�е�P1��P2 �� P8 �� C�����䲻��ͨ���Է���Ŀ��Ƶ㡣
���������������ʾ��A �㣨0��0����B �㣨n,m��(n,m Ϊ������ 20 �����������ɼ�������)��
ͬ�����λ����������Ҫ�����ģ�Լ��: C������A��ͬʱC������B��������Ҫ����������� A ���ܹ����� B ���·����������
1<=n,m<=15
�������� Input Description
����������
������B������꣨n,m���Լ��Է�������꣨X,Y��{�����д�}

������� Output Description
������Ļ���
��������һ��������·������������

�������� Sample Input
��6 6 3 2

������� Sample Output
17
 */
package ������;

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
