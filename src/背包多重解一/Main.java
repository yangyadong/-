/**
4 20
9 3 3
9 5 1
4 9 2
1 8 3
******
47


3 8
1 6 10
2 10 5
2 20 2
********
64
 */
package �������ؽ�һ;

import java.util.Scanner;

import javax.lang.model.element.VariableElement;

public class Main {
	static int n,m;
	static int[] w,v,num;
	static int[][] dp;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		m = scanner.nextInt();
		w = new int[n+1];
		v = new int[n+1];
		num = new int[n+1];
		dp = new int[n+1][m+1];
		for (int i = 1; i <= n; i++) {
			w[i] = scanner.nextInt();
			v[i] = scanner.nextInt();
			num[i] = scanner.nextInt();
		}
		int nCount = 0;  
		for (int i = 1; i <= n; i++) {
			for (int j = w[i]; j <= m; j++) {
				nCount = Math.min(num[i],j/w[i]);//�ǵ�ǰ��������v�������Ǳ�����������  
				for (int k = 0;k <= nCount;k++) {
	                dp[i][j] = Math.max(dp[i][j],dp[i - 1][j - k * w[i]] + k * v[i]);
	            }
			}
//			for (int j = 1; j <= n; j++) {
//				for (int j2 = 0; j2 <= m; j2++) {
//					System.out.printf("%4d",dp[j][j2]);
//				}
//				System.out.println();
//			}
		}
		System.out.println(dp[n][m]);
	}
}
