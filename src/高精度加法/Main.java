package 高精度加法;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] a = scanner.nextLine().toCharArray();
		char[] b = scanner.nextLine().toCharArray();
		if (a.length<b.length) {
			jisuan(b,a,b.length-a.length);
		}else{
			jisuan(a,b,a.length-b.length);
		}
	}
	
	public static void jisuan(char[] c,char[] d,int num) {
		int k =0;
		for (int i = c.length-1; i >= 0; i--) {
			if (i-num<0 &&  k==0) {
				break;
			}else if (i-num>=0) {
				int sum = Integer.parseInt(String.valueOf(c[i]))+Integer.parseInt(String.valueOf(d[i-num]))+k;
				c[i]=(char)(sum%10+48);
				k=sum/10;
			}else{
				int sum = Integer.parseInt(String.valueOf(c[i]))+k;
				c[i]=(char)(sum%10+48);
				k=sum/10;
			}
		}
		if(k!=0){
			System.out.print(k);
		}
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}
	}

}
