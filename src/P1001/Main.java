/**
�������Ƚϴ���������ʱ�����ܻ����������������Ρ�Ϊ������������Բ����ַ����ķ�����ʵ����������֮��ĳ˷���������˵���������ַ�������ʽ��������������ÿ�������ĳ��Ȳ��ᳬ��8λ��Ȼ���������˵Ľ���洢����һ���ַ������У����Ȳ��ᳬ��16λ������������ַ�����ӡ���������磬�����û�����Ϊ��62773417��12345678����������Ϊ��774980393241726.

���룺
����62773417 12345678

�����
����774980393241726

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
