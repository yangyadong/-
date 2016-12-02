package ÈıÈËÄêÁä;

public class Main {

	public static void main(String[] args) {
		int max = 0;
		int a=19,b=19;
		for (int i = 19; i <= 32; i++) {
			for (int j = 19; j <= 32; j++) {
				if (70-i-j >= 19 && i*j*(70-i-j)>max) {
					max = i*j*(70-i-j);
					a = i;b=j;
				}
			}
		}
		System.out.println(a+","+b+","+(70-a-b));
	}
}
