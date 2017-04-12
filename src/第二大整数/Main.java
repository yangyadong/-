package 第二大整数;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int max = Integer.MIN_VALUE, sec = Integer.MIN_VALUE;
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		while (num != 0) {
			if (num > sec) {
				if (num > max) {
					sec = max;
					max = num;
				} else {
					sec = num;
				}
			}
			num = scanner.nextInt();
		}
		System.out.println(sec);
	}
}
