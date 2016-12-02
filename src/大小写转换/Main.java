package ´óÐ¡Ð´×ª»»;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] c = scanner.next().toCharArray();
		String string = "";
		for (int i = 0; i < c.length; i++) {
			if ((int)c[i]>=97) {
				string+=String.valueOf(c[i]).toUpperCase();
			}else{
				string+=String.valueOf(c[i]).toLowerCase();
			}
		}
		System.out.print(string);
	}

}
