/**
��m+n�����Ŷӵȴ���Ʊ��������m �����ֳ�50Ԫ�ĳ�Ʊ������n�����ֳ�100Ԫ�ĳ�Ʊ�������m+n�����Ŷӹ�Ʊ��
ʹ��Ʊ�����������Ҳ���Ǯ�ľ���Ĳ�ͬ�Ŷ�����������������m��n�Ӽ������룩
�������ݣ�
15 12
4345965

20 10
15737865
 */
package �Ŷ���Ʊ;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		System.out.println(f(m, n));
	}
	
	public static int f(int m,int n) {
		int res = 0;
		if (n == 0) {
			res = 1;
		}else if (m < n) {
			res = 0;
		}else {
			res = f(m, n-1)+f(m-1, n);
		}
		return res;
	}
	
}
