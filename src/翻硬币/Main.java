package ·­Ó²±Ò;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = 0;
		char start[] = sc.next().toCharArray();
		char end[] = sc.next().toCharArray();
		for(int i=0; i < start.length-1; i++){
			if(start[i] != end[i]){
				start[i] = turn(start[i]);
				start[i+1] = turn(start[i+1]);
				t ++;
			}
		}
		System.out.print(t);
	}
	public static char turn(char a){
		if(a=='o') return '*';
		if(a=='*') return 'o';
		return 'o';
	}
}
