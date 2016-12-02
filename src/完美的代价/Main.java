package 完美的代价;

import java.util.Scanner;

public class Main {

	static char test;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		char[] c = scanner.next().toCharArray();
		int sum = 0;
		if(!check(c)){
			System.out.println("Impossible");
		}else{
			for (int i = 0; i < n/2; i++) {
				if(c[i]!=test){
					int j;
					for (j= n-i-1; j > i; j--) {
						if(c[i]==c[j]){
							break;
						}
					}
					sum = sum +(n-i-1-j);
					for (int m = j; m < n-i-1; m++) {
						c[m]=c[m+1];
					}
					c[n-i-1]=c[i];
				}else{
					int j;
					for (j= i; j < n-i-1; j++) {
						if(c[n-i-1]==c[j]){
							break;
						}
					}
					sum = sum +(j-i);
					for (int m = j; m > i; m--) {
						c[m]=c[m-1];
					}
					c[i]=c[n-i-1];
				}
			}
			System.out.println(sum);
		}
	}
	
	public static boolean check(char[] c) {
		int[] num = new int[26];
		for (int i = 0; i < c.length; i++) {
			num[c[i]-'a']++;
		}
		int a=0;//字母个数为奇数个数
		for (int i = 0; i < num.length; i++) {
			if(num[i]%2!=0){
				a++;
			}
			if(a>1){
				return false;
			}
			test=(char) ('a'+i);
		}
		return true;
	}
}
