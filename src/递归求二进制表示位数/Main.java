/**
��������
��������һ��ʮ�����������������Ӧ�Ķ���������λ�������磬����ʮ������9�����Ӧ�Ķ���������1001�����λ����4��
��������
һ��������ĿҪ������뷶����
9
�������
4
����������������Ӧ�������

���ݹ�ģ��Լ��
��������������ÿһ�����ķ�Χ��
��������������int��ʾ��Χ�ڡ�

 */
package �ݹ�������Ʊ�ʾλ��;

import java.util.Scanner;

public class Main {
	static int res = 0;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		check(n);
		System.out.print(res);
	}
	public static void check(int n) {
		res++;
		if(n/2!=0){
			check(n/2);
		}
	}
}
