package ÊıÁĞÅÅĞò;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}
		int num;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(array[i] < array[j]){
					num = array[i];
					array[i] = array[j];
					array[j] = num;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(array[i]+"  ");
		}
	}
}
