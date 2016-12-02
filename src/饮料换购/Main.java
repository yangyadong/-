package ÒûÁÏ»»¹º;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int num = n;
		int s = n;
		while (s>=3) {
			num+=s/3;
			s = s%3+s/3;
		}
		System.out.println(num);
	}
	
}
