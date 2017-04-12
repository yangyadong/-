/**
���������������ֻ�һ��õĹ��ܡ�����Ҫ��3x3�ĵ����ϣ�������һ���㿪ʼ�������ƶ���һ����δ������"����"�ĵ㡣��Щ�����ĵ�����ɵ��������ߣ������Ԥ���������ͼ���������϶�һ�£���ô�ֻ���������
��ν�����㡰���ڡ������ҽ�������������Ϊ�˵���߶��ϲ�������δ�����ĵ㡣
���⣬����ֻ���Լ�����������߻���Ҫ���پ���4���㡣
Ϊ���������㣬���Ǹ���9������ϵ��¡����������α��1-9�����������У�
1 2 3
4 5 6
7 8 9
��ô1->2->3�ǷǷ��ģ���Ϊ���Ȳ��㡣
1->3->2->4Ҳ�ǷǷ��ģ���Ϊ1->3��������δ�����ĵ�2��
2->4->1->3->6�ǺϷ��ģ���Ϊ1->3ʱ��2�Ѿ��������ˡ�
ĳ�����Ѿ������һ����389112�ֲ�ͬ�Ľ���������û���κ�����ʱ��Ҫ�뱩������ȷʵ���ѡ�
����СHi�ܺ��棬��ϣ��֪�������Ѿ�Ƴ�ӵ�һ�������ߵ�����£��ж����ֲ�ͬ�ķ�����
�ź����ǣ�СHi�����Ĳ������߼Ȳ�һ���������ģ�Ҳ��֪������
���翴��1-2-3��4-5-6��
��ô1->2->3->4->5->6��1->2->3->6->5->4, 3->2->1->6->5->4->8->9�ȶ��ǿ��ܵķ�����
��������Ǳ�д���򣬸����Ѿ�Ƴ���������߶Σ�����ܽ�����������Ŀ��
���룺
ÿ���������ݵ�һ����һ������N(0 <= N <= 8)������СHi���������߶���Ŀ��
����N��ÿ�а����������� X �� Y (1 <= X, Y <= 9)������СHi������X�͵�Y��ֱ�������ġ�
�����
����ÿ����������Ϸ��Ľ���������Ŀ��
���磺
���룺
8
1 2 2 3
3 4 4 5
5 6 6 7
7 8 8 9
����Ӧ�������
2
�����磺
���룺
4
2 4
2 5
8 5
8 6
����Ӧ�������
258
 */
package ģ������������;

import java.util.Scanner;

public class Main {
	private static int N; // ��ʾ�����ı���
	private static int[][] path; // ���ӵĵ���
	private static boolean[] keep = new boolean[10];
	private static int count; // ��ʾ���ж��ٸ����ܵĽ��

	private static boolean isBool(int a, int b) {
		// 8�����
		int dig[][] = new int[][] { { 1, 3, 2 }, { 4, 6, 5 }, { 7, 9, 8 }, { 1, 7, 4 }, { 2, 8, 5 }, { 3, 9, 6 },
				{ 1, 9, 5 }, { 3, 7, 5 } };
		for (int i = 0; i < 8; i++) {
			if (a == dig[i][0] && b == dig[i][1] || a == dig[i][1] && b == dig[i][0])
				if (!keep[dig[i][2]])
					return false;
		}
		return true;
	}

	/*
	 * @N �������ӵĸ���
	 * 
	 * @step ��ǰ���ӵĵ���
	 * 
	 * @a ��¼���ӵ����
	 */
	private static void dfs(int number, int step, int[] process) {
		if (step >= 2) {
			int a = process[step - 2];
			int b = process[step - 1];
			// ���Ϊfalse�Ļ��� ��ôֱ�Ӿ�������α������
			if (!isBool(a, b))
				return;
		}
		if (step == number) {
			for (int i = 0; i < N; i++) {
				int a = path[i][0];
				int b = path[i][1];
				for (int j = 0; j < step - 1; j++) {
					if (a == process[j] && b == process[j + 1] || a == process[j + 1] && b == process[j])
						break;
					if (j == step - 2)
						return;
				}
			}
			count++;
			return;
		} else if (step > number)
			return;

		for (int i = 1; i <= 9; i++) {
			if (!keep[i]) {
				keep[i] = true;
				process[step] = i; // ��ǰλ�õ�ֵ
				dfs(number, step + 1, process);
				keep[i] = false; // ����
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		path = new int[N + 1][2];
		int[] process = new int[10];

		for (int i = 0; i < N; i++) {
			path[i][0] = sc.nextInt();
			path[i][1] = sc.nextInt();
		}
		// ���N�����ִ���4����ô���Ǳ������ӵ�N������ �������ӵ�4Ϊ��׼
		for (int i = N > 4 ? N : 4; i <= 9; i++)
			dfs(i, 0, process);

		System.out.println(count);
		sc.close();
	}
}
