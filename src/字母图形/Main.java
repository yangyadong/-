package ×ÖÄ¸Í¼ÐÎ;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(j==0){
					System.out.print((char)(65+(i%26)));
				}else{
					if(j<=i%26){
						System.out.print((char)(65+(i%26)-j));
					}else{
						System.out.print((char)(65+j-(i%26)));
					}
				}
			}
			System.out.println();
		}
	}
}
