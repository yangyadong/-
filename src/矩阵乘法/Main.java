package ¾ØÕó³Ë·¨;

import java.util.Scanner;

public class Main {

	static int[][] res;
	static int[][] num;
	static int A;
	static int M;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		A = scanner.nextInt();
		M = scanner.nextInt();
		num = new int[A][A];
		res = new int[A][A];
		for (int i = 0; i < A; i++) {
			for (int j = 0; j < A; j++) {
				res[i][j]=num[i][j]=scanner.nextInt();
			}
		}
		if(M==0){
			for (int i = 0; i < A; i++) {
				for (int j = 0; j < A; j++) {
					if(i==j){
						System.out.print(1+" ");
					}else{
						System.out.print(0+" ");
					}
				}
				System.out.println();
			}
		}else {
			if(M!=1){
				cheng(2);
			}
			for (int i = 0; i < A; i++) {
				for (int j = 0; j < A; j++) {
					System.out.print(res[i][j]+" ");
				}
				System.out.println();
			}
		}
	}

	public static void cheng(int m) {
		if(m>M){
			return;
		}else{
			for (int i = 0; i < A; i++) {
				int[] san = new int[A];
				for (int l = 0; l < A; l++) {
					int add=0;
					for (int j = 0; j < A; j++) {
						add+=res[i][j]*num[j][l];
					}
					san[l] = add;
				}
				res[i]=san;
			}
		}
		cheng(m+1);
	}
	
}
