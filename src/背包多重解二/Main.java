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
package 背包多重解二;

import java.util.Scanner;

import javax.lang.model.element.VariableElement;

public class Main {
	static int n,m;
	static int[] w,v,num;
	static int[] dp;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		m = scanner.nextInt();
		w = new int[n];
		v = new int[n];
		num = new int[n];
		dp = new int[m+1];
		for (int i = 0; i < n; i++) {
			w[i] = scanner.nextInt();
			v[i] = scanner.nextInt();
			num[i] = scanner.nextInt();
		}
		int k = 1;  
	    int nCount = 0;  
	    for (int i = 0;i < n;i++) {  
	        if (w[i] * num[i] >= m) {  
	            //完全背包:该类物品原则上是无限供应，  
	            //此时满足条件w[i] * num[i] >= m时，  
	            //表示无限量供应，直到背包放不下为止.  
	            CompletePack(w[i],v[i]);  
	        } else {  
	            k = 1;  
	            nCount = num[i];  
	            while(k <= nCount) {
	            	System.out.println(k);
	                ZeroOnePack(k * w[i],k * v[i]); 
	                nCount -= k;
	                k *= 2;
	            }
	            ZeroOnePack(nCount * w[i],nCount * v[i]);
	        }  
//	        for (int j = 0; j <= m; j++) {
//				System.out.printf("%4d",dp[m]);
//			}
//			System.out.println();
	    }  
		System.out.println(dp[m]);
	}
	public static void CompletePack(int nWeight,int nValue) {  
	    for (int v = nWeight;v <= m;v++) {  
	        dp[v] = Math.max(dp[v],dp[v - nWeight] + nValue);  
	    }
	} 
	public static void ZeroOnePack(int nWeight,int nValue)  {  
	    for (int v = m;v >= nWeight;v--) {  
	        dp[v] = Math.max(dp[v],dp[v - nWeight] + nValue);  
	    }
	    for (int j = 0; j <= m; j++) {
			System.out.printf("%4d",dp[m]);
		}
		System.out.println();
	}  
}
