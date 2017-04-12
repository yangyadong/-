/**
��������
����Ϊ��ά�ռ��еĵ����һ���ṹ�壬�ڴ˻�����Ϊ���������һ���ṹ�塣�ֱ���ƶ����ĺ������������ε��ܳ�����������ĺ����ġ�
���������㣬����������㹹�ɵ������ε��ܳ�����������ĺ����ġ��������С�����2λ���֡�
���ģ�
	A1=2*(x2-x1)��
	B1=2*(y2-y1)��
	C1=x2^2+y2^2-x1^2-y1^2;
	A2=2*(x3-x2)��
	B2=2*(y3-y2)��
	C2=x3^2+y3^2-x2^2-y2^2;
	x=((C1*B2)-(C2*B1))/((A1*B2)-(A2*B1))��
	y=((A1*C2)-(A2*C1))/((A1*B2)-(A2*B1))��
���ģ�x=(x+x2+x3)/3,
	 y=(y1+y2+y3)/3.
�����S=(1/2)*(x1y2+x2y3+x3y1-x1y3-x2y1-x3y2)
�ܳ���(x1-x2)^2+(y1-y2)^2+(x1-x3)^2+(y1-y3)^2+(x3-x2)^2+(y3-y2)^2
 */

package ������;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[][] num = new double[3][2];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				num[i][j] = scanner.nextDouble();
			}
		}
		double l = l(num[0][0], num[0][1], num[1][0], num[1][1]) + l(num[0][0], num[0][1], num[2][0], num[2][1])
				+ l(num[2][0], num[2][1], num[1][0], num[1][1]);
		System.out.format("%.2f\n", l);
		double s = (num[0][0] * num[1][1] + num[1][0] * num[2][1] + num[2][0] * num[0][1] - num[0][0] * num[2][1]
				- num[1][0] * num[0][1] - num[2][0] * num[1][1]) / 2;
		System.out.format("%.2f\n", Math.abs(s));

		double A1 = 2 * (num[1][0] - num[0][0]);
		double B1 = 2 * (num[1][1] - num[0][1]);
		double C1 = Math.pow(num[1][0], 2) + Math.pow(num[1][1], 2) - Math.pow(num[0][0], 2) - Math.pow(num[0][1], 2);
		double A2 = 2 * (num[2][0] - num[1][0]);
		double B2 = 2 * (num[2][1] - num[1][1]);
		double C2 = Math.pow(num[2][0], 2) + Math.pow(num[2][1], 2) - Math.pow(num[1][0], 2) - Math.pow(num[1][1], 2);
		double x = ((C1 * B2) - (C2 * B1)) / ((A1 * B2) - (A2 * B1));
		double y = ((A1 * C2) - (A2 * C1)) / ((A1 * B2) - (A2 * B1));

		System.out.format("%.2f", x);
		System.out.print(" ");
		System.out.format("%.2f\n", y);

		System.out.format("%.2f", (num[0][0] + num[1][0] + num[2][0]) / 3);
		System.out.print(" ");
		System.out.format("%.2f\n", (num[0][1] + num[1][1] + num[2][1]) / 3);
	}

	public static double l(double a, double b, double c, double d) {
		double l = Math.pow(a - c, 2) + Math.pow(b - d, 2);
		return Math.sqrt(l);
	}

}
