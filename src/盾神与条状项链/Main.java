/**
问题描述
　　有一天，盾神捡到了好多好多五颜六色的珠子！他心想这些珠子这么漂亮，可以做成一条项链然后送给他心仪的女生~于是他用其中一些珠子做成了长度为n的项链。当他准备把项链首尾相接的时候，土方进来了。
　　“哇这么恶心的项链你也做得出来！！！”
　　盾神自知审美不是他的长项，于是他很谦虚地请教土方，怎么才能把项链做得漂亮。
　　“这个嘛~首先你要在这里加上一个这种颜色的珠子，然后在这里去掉这个珠子，然后……，最后你看看是不是漂亮很多咧~”土方一下子说出了m个修改步骤。
　　盾神觉得这个用人工做太麻烦了，于是交给了你。
输入格式
　　第一行两个数，分别为n，m。
　　第二行n个数，表示盾神一开始的项链。第i个数表示第i颗珠子的颜色。
　　接下来m行，为以下形式之一：
　　ADD P Q：表示在颜色为P的珠子前面加上一个颜色为Q的珠子。
　　DEL P：表示把颜色为P的珠子去掉，如果它不在端点处，则需要把它旁边的两颗珠子连起来。例如某时刻项链状态为1 4 5 8，则执行DEL 4会变成1 5 8，执行DEL 1会变成4 5 8。
　　输入保证在每次操作之前，项链有颜色为P的珠子，且任意时刻珠子颜色互不相同。
输出格式
　　第一行为一个数len，为做完所有操作后，项链的长度。
　　第二行len个数，表示此时项链的状态。第i个数表示第i颗珠子的颜色。
样例输入
10 5
1 2 3 4 5 6 7 8 9 10
DEL 5
ADD 7 5
DEL 10
ADD 4 20
ADD 20 12
样例输出
11
1 2 3 12 20 4 6 5 7 8 9
数据规模和约定
　　表示颜色的数字不超过10^5的正数，1<=n<=10^4，1<=m<=10^4。
 */
package 盾神与条状项链;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		ArrayList<String> xList = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			xList.add(scanner.next());
		}
		String l,info,w;
		int j;
		for (int i = 0; i < m; i++) {
			l = scanner.next();
			if (l.equals("DEL")) {
				info = scanner.next();
				xList.remove(info);
			}else {
				w = scanner.next();
				info = scanner.next();
				j = xList.indexOf(w);
				xList.add(j, info);
			}
		}
		System.out.println(xList.size());
		for (int i = 0; i < xList.size(); i++) {
			System.out.print(xList.get(i)+" ");
		}
	}
}
