package ÊıµÄ¶Á·¨;

import java.util.Scanner;

public class Main {

	static String res="";
	static String[] y = {"ge","shi","bai","qian","wan","yi"};
	static String[] num = {"ling","yi","er","san","si","wu","liu","qi","ba","jiu"};
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = n;
		int m=0;
		while (n!=0) {
			String string;
			string=check(k,n%10000);
			if(m==1){
				res = string+" "+y[4]+" "+res;
			}else if (m==2) {
				res = string+" "+y[5]+" "+res;
			}else{
				res = string+res;
			}
			n = n/10000;
			m++;
		}
		System.err.println(res);
	}
	
	public static String check(int k,int n) {
		if(n==0){
			return "";
		}
		String m="";
		boolean ling=false;
		boolean qian=false;
		boolean bai =false;
		if(n%1000==0){
			return m+num[n/1000]+" "+y[3]+" ";
		}
		if(n%100==0&&n<1000){
			if(k>n){
				return m+num[0]+" "+num[n/100]+" "+y[2]+" ";
			}
			return m+num[n/100]+" "+y[2]+" ";
		}
		if(n%10==0&&n<100){
			if(k>n){
				return m+num[0]+" "+num[n/10]+" "+y[1]+" ";
			}
			return m+num[n/10]+" "+y[1]+" ";
		}
		if(n<10&&n>1){
			if(k>n){
				return m+num[0]+" "+num[n];
			}
		}
		if(n%1000==0){
			return m+num[n/1000]+" "+y[3]+" ";
		}else	if(n/1000!=0){
			m += num[n/1000]+" "+y[3]+" ";
			n=n%1000;
			qian=true;
		}
		if (n%100==0) {
			return m+num[n/100]+" "+y[2]+" ";
		}else	if(n/100!=0){
			m += num[n/100]+" "+y[2]+" ";
			n=n%100;
			bai=true;
		}else{
			if(qian){
				ling = true;
			}
		}
		if (n%10==0) {
			return m+num[n/10]+" "+y[1]+" ";
		}else	if(n/10!=0){
			if (ling) {
				m += num[0]+" ";
			}
			if(bai||qian){
				m += num[n/10]+" "+y[1]+" ";
			}else{
				if(n/10==1){
					m += y[1]+" ";
				}else{
					if(k>n){
						m += num[0]+" "+num[n/10]+" "+y[1]+" ";
					}else{
						m += num[n/10]+" "+y[1]+" ";
					}
				}
			}
			n=n%10;
		}else{
			if(bai||qian){
				m += num[0]+" ";
			}
		}
		if(n!=0){
			m += num[n];
		}
		return m;
	}
}