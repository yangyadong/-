/**
��������
������ӡ����100��999֮���ˮ�ɻ�������νˮ�ɻ�����ָ�������λ����������Ϊ�����ֱ�������������� 153=1^3+5^3+3^3��
��������
һ��������ĿҪ������뷶����
����
��
�������
153
370
371
407
 */
package ˮ�ɻ���;

public class Main {
	public static void main(String[] args) {
		for (int i = 100; i <= 999; i++) {
			check(i);
		}
	}
	
	public static void check(int k) {
		int sum = 0;
		sum += Math.pow(k%10,3);
		sum += Math.pow((k/10)%10,3);
		sum += Math.pow(k/100,3);
		if (sum==k) {
			System.out.println(k);
		}
	}
}
