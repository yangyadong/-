/**
��������
����ĳ��������������Ҫ֪��A~E����˵�������ʲô������Ҫ������ÿ����˵��һ�仰��������Ŀ�ͷ����-_-!�����˵�1������23��˵�˼ٻ���
���˵�5�����˲�����˼��Ҳ˵�˼ٻ���Ϊ��ʹ�������򵥣���3��ͬ��˵�˼ٻ�������������˵�ٻ���
�����ʽ
������5�У��������α�ʾA~E˵�Ļ���
����ÿ�а���һ�����硰A>=3���������жϣ���һ����д��ĸ+��ϵ�����+һ�����֣��������ո�
������д��ĸA~E����ϵ����<��<=��=��>=��>��!=������1~5��ע�⣺�����ǡ�=�����ǡ�==����
�����ʽ
���������ж�⣬�밴���ֵ�������������У�ÿ����һ��
�������һ������������
��������
A=2
D=5
E>3
A>2
B!=1
�������
ACDEB
AECBD
BADCE
BCADE
BDACE
CEADB
CEBDA
7
 */
package �ж�����;

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
