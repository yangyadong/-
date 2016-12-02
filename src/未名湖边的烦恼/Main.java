package Î´Ãûºş±ßµÄ·³ÄÕ;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		int num = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if(i<=j){
					num++;
				}
			}
		}
		System.out.println(num);
	}

}
