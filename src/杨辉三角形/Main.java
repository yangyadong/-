package Ñî»ÔÈý½ÇÐÎ;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[][] num = new int[n][];
		for (int i = 0; i < n; i++) {
			num[i] = new int[i+1];
			for (int j = 0; j <= i; j++) {
				if (i<2) {
					num[i][j] = 1;
				}else{
					if (j==0 || j== i) {
						num[i][j] = 1;
					}else{
						num[i][j] = num[i-1][j-1] + num[i-1][j];
					}
				}
				System.out.print(num[i][j] + "  ");
			}
			System.out.println();
		}
	}
}
