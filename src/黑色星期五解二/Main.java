package 黑色星期五解二;

import java.util.Calendar;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		scanner.close();

		System.out.println(count(year));
	}
	public static int count(int year){
		int ct = 0;
		Calendar calendar = Calendar.getInstance();
		for(int i= 1;i <= 12 ;i++){
			calendar.set(year, i, 13);
			int wk =  calendar.get(Calendar.DAY_OF_WEEK);
			if (wk == 6) {
				ct++;
			}
		}
		return ct;
	}
}
