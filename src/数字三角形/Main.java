/**
��������
������ͼ��.��������ʾ����һ�����������Ρ� ���һ���������Ӷ����׵�ĳ����һ��·
��������ʹ��·�������������ֵ��ܺ����
������ÿһ��������б�����»���б�������ߣ�
������1��������������100��
�������������е�����Ϊ����0��1����99��
�����ʽ
�����ļ������ȶ������������ε�������

������������������������
�����ʽ
��������ܺͣ�������
��������
5
7
3 8
8 1 0
2 7 4 4
4 5 2 6 5
�������
30
 */

package ����������;

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
