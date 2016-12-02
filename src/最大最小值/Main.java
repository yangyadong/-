package 最大最小值;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int max,min,num;
		max = min = scanner.nextInt();
		for (int i = 1; i < n; i++) {
			num = scanner.nextInt();
			if (num>max) {
				max=num;
			}else if (num<min) {
				min=num;
			}
		}
		System.out.println(max+" "+min);
	}

}
