/**
��������
�������ڸ�����������a[],Ѱ���������ֵ���������±ꡣ
�����ʽ
������������a[],����Ԫ�ظ���С��1����100��������ݷ������У���һ��ֻ��һ��������ʾ����Ԫ�ظ������ڶ���Ϊ����ĸ���Ԫ�ء�
�����ʽ
����������ֵ�������±�
��������
	3
	3 2 1
�������
	3 0
 */
package Ѱ�����������ֵ;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int max = scanner.nextInt();
		int label = 0;
		int num;
		for (int i = 1; i < n; i++) {
			num = scanner.nextInt();
			if (num>max) {
				max = num;
				label = i;
			}
		}
		System.out.println(max+" "+label);
	}
}
