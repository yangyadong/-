/**
��������
������֪n��m����ӡn^1��n^2��...��n^m��Ҫ���þ�̬����ʵ�֡�n^m��ʾn��m�η�����֪n��m����ӡn^1��n^2��...��n^m��Ҫ���þ�̬����ʵ�֡�n^m��ʾn��m�η�����ÿ����ʾ5������ÿ������Ϊ12���Ҷ��룩
��������
һ��������ĿҪ������뷶����
����
3 8
�������
����������������Ӧ�������
����
           3           9          27          81         243
         729        2187        6561
���ݹ�ģ��Լ��
��������������ÿһ�����ķ�Χ��
��������n^mС��int �ı�ʾ��Χ��
 */
package ��ָ��;

import java.util.Scanner;

public class Main {
	static int res;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		for (int i = 1; i <= m; i++) {
			res = (int)Math.pow(n, i);
			System.out.format("%12d", res);
			if (i%5==0) {
				System.out.println();
			}
		}
		
	}
}
