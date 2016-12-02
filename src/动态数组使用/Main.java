package 动态数组使用;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] num = new int[n];
		int sum;
		sum=num[0]=scanner.nextInt();
		for (int i = 1; i < n; i++) {
			num[i] = scanner.nextInt();
			sum += num[i];
		}
		System.out.println(sum+" "+sum/n);
	}

}
