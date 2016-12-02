package Ê±¼ä×ª»»;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] time = new int[3];
		for (int i = 2; i >= 0; i--) {
			time[i]=t%60;
			t=t/60;
		}
		System.out.println(time[0]+":"+time[1]+":"+time[2]);
	}

}
