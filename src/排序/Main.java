package ≈≈–Ú;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] num = new int[3];
		for (int i = 0; i < 3; i++) {
			num[i] = scanner.nextInt();
		}
		if(num[0]>num[1]){
			if (num[0]<num[2]) {
				System.out.println(num[2]+" "+num[0]+" "+num[1]);
			}else if(num[1]<num[2]){
				System.out.println(num[0]+" "+num[2]+" "+num[1]);
			}else{
				System.out.println(num[0]+" "+num[1]+" "+num[2]);
			}
		}else{
			if (num[1]<num[2]) {
				System.out.println(num[2]+" "+num[1]+" "+num[0]);
			}else if(num[0]<num[2]){
				System.out.println(num[1]+" "+num[2]+" "+num[0]);
			}else{
				System.out.println(num[1]+" "+num[0]+" "+num[2]);
			}
		}
	}

}
