/**
问题描述
　　某场比赛过后，你想要知道A~E五个人的排名是什么，于是要求他们每个人说了一句话。（经典的开头……-_-!）得了第1名的人23，说了假话；
得了第5名的人不好意思，也说了假话；为了使求解问题简单，第3名同样说了假话。（奇数名次说假话）
输入格式
　　共5行，各行依次表示A~E说的话。
　　每行包含一个形如“A>=3”的名次判断，即一个大写字母+关系运算符+一个数字，不包含空格。
　　大写字母A~E，关系运算<、<=、=、>=、>、!=，数字1~5。注意：等于是“=”不是“==”！
输出格式
　　可能有多解，请按照字典序输出排名序列，每个解一行
　　最后一行输出解的数量
样例输入
A=2
D=5
E>3
A>2
B!=1
样例输出
ACDEB
AECBD
BADCE
BCADE
BDACE
CEADB
CEBDA
7
 */
package 判断名次;

import java.util.Scanner;

public class Main {
	static String[][] l;
	static int sum = 0;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		l = new String[5][3];
		String str;
		for (int i = 0; i < 5; i++) {
			str = scanner.next();
			l[i][0] = str.substring(0, 1);
			l[i][1] = str.substring(1, str.length() - 1);
			l[i][2] = str.substring(str.length() - 1, str.length());
		}

		String[] m = { "A", "B", "C", "D", "E" };
		huisu(m, 0);
		System.out.println(sum);
	}

	public static void check(String[] m) {
		int index;
		for (int i = 0; i < m.length; i++) {
			index = index(m[i]);
			if (!test(m, l[index][0], l[index][1], l[index][2], i % 2 != 0 ? true : false)) {
				return;
			} else if (i == m.length - 1) {
				for (int j = 0; j < m.length; j++) {
					System.out.print(m[j]);
				}
				System.out.println();
				sum++;
			}
		}
	}

	public static int index(String index) {
		int id = 0;
		switch (index) {
		case "A":
			id = 0;
			break;
		case "B":
			id = 1;
			break;
		case "C":
			id = 2;
			break;
		case "D":
			id = 3;
			break;
		case "E":
			id = 4;
			break;
		}
		return id;
	}

	public static boolean test(String[] m, String perple, String key, String num, boolean T) {
		int index = Integer.valueOf(num) - 1;
		boolean res = false;
		switch (key) {
		case "=":
			if (perple.equals(m[index])) {
				res = true;
			}
			break;
		case "!=":
			if (!perple.equals(m[index])) {
				res = true;
			}
			break;
		case ">":
			for (int i = 0; i < m.length; i++) {
				if (perple.equals(m[i])) {
					if (i + 1 > Integer.valueOf(num)) {
						res = true;
					}
				}
			}
			break;
		case "<":
			for (int i = 0; i < m.length; i++) {
				if (perple.equals(m[i])) {
					if (i + 1 < Integer.valueOf(num)) {
						res = true;
					}
				}
			}
			break;
		case ">=":
			for (int i = 0; i < m.length; i++) {
				if (perple.equals(m[i])) {
					if (i + 1 >= Integer.valueOf(num)) {
						res = true;
					}
				}
			}
			break;
		case "<=":
			for (int i = 0; i < m.length; i++) {
				if (perple.equals(m[i])) {
					if (i + 1 <= Integer.valueOf(num)) {
						res = true;
					}
				}
			}
			break;
		}
		if (T == res) {
			res = true;
		} else {
			res = false;
		}
		return res;
	}

	public static void huisu(String[] m, int k) {
		if (k == m.length) {
			check(m);
			return;
		}
		for (int i = k; i < m.length; i++) {
			{
				String temp = m[k];
				m[k] = m[i];
				m[i] = temp;
			}
			huisu(m, k + 1);
			{
				String temp = m[k];
				m[k] = m[i];
				m[i] = temp;
			}
		}
	}

}
