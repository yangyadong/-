/**
问题描述
　　输入一个只包含加减乖除和括号的合法表达式，求表达式的值。其中除表示整除。
输入格式
　　输入一行，包含一个表达式。
输出格式
　　输出这个表达式的值。
样例输入
1-2+3*(4-5)
样例输出
-4
数据规模和约定
　　表达式长度不超过100，表达式运算合法且运算过程都在int内进行。

 */

package 表达式计算;

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

	public static void Transform(int n)// 将中缀表达式转化为后缀表达式
	{
		int k = 0;
		for (int i = 0; i < n; i++) {
			if (res[i] >= '0' && res[i] <= '9')// 当是数字的情况
			{
				if (i + 1 < n && (res[i + 1] < '0' || res[i + 1] > '9') || i == n - 1)// 当是最后一个数字，或下一个元素是运算符
				{
					s2.push(res[i]);
					s2.push('#');
				} else
					s2.push(res[i]);
			} else {
				if (s1.empty() || res[i] == '(' || check(res[i]) > check(s1.peek()))// 当是运算符，有3种情况直接入栈
					s1.push(res[i]);
				else if (res[i] == ')')// 当是右括号的情况
				{
					while (s1.peek() != '(') {
						s2.push(s1.peek());
						s1.pop();
					}
					s1.pop();
				} else {// 当运算符优先级小于或等于S1栈顶运算符的优先级
					while (!s1.empty() && check(res[i]) <= check(s1.peek()) && s1.peek() != '(')// 这里还要注意两个界限
					{
						s2.push(s1.peek());
						s1.pop();
					}
					s1.push(res[i]);
				}
			}
		}

		while (!s1.empty())// 当表达式结束
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

	// 后缀表达式计算
	public static int Cal(int n) {
		int x, y, tmp = 0, k = 0;
		for (int i = 0; i < n; i++) {
			if (res[i] == '#')// 是#直接跳过
				continue;
			else if (res[i] == '+' || res[i] == '-' || res[i] == '*' || res[i] == '/') {// 是运算符弹出栈顶两元素计算后放回栈
				x = s3.peek();
				s3.pop();
				y = s3.peek();
				s3.pop();
				x = Scal(y, x, res[i]);
				s3.push(x);
			} else {// 是数字字符
				if (res[i + 1] == '#') {// 下一个元素是#
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
				} else {// 下一个元素不是#
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
