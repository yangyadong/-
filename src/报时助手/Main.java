package ±® ±÷˙ ÷;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String[] time = {"zero","one", "two","three","four","five","six","seven","eight",
				"nine","ten", "eleven","twelve","thirteen","fourteen","fifteen","sixteen",
				"seventeen","eighteen","nineteen","twenty","thirty","forty","fifty"};
		Scanner scanner = new Scanner(System.in);
		int h = scanner.nextInt();
		int m = scanner.nextInt();
		String text="";
		if(h<=20){
			text+=time[h];
		}else{
			text+=time[20]+" "+time[h-20];
		}
		if(m<=20){
			if(m==0){
				text+=" o'clock";
			}else{
				text+=" "+time[m];
			}
		}else if(m>=50&&m<60){
			if(m==50){
				text+=" "+time[23];
			}else{
				text+=" "+time[23]+" "+time[m-50];
			}
		}else if(m>=40&&m<50){
			if(m==50){
				text+=" "+time[22];
			}else{
				text+=" "+time[22]+" "+time[m-40];
			}
		}else if(m>=30&&m<40){
			if(m==30){
				text+=" "+time[21];
			}else{
				text+=" "+time[21]+" "+time[m-30];
			}
		}else if(m>20&&m<30){
			text+=" "+time[20]+" "+time[m-20];
		}
		System.out.println(text);
	}

}
