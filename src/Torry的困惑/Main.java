/**
��������
����Torry��Сϲ����ѧ��һ�죬��ʦ����������2��3��5��7����������������������TorryͻȻ�뵽һ�����⣬ǰ10��100��1000��10000�����������ĳ˻��Ƕ����أ�����������������ʦ����ʦ�ס�ˣ�һʱ�ش𲻳���������Torry�����ڻ��̵��㣬�������ǰn�������ĳ˻������������ǵ���ŽӴ���̲��ã�TorryֻҪ����������ģ��50000��ֵ��
�����ʽ
����������һ��������n������n<=100000��
�����ʽ
�������һ�У���ǰn�������ĳ˻�ģ50000��ֵ��
��������
	1
�������
	2
 */
package Torry������;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] res = new int[n+2];
		res[0] = 2;
		res[1] = 3;
		res[2] = 5;
		int i = 3;
		int num = 7;
		double num1;
		while (i < n) {
			num1 = num/2;
			for (int j = 2; j < num1; j++) {
				if (num%j==0) {
					break;
				}else if (j==num1-1) {
					res[i] = num;
					i++;
				}
			}
			num++;
		}
		int res1 = 1;
		for (int j = 0; j < n; j++) {
			res1=(res1*res[j])%50000;
		}
		System.out.println(res1);
	}
}
