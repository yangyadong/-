/**
��������
��������һ������Ϊn���ַ���S������һ������L��ͳ�Ƴ��ȴ��ڵ���L�ĳ��ִ��������Ӵ�����ͬ�ĳ��ֿ����ཻ��������ж���������ģ������Ȼ�ж���������һ�γ�������ġ�
�����ʽ
������һ��һ������L��
�����ڶ������ַ���S��
����L����0���Ҳ�����S�ĳ��ȡ�
�����ʽ
����һ�У���ĿҪ����ַ�����

������������1��
����4
����bbaabbaaaaa

�����������1��
����bbaa

������������2��
����2
����bbaabbaaaaa

�����������2��
����aa
���ݹ�ģ��Լ��
����n<=60
����S�������ַ�����СдӢ����ĸ��
��ʾ
����ö�����п��ܵ��Ӵ���ͳ�Ƴ��ִ������ҳ������������Ǹ�
 */
package �ִ�ͳ��;

import java.util.Scanner;

public class Main {
	static String string;
	static int l;
	static String res;
	static String result;
	static int resultNum = 0;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		string = scanner.next();
		for (l = num; l <= string.length(); l++) {
			int m = string.length() - l;
			for (int i = 0; i < m; i++) {
				res = string.substring(i, i + l);
				check();
			}
		}
		System.out.println(result);
	}

	public static void check() {
		int num = 0;
		int m = string.length() - l;
		for (int i = 0; i < m; i++) {
			if (res.equals(string.substring(i, i + l))) {
				num++;
			}
		}
		if (result != null) {
			if (num > resultNum || (num == resultNum && result.length() < res.length())) {
				result = res;
				resultNum = num;
			}
		} else {
			result = res;
			resultNum = num;
		}
	}

}
