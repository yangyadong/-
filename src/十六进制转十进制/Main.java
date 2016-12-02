package 十六进制转十进制;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum;
		long s=0;
		String num = scanner.next();
		for (int i = 0; i < num.length(); i++) {
			switch (num.substring(i, i+1)) {
			case "A":
				sum=10;
				break;
			case "B":
				sum=11;
				break;
			case "C":
				sum=12;
				break;
			case "D":
				sum=13;
				break;
			case "E":
				sum=14;
				break;
			case "F":
				sum=15;
				break;
			default:
				sum=Integer.parseInt(num.substring(i, i+1));
				break;
			}
			s+=sum*(Math.pow(16,(num.length()-i-1)));
		}
		System.out.println(s);
	}
}
