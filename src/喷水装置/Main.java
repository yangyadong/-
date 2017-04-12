/**
描述
现有一块草坪，长为20米，宽为2米，要在横中心线上放置半径为Ri的喷水装置，每个喷水装置的效果都会让以它为中心的半径为实数Ri(0<Ri<15)的圆被湿润，这有充足的喷水装置i（1<i<600)个，并且一定能把草坪全部湿润，你要做的是：选择尽量少的喷水装置，把整个草坪的全部湿润。
输入
第一行m表示有m组测试数据
每一组测试数据的第一行有一个整数数n，n表示共有n个喷水装置，随后的一行，有n个实数ri，ri表示该喷水装置能覆盖的圆的半径。
输出
输出所用装置的个数
样例输入
2
5
2 3.2 4 4.5 6 
10
1 2 3 1 2 1.2 3 1.1 1 2
样例输出
2
5
 */
package 喷水装置;

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
					// 已经要使用1了
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
