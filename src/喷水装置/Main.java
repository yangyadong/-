/**
����
����һ���ƺ����Ϊ20�ף���Ϊ2�ף�Ҫ�ں��������Ϸ��ð뾶ΪRi����ˮװ�ã�ÿ����ˮװ�õ�Ч������������Ϊ���ĵİ뾶Ϊʵ��Ri(0<Ri<15)��Բ��ʪ�����г������ˮװ��i��1<i<600)��������һ���ܰѲ�ƺȫ��ʪ����Ҫ�����ǣ�ѡ�����ٵ���ˮװ�ã���������ƺ��ȫ��ʪ��
����
��һ��m��ʾ��m���������
ÿһ��������ݵĵ�һ����һ��������n��n��ʾ����n����ˮװ�ã�����һ�У���n��ʵ��ri��ri��ʾ����ˮװ���ܸ��ǵ�Բ�İ뾶��
���
�������װ�õĸ���
��������
2
5
2 3.2 4 4.5 6 
10
1 2 3 1 2 1.2 3 1.1 1 2
�������
2
5
 */
package ��ˮװ��;

import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner cin = new Scanner(System.in);
		int count, a;

		count = cin.nextInt();
		double len = 20/2;

		while (count > 0) {
			a = cin.nextInt();
			List<Double> arrs = new ArrayList<Double>();
			double sum = 0;
			for (int i = 0; i < a; i++) {
				arrs.add(cin.nextDouble());
			}
			Collections.sort(arrs, new Comparator<Double>() {
				public int compare(Double o1, Double o2) {
					if (o2 > o1) {
						return 1;
					} else {
						return -1;
					}
				}
			});

			int j = 0;
			for (j = 0; j < arrs.size(); ++j) {
				double val = arrs.get(j);
				if (val <= 1.0) {
					// �Ѿ�Ҫʹ��1��
					break;
				}
				sum += Math.sqrt(Math.pow(val, 2)-1);
				if (sum >= len) {
					break;
				}
			}
			System.out.println(j + 1);

			count--;
		}
		cin.close();

	}
}
