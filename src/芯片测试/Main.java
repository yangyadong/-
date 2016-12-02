package –æ∆¨≤‚ ‘;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		int n = scanner.nextInt();
		int[][] status = new int[n][n];
		int[] count = new int[n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				status[i][j] = scanner.nextInt();
				if(status[i][j]==1){
					count[j]++;
				}
			}
		}
		for (int i = 0; i < count.length; i++) {
			if(count[i]>n/2){
				System.out.print(i+1);
				if(i!=count.length-1){
					System.out.print(" ");
				}
			}
		}
	}
}
