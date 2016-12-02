package ¹êÍÃÈüÅÜÔ¤²â;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int v1 = scanner.nextInt();
		int v2 = scanner.nextInt();
		int t = scanner.nextInt();
		int s = scanner.nextInt();
		int l = scanner.nextInt();
		int num1=0;
		int num2=0;
		int num = num1-num2;
		int time = 0;
		while (num1<l&&num2<l) {
			if(num<t){
				num1 += run1(v1,1);
				num2 += run2(v2,1);
				num  = num1-num2;
				time++;
				check(num1,num2,l,time);
			}else{
				num1 += run1(v1,0);
				for (int i = 1; i <= s; i++) {
					num2 += run2(v2,1);
					time+=1;
					check(num1,num2,l,time);
				}
				num  = num1-num2;
			}
		}
		
	}
	
	public static void check(int num1,int num2,int l,int time) {
		boolean t=false;
		if (num1>=l && num2>=l) {
			System.out.println("D");
			t=true;
		}else	if(num1>=l){
			System.out.println("R");
			t=true;
		}else if(num2>=l){
			System.out.println("T");
			t=true;
		}
		if(t){
			System.out.println(time);
			System.exit(0);
		}
	}
	
	public static int run1(int v1,int t) {
		return v1*t;
	}
	
	public static int run2(int v2,int t) {
		return v2*t;
	}

}
