package 十进制转十六进制;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt(),m=0;
		char c;
		String s="";
		if (n==0)
			s="0";
		while(n%16!=0||n/16!=0){
			m=n%16;
			if(m/10==1)
				c=(char)(65+m%10);
			else 
				c=(char)(48+m);
			s=c+s;
			n=n/16;
		}
		System.out.println(s);
	}
}
