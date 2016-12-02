package ´òÓ¡Èý½ÇÍ¼ÐÎ;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int sum = -1;
		for (int i = 1; i <= n; i++) {
			sum += 2;
		}
		int k = -1;
		for (int i = 1; i <= n; i++) {
			k += 2;
			int m = (sum-k)/2;
			for (int j = 0; j < m; j++) {
				System.out.print(String.format("%s", " "));
			}
			int t = m+k;
			for (int j = m; j < t; j++) {
				System.out.print(String.format("*"));
			}
			System.out.println();
		}
	}

}
