package ÈÕÆÚ¼ÆËã;

import java.util.Calendar;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int y = scanner.nextInt();
		int m = scanner.nextInt();
		int d = scanner.nextInt();

		Calendar date = Calendar.getInstance();
		date.set(y, m - 1, d);
		int week = date.get(Calendar.DAY_OF_WEEK);
		if (week == 1) {
			week = 7;
		} else {
			week -= 1;
		}
		System.out.println(week);
	}
}
