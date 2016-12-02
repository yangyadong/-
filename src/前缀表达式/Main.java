package 前缀表达式;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		int a=scanner.nextInt(),b=scanner.nextInt();
		if (string.equals("+")) {
			System.out.println(a+b);
		}else if (string.equals("-")) {
			System.out.println(a-b);
		}else if (string.equals("*")) {
			System.out.println(a*b);
		}else if (string.equals("/")) {
			System.out.println((int)a/b);
		}
	}

}
