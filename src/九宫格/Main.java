/**
��������
�����Ź�������1-9��9�����ֵ�һ���������򣬹���3*3��ά���顣���ÿ�С�ÿ���Լ��Խ���֮�Ͷ���ȣ���ӡ1�������ӡ0��
�������
����������������Ӧ�������
����
4 9 2
3 5 7
8 1 6
�����1
���ݹ�ģ��Լ��
����1-9��9�����ֵ�һ����������
 */
package �Ź���;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] num = new int[4][4];
		for (int i = 0; i < 3; i++) {
			int res = 0;
			for (int j = 0; j < 3; j++) {
				num[i][j] = scanner.nextInt();
				res += num[i][j];
			}
			num[i][3] = res;
		}
		num[3][0] = num[0][0]+num[1][0]+num[2][0];
		num[3][1] = num[0][1]+num[1][1]+num[2][1];
		num[3][2] = num[0][2]+num[1][2]+num[2][2];
		num[3][3] = num[0][0]+num[1][1]+num[2][2];
		int m = num[0][2]+num[1][1]+num[2][0];
		if (num[0][3]==num[1][3]&&num[0][3]==num[2][3]&&num[0][3]==num[3][0]&&num[3][0]==num[3][1]&&num[3][0]==num[3][2]&&num[3][0]==num[3][3]&&num[3][0]==m) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}
}
