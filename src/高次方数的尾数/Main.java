package 高次方数的尾数;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		System.out.println((int)(Math.pow(m, n)%1000));
	}
}
