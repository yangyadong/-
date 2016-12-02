package ¼ÅÄ¯µÄÊı;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 0; i < 10 && i < n; i++) {
			if (i%2!=0) {
				System.out.println(i);
			}
		}
		for (int i = 10; i < n; i++) {
			int k = String.valueOf(i).length();
			int j = i-k*9;
			boolean is = true;
			for (; j < i; j++) {
				char[] num = String.valueOf(j).toCharArray();
				int sum = 0;
				for (int l = 0; l < num.length; l++) {
					sum += ((int)num[l]-48);
				}
				if(sum+j==i){
					is = false;
					break;
				}
			}
			if(is){
				System.out.println(i);
			}
		}
	}

}
