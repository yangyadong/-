/**
��������
����һ�����У�ÿ��ѯ�������е�l��������r�����е�K��������ĸ���

�����ʽ
��һ�а���һ����n����ʾ���г��ȡ�

�ڶ��а���n������������ʾ���������С�

����������һ��������m����ʾѯ�ʸ�����

������m�У�ÿ��������l,r,K����ʾѯ�����д������ҵ�l��������r�����У��Ӵ���С��K��������ĸ�������Ԫ�ش�1��ʼ��š�

�����ʽ
�ܹ����m�У�ÿ��һ��������ʾѯ�ʵĴ𰸡�
��������
5
1 2 3 4 5
2
1 5 2
2 3 2
�������
4
2
���ݹ�ģ��Լ��
����30%�����ݣ�n,m<=100��

����100%�����ݣ�n,m<=1000��

��֤k<=(r-l+1)�������е���<=106��
 */
package ����k������ѯ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] num = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = scanner.nextInt();
		}
		int m = scanner.nextInt();
		List<Integer> res;
		int l, r, k;
		for (int i = 0; i < m; i++) {
			l = scanner.nextInt();
			r = scanner.nextInt();
			k = scanner.nextInt();
			res = new ArrayList<Integer>();
			for (int j = l - 1; j < r; j++) {
				res.add(num[j]);
			}

			Collections.sort(res, new Comparator<Integer>() {
				public int compare(Integer o1, Integer o2) {
					if (o2 < o1) {
						return -1;
					} else {
						return 1;
					}
				}
			});
			
			System.out.println(res.get(k - 1));
		}
	}
}
