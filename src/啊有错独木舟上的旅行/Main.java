/**
����
����һ�ζ�ľ�۵����л����ľ�ۿ����ڸۿ��⵽������֮��û������һ����ľ�����ֻ�ܳ��������ˣ��ҳ˿͵����������ܳ�����ľ�۵���������������Ҫ����������λ�еĻ���������Ҫ�ҳ����԰��������ÿ͵����ٵĶ�ľ��������������дһ�����򣬶����ľ�۵������������ÿ���Ŀ��ÿλ�ÿ͵����������ݸ����Ĺ��򣬼���Ҫ���������ÿͱ�������ٵĶ�ľ������������������

����
��һ������s,��ʾ�������ݵ�������
ÿ�����ݵĵ�һ�а�����������w��n��80<=w<=200,1<=n<=300��wΪһ����ľ�۵���������,nΪ������
��������һ������Ϊÿ���˵����������ܴ��ڴ��ĳ���������
���
ÿ����������Ҫ�����ٶ�ľ�۵�������
��������
3
85 6
5 84 85 80 84 83
90 3
90 45 60
100 5
50 50 90 40 60
�������
5
3
3
 */
package ���д��ľ���ϵ�����;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int s = scanner.nextInt();
		while (s>=1) {
			int w = scanner.nextInt();
			int n = scanner.nextInt();
			List<Integer> arrs = new ArrayList<Integer>();
			for (int i = 0; i < n; i++) {
				arrs.add(scanner.nextInt());
			}
			Collections.sort(arrs, new Comparator<Integer>() {
				public int compare(Integer o1, Integer o2) {
					if (o2 < o1) {
						return -1;
					} else {
						return 1;
					}
				}
			});
			int num;
			int res = 0;
			while (!arrs.isEmpty()) {
				num = w - arrs.get(0);
				int q,j;
				for (j = arrs.size()-1; j > 0; j--) {
					q = num-arrs.get(j);
					if (q == 0) {
						arrs.remove(j);
					} else if (q < 0) {
						if (j+1 < arrs.size()) {
							arrs.remove(j+1);
						}
						break;
					}
				}
				if (!arrs.isEmpty()) {
					arrs.remove(0);
				}
				res++;
			}
			System.out.println(res);
			s--;
		}
	}
}
