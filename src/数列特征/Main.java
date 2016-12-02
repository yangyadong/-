package ÊıÁĞÌØÕ÷;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int num;
		int max,min,sum;
		sum = max = min = scanner.nextInt();
		for (int i = 1; i < n; i++) {
			num = scanner.nextInt();
			if (num > max) {
				max = num;
			}else if (num < min) {
				min = num;
			}
			sum += num;
		}
		System.out.println(max+"\r\n"+min+"\r\n"+sum);
	}
}
