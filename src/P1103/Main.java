package P1103;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String f = scanner.next();
		double a = scanner.nextDouble(),
				b = scanner.nextDouble(),
				c = scanner.nextDouble(),
				d = scanner.nextDouble();
		switch (f) {
		case "+":
			System.out.format(String.format("%1$.2f",(a+c))+"+"+String.format("%1$.2f",(b+d))+"i");
			break;
		case "-":
			System.out.format(String.format("%1$.2f",(a-c))+"+"+String.format("%1$.2f",(b-d))+"i");
				break;
		case "*":
			System.out.format(String.format("%1$.2f",(a*c-b*d))+"+"+String.format("%1$.2f",(b*c+a*d))+"i");
			break;
		case "/":
			System.out.format(String.format("%1$.2f",((a*c+b*d)/(c*c+d*d)))+"+"+String.format("%1$.2f",(b*c-a*d)/(c*c+d*d))+"i");
			break;
		}
	}
}
