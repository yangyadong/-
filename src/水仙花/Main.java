package Ë®ÏÉ»¨;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		int sum = 0;
		sum += Math.pow(k%10,3);
		sum += Math.pow((k/10)%10,3);
		sum += Math.pow(k/100,3);
		if (sum==k) {
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}

}
