/**
��������
���������������󣬷ֱ���m*s��s*n��С���������������˵Ľ����
�����ʽ
������һ�У��ո����������������m,s,n����������200����
����������m�У�ÿ��s���ո��������������ʾ����A��i��j����
����������s�У�ÿ��n���ո��������������ʾ����B��i��j����
�����ʽ
����m�У�ÿ��n���ո��������������������ľ���C��i��j����ֵ��
��������
2 3 2
1 0 -1
1 1 -3
0 3
1 2
3 1
�������
-3 2
-8 2

��ʾ
����CӦ����m��n�У�����C(i,j)���ھ���A��i�������������B��j�����������ڻ���
����������C(1,1)=(1,0,-1)*(0,1,3) = 1 * 0 +0*1+(-1)*3=-3
 */
package ����;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int s = scanner.nextInt();
		int n = scanner.nextInt();
		int[][] num1 = new int[m][s];
		int[][] num2 = new int[s][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < s; j++) {
				num1[i][j] = scanner.nextInt();
			}
		}
		for (int i = 0; i < s; i++) {
			for (int j = 0; j < n; j++) {
				num2[i][j] = scanner.nextInt();
			}
		}
		int num = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				num = 0;
				for (int j2 = 0; j2 < s; j2++) {
					num += num1[i][j2]*num2[j2][j];
				}
				System.out.print(num+" ");
			}
			System.out.println();
		}
		
	}
}
