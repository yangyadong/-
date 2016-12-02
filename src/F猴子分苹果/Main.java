package Fºï×Ó·ÖÆ»¹û;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		boolean run = true;
		int i = n*m;
		int k=i;
		while (run) {
			k =i;
			for (int j = 0; j < n; j++) {
				if (i%n==m) {
					i = (i/n)*(n-1);
					if(j==n-1){
						if(i%n==m){
							run = false;
						}else{
							i = k+1;
						}
					}
				}else{
					i = k+1;
					break;
				}
			}
		}
		System.out.println(k);
	}

}
