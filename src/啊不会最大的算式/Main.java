/**
��������
������Ŀ�ܼ򵥣�����N�����֣����ı����ǵ����λ�ã����м����K���˺ź�N-K-1���Ӻţ����������ӣ�ʹ���ս����������Ϊ�˺źͼӺ�һ������N-1���ˣ�����ǡ��ÿ������������֮�䶼��һ�����š����磺
����N=5��K=2��5�����ֱַ�Ϊ1��2��3��4��5�����Լӳɣ�
����1*2*(3+4+5)=24
����1*(2+3)*(4+5)=45
����(1*2+3)*(4+5)=45
��������
�����ʽ
���������ļ����ж��У���һ��Ϊ�����пո��������������ʾN��K�����У�2<=N<=15, 0<=K<=N-1�����ڶ���Ϊ N���ÿո���������֣�ÿ��������0��9֮�䣩��
�����ʽ
��������ļ���һ�а���һ����������ʾҪ������Ľ��
��������
5 2
1 2 3 4 5
�������
120
����˵��
����(1+2+3)*4*5=120
 */
package ������������ʽ;

import java.util.Scanner;

public class Main {

	static int n;
	static int[] num;
	static long[][] res;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		int k = scanner.nextInt();
		num = new int[n+1];
		res = new long[n+1][k+1];
		int tmp;
		for (int i = 1; i <= n; i++) {
			tmp = scanner.nextInt();
			num[i] = num[i-1]+tmp;
			res[i][0] = num[i];
		}
		for (int i = 2; i <= n; i++) {
			tmp = Math.min(i-1, k);
			for(int j=1;j<=tmp;j++)//�˺ŵĸ���
	            for(int l=2;l<=i;l++)//���һ���˺ŵ�λ�ã�ע���2��ʼ
	                res[i][j]=Math.max(res[i][j],res[l-1][j-1]*(num[i]-num[l-1]));
		}
		System.out.println(res[n][k]);
	}
	
}
