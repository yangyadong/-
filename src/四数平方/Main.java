package 四数平方;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] num = {0,0,0,0};
		int k = 3;
		while (k>=0) {
			int a = (int)Math.pow((int)Math.sqrt(n),2);
			num[k]=(int)Math.sqrt(n);
			if (a==n) {
				break;
			}else{
				n=n-a;
				k--;
			}
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+" ");
		}
	}

}
