package ºËÌÒµÄÊıÁ¿;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a=scanner.nextInt(),b=scanner.nextInt(),c=scanner.nextInt();
		int num=3;
		while (!(num%a==0&&num%b==0&&num%c==0)) {
			num++;
		}
		System.out.println(num);
	}

}
