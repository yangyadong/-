/**
 测试数据
 3 5
 2 3
 3 5
 4 7
 结果：8
  */
package 背包01;

import java.util.Scanner;  

public class Main{    
    public static void main(String[] args){    
        Scanner sc = new Scanner(System.in);    
        int n = sc.nextInt();    
        int m = sc.nextInt();    
        int[] w=new int[n];    
        int[] v=new int[n];    
        int[] dp=new int[m+1];    
        for(int i=0;i<n;i++){
            w[i]=sc.nextInt();    
            v[i]=sc.nextInt();
        }    
        for(int i=0;i<n;i++){
            for(int j=m;j>=w[i];j--){
                dp[j]=Math.max(dp[j], dp[j-w[i]]+v[i]);
            }
            for (int j = 0; j < dp.length; j++) {
				System.out.printf("%4d",dp[j]);
			}
			System.out.println();
        }    
        System.out.println(dp[m]);
    }    
}    