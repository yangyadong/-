/**
 ��������
�������һ����Ȼ��������С�����������֮�͵��ڸ��������Ϊ����������㷨����ӡ1-9999֮�������������
�������
����������������Ӧ�������
����
6
...
....
���ݹ�ģ��Լ��
����1-9999
 */
package ������;

public class Main {
	public static void main(String[] args) {
		for (int i = 1; i <= 9999; i++) {
			check(i);
		}
	}
	public static void check(int n) {
		int sum = 0;
		for (int i = 1; i <= n/2; i++) {
			if(n%i==0){
				sum+=i;
			}
		}
		if(sum==n){
			System.out.println(n);
		}
	}
}
