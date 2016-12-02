package SineÖ®Îè;

import java.util.Scanner;

public class Main {
	
	static String[] A;
	static int n;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int l = n = scanner.nextInt();
		A = new String[n];
		String res="";
		for (int j = 1; j <= n; j++) {
			run_s(j-1,j,String.valueOf(j));
			if(j==n){
				res = res+A[j-1]+"+"+l;
			}else{
				res = "("+res+A[j-1]+"+"+l+")";
			}
			l--;
		}
		System.out.println(res);
	}
	
	public static void run_s(int k,int i,String re_s) {
		String s;
		if(i!=1){
			String a;
			if((i-1)%2==0){
				a="+";
			}else{
				a="-";
			}
			s = (i-1)+a+"sin("+re_s+")";
			run_s(k,i-1,s);
		}else{
			s = "sin("+re_s+")";
			A[k] = s;
		}
	}

}
