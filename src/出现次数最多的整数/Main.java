package 出现次数最多的整数;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		if(n<=0){
			return;
		}
		int now=0,max=0;
		int[] num = new int[n];
		num[0] = scanner.nextInt();
		for (int i = 1; i < n; i++) {
			num[i] = scanner.nextInt();
		}
		for (int i = 0; i < n; i++) {
			int s=0;
			for (int j = 0; j < n; j++) {
				if (num[i]==num[j]) {
					s++;
				}else if (num[j]>num[i]) {
					break;
				}
			}
			if (s>max) {
				now = num[i];
				max=s;
			}
		}
		System.out.println(now);
	}
}
