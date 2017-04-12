/**
有m+n个人排队等待购票，其中有m 个人手持50元的钞票，另外n个人手持100元的钞票。求出这m+n个人排队购票，
使售票处不至出现找不开钱的局面的不同排队种数（这里正整数m，n从键盘输入）
测试数据：
15 12
4345965

20 10
15737865
 */
package 排队买票;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		System.out.println(f(m, n));
	}
	
	public static int f(int m,int n) {
		int res = 0;
		if (n == 0) {
			res = 1;
		}else if (m < n) {
			res = 0;
		}else {
			res = f(m, n-1)+f(m-1, n);
		}
		return res;
	}
	
}
