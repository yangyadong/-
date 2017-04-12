/**
��������
����һ��N�׾���A�����A��M���ݣ�M�ǷǸ�������
���磺
����A =
����1 2
����3 4
����A��2����
����7 10
����15 22

�����ʽ
��һ����һ��������N��M��1<=N<=30, 0<=M<=5������ʾ����A�Ľ�����Ҫ�������
������N�У�ÿ��N������ֵ������10�ķǸ���������������A��ֵ

�����ʽ
�����N�У�ÿ��N����������ʾA��M��������Ӧ�ľ������ڵ���֮����һ���ո����

��������
2 2
1 2
3 4

�������
7 10
15 22
 */
package ����˷�;

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
