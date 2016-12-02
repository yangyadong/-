package ²éÕÒÕûÊı;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] num = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = scanner.nextInt();
		}
		int k = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			if (k == num[i]) {
				System.out.println(i+1);
				break;
			}else if (i == n-1) {
				System.out.println(-1);
			}
		}
	}

}
