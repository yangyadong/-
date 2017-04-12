/**
当两个比较大的整数相乘时，可能会出现数据溢出的情形。为避免溢出，可以采用字符串的方法来实现两个大数之间的乘法。具体来说，首先以字符串的形式输入两个整数，每个整数的长度不会超过8位，然后把它们相乘的结果存储在另一个字符串当中（长度不会超过16位），最后把这个字符串打印出来。例如，假设用户输入为：62773417和12345678，则输出结果为：774980393241726.

输入：
　　62773417 12345678

输出：
　　774980393241726

 */
package P1001;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String A = scanner.next();
		String B = scanner.next();
		BigInteger num1 = new BigInteger(A);
		BigInteger num2 = new BigInteger(B);
		BigInteger res;
		res = num1.multiply(num2);
		System.out.println(res);
	}
}
