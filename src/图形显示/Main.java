package Í¼ÐÎÏÔÊ¾;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = n; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
