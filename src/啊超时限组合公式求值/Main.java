package 啊超时限组合公式求值;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	static BigInteger remainder = BigInteger.valueOf(987654321);
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		BigInteger num = C(n,m);
		BigInteger res = BigInteger.valueOf(0);
		BigInteger r = BigInteger.valueOf(0);
		BigInteger pow;
		for (int i = 1; i <= n; i++) {
			pow = BigInteger.valueOf((long)Math.pow(i, 3));
			r = num.multiply(C(n,i)).multiply(pow);
			res = res.add(r);
		}
		System.out.println(res.remainder(remainder));
	}
	
	public static BigInteger C(int n,int i) {
		BigInteger r;
		r = D(n,n-i).divide(D(i,0));
		return r.remainder(remainder);
	}
	
	public static BigInteger D(int n,int i) {
		BigInteger r = BigInteger.valueOf(1);
		BigInteger num;
		for (int j = n; j > i; j--) {
			num = BigInteger.valueOf(j);
			r = r.multiply(num);
		}
		return r;
	}
	
}
