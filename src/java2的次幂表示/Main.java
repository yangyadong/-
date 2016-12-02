package java2的次幂表示;

import java.util.Scanner;
public class Main {
	public void fun(double e){
		double d = e;
		if (d == 1) {
			System.out.print("2(0)");
		}else{
			if (d == 2) {
				System.out.print("2");
			}else{
				int x= 1 ;
				int m = 0;
				while(m==0){
					if ( Math.pow(2, x+1) > d  &&  d >= Math.pow(2, x)) {
						m = 1;
						if (d == Math.pow(2, x)) {
							System.out.print("2");
							if (x != 1) {
								System.out.print("(");
								fun(x);
								System.out.print(")");
							}
						}else {
							System.out.print("2");
							if (x != 1) {
								System.out.print("(");
								fun(x);
								System.out.print(")");
							}
							System.out.print("+");
							fun(d-Math.pow(2, x));
						}
					}else {
						x++;
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Main cm = new Main();
		cm.fun(n);
	}
}
