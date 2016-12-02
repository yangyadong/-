package ºÚÉ«ĞÇÆÚÎå;

import java.text.ParseException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int next_year = 4;
		for (int i = 1998; i < t; i++) {
			int d = 365;
			if ((i%4==0&&i%100!=0)||(i%100==0&&i%400==0)) {
				d = 366;
			}
			next_year=(d%7+next_year)%7;
		}
		int sum = 0;
		next_year=(12%7+next_year)%7;
		if(next_year==5){
			sum++;
		}
		for (int i = 1; i < 12; i++) {
			if(i==1||i==3||i==5||i==7||i==8||i==10){
				next_year=(31%7+next_year)%7;
			}else if (i==2) {
				if((t%4==0&&t%100!=0)||(t%100==0&&t%400==0)){
					next_year=(29%7+next_year)%7;
				}else{
					next_year=(28%7+next_year)%7;
				}
			}else{
				next_year=(30%7+next_year)%7;
			}
			if(next_year==5){
				sum++;
			}
		}
		System.out.println(sum);
	}

}
