package ˮ����Ŀ;

/**
 * ����
������ѧԺУ԰����һЩС�Ӻ�һЩ���������ڣ����ǰ�����ͨһ����ˮ�أ�������һ������ѧУ��ĳ���ĵ�ͼ��
�����ͼ�Ͻ���ʶ�˴˴��Ƿ���ˮ�أ����ڣ�����������ˣ����ü��������õ�ͼ�й��м���ˮ�ء�
����
��һ������һ������N����ʾ����N���������
ÿһ�����ݶ���������õ�ͼ������m(0<m<100)������n(0<n<100)��Ȼ�������������m��ÿ������n������
��ʾ�˴���ˮ����ûˮ��1��ʾ�˴���ˮ�أ�0��ʾ�˴��ǵ��棩
���
����õ�ͼ��ˮ�صĸ�����
Ҫע�⣬ÿ��ˮ�ص��Աߣ����������ĸ�λ�ã��������ˮ�صĻ��Ļ������ǿ��Կ�����ͬһ��ˮ�ء�
��������
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
�������
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
