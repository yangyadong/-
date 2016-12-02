package ×Ö·û´®¶Ô±È;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String A = scanner.nextLine();
		String B = scanner.nextLine();
		if (A.length()!=B.length()) {
			System.out.println(1);
		}else if(A.equals(B)){
			System.out.println(2);
		}else if (A.equalsIgnoreCase(B)) {
			System.out.println(3);
		}else {
			System.out.println(4);
		}
	}

}
