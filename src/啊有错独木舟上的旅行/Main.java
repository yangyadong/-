/**
描述
进行一次独木舟的旅行活动，独木舟可以在港口租到，并且之间没有区别。一条独木舟最多只能乘坐两个人，且乘客的总重量不能超过独木舟的最大承载量。我们要尽量减少这次活动中的花销，所以要找出可以安置所有旅客的最少的独木舟条数。现在请写一个程序，读入独木舟的最大承载量、旅客数目和每位旅客的重量。根据给出的规则，计算要安置所有旅客必须的最少的独木舟条数，并输出结果。

输入
第一行输入s,表示测试数据的组数；
每组数据的第一行包括两个整数w，n，80<=w<=200,1<=n<=300，w为一条独木舟的最大承载量,n为人数；
接下来的一组数据为每个人的重量（不能大于船的承载量）；
输出
每组人数所需要的最少独木舟的条数。
样例输入
3
85 6
5 84 85 80 84 83
90 3
90 45 60
100 5
50 50 90 40 60
样例输出
5
3
3
 */
package 啊有错独木舟上的旅行;

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
