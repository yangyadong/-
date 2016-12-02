package FJµÄ×Ö·û´®;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String s = "A";
		for (int i = 2; i <= n; i++) {
			s = s+((char)('A'+(i-1)))+s;
		}
		System.out.println(s);
	}
}
