package F最大的算式;

import java.util.Scanner;

public class Main {

	static int n;
	static long max = 0;
	static int[] num;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		int k = scanner.nextInt();
		num = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = scanner.nextInt();
		}
		check(0,k);
		System.out.println(max);
	}
	
	public static long check(int m,int k) {
		long sum=0;
		if(k!=0){
			for (int i = m; i < n-k; i++) {
				sum = 0;
				for (int j = m; j <= i; j++) {
					sum+=num[j];
				}
				sum *= check(i+1,k-1);
				if(sum>max){
					max=sum;
				}
			}
		}else{
			sum = 0;
			for (int i = m; i < n; i++) {
				sum+=num[i];
			}
			if(sum>max){
				max=sum;
			}
		}
		return sum;
	}

}
