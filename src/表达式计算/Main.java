/**
��������
��������һ��ֻ�����Ӽ��Գ������ŵĺϷ����ʽ������ʽ��ֵ�����г���ʾ������
�����ʽ
��������һ�У�����һ�����ʽ��
�����ʽ
�������������ʽ��ֵ��
��������
1-2+3*(4-5)
�������
-4
���ݹ�ģ��Լ��
�������ʽ���Ȳ�����100�����ʽ����Ϸ���������̶���int�ڽ��С�

 */

package ���ʽ����;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	static char[] res;

	static Stack<Integer> s3 = new Stack<>();
	static Stack<Character> s1 = new Stack<>(), s2 = new Stack<>();
	static ArrayList<Integer> num = new ArrayList<>();

	public static int check(char ch) {
		int res = 0;
		if (ch == ')')
			res = 1;
		else if (ch == '+' || ch == '-')
			res = 2;
		else if (ch == '*' || ch == '/')
			res = 3;
		else if (ch == '(')
			res = 4;
		return res;

	}

	public static void Transform(int n)// ����׺���ʽת��Ϊ��׺���ʽ
	{
		int k = 0;
		for (int i = 0; i < n; i++) {
			if (res[i] >= '0' && res[i] <= '9')// �������ֵ����
			{
				if (i + 1 < n && (res[i + 1] < '0' || res[i + 1] > '9') || i == n - 1)// �������һ�����֣�����һ��Ԫ���������
				{
					s2.push(res[i]);
					s2.push('#');
				} else
					s2.push(res[i]);
			} else {
				if (s1.empty() || res[i] == '(' || check(res[i]) > check(s1.peek()))// �������������3�����ֱ����ջ
					s1.push(res[i]);
				else if (res[i] == ')')// ���������ŵ����
				{
					while (s1.peek() != '(') {
						s2.push(s1.peek());
						s1.pop();
					}
					s1.pop();
				} else {// ����������ȼ�С�ڻ����S1ջ������������ȼ�
					while (!s1.empty() && check(res[i]) <= check(s1.peek()) && s1.peek() != '(')// ���ﻹҪע����������
					{
						s2.push(s1.peek());
						s1.pop();
					}
					s1.push(res[i]);
				}
			}
		}

		while (!s1.empty())// �����ʽ����
		{
			s2.push(s1.peek());
			s1.pop();
		}

		String kk = s2.toString().replaceAll(",", "").replaceAll(" ", "");
		res = kk.substring(1, kk.length() - 1).toCharArray();
	}

	public static int Scal(int x, int y, int ch) {
		int res = 0;
		if (ch == '+')
			res = x + y;
		else if (ch == '-')
			res = x - y;
		else if (ch == '*')
			res = x * y;
		else if (ch == '/' && y != 0)
			res = x / y;
		return res;
	}

	// ��׺���ʽ����
	public static int Cal(int n) {
		int x, y, tmp = 0, k = 0;
		for (int i = 0; i < n; i++) {
			if (res[i] == '#')// ��#ֱ������
				continue;
			else if (res[i] == '+' || res[i] == '-' || res[i] == '*' || res[i] == '/') {// �����������ջ����Ԫ�ؼ����Ż�ջ
				x = s3.peek();
				s3.pop();
				y = s3.peek();
				s3.pop();
				x = Scal(y, x, res[i]);
				s3.push(x);
			} else {// �������ַ�
				if (res[i + 1] == '#') {// ��һ��Ԫ����#
					if (num.size() == k) {
						num.add(k++, res[i] - '0');
					} else {
						num.set(k++, res[i] - '0');
					}
					for (int j = 0; j < k; j++)
						tmp += (num.get(j) * (int) Math.pow(10, k - j - 1));
					s3.push(tmp);
					tmp = 0;
					k = 0;
				} else {// ��һ��Ԫ�ز���#
					if (num.size() == k) {
						num.add(k++, res[i] - '0');
					} else {
						num.set(k++, res[i] - '0');
					}
				}
			}
		}
		return s3.peek();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		res = string.toCharArray();
		Transform(string.length());
		System.out.println(Cal(res.length));
	}

}
