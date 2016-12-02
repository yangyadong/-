package 分解质因数;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		for (int i = a; i < b; i++) {
			operation(i);
		}
	}
	
	public static void operation(int m) {
		System.out.print(m+"=");
		for (int i = 2; i < m/2+1; i++) {
			if (m%i==0) {
				System.out.print(i+"*");
				m=m/i;
				i--;
			}
		}
		System.out.println(m);
	}

}
