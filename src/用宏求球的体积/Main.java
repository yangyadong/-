/**
��������
����ʹ�ú�ʵ�ּ�����������Ĺ��ܡ��û�����뾶��ϵͳ������������ʹ�ú�����pi=3.1415926,�����ȷ��С�������λ��
��������
һ��������ĿҪ������뷶����
����
1.0
�������
����������������Ӧ�������
����
1.0
�����4.18879
���ݹ�ģ��Լ��
��������������ÿһ�����ķ�Χ��
�������ݱ�ʾ����double���͡�
 */
package �ú���������;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double pi = 3.1415926;
		Scanner scanner = new Scanner(System.in);
		double r = scanner.nextDouble();
		double res = Math.pow(r, 3)*pi*4/3;
		System.out.format("%.5f", res);
	}
}
