package 最大公约数and最小公倍数;

import java.util.Scanner;

public interface Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		System.out.println("最大公约数"+maxCommonDivisor(m, n));
		System.out.println("最小公倍数"+minCommonMultiple(m, n));
	}

	//求最大公约数：一
	public static int maxCommonDivisor(int m,int n) {
		if(m<n){
			int temp = n;
			n = m;
			m = temp;
		}
		while (m%n!=0) {
			int temp = m%n;
			m = n;
			n = temp;
		}
		return n;
	}

	//求最大公约数：二
	public static int maxCommonDivisor2(int m,int n) {
		if(m<n){
			int temp = n;
			n = m;
			m = temp;
		}
		if(m%n==0){
			return n;
		}else {
			return maxCommonDivisor2(m, n);
		}
	}

	//求最小公倍数
	public static int minCommonMultiple(int m,int n) {
		return m*n/maxCommonDivisor(m, n);
	}

}
