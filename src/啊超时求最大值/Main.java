/**
 ��������
������n������������ai bi������Ҫѡ��һЩ������ ʹ��������ѡ��������ai+bi�ĺ���󡣲���Ҫ����ѡ�������Ե�ai֮�ͷǸ���bi֮�ͷǸ���
�����ʽ
��������ĵ�һ��Ϊn�����Եĸ���
��������n��ÿ���������� ai bi
�����ʽ
���������ѡ�������Ե�ai+bi֮��
��������
5
-403 -625
-847 901
-624 -708
-293 413
886 709
�������
1715
 */
package ����ʱ�����ֵ;

import java.util.Scanner;

public class Main {
	static int res;
	static int[] a;
	static int[] b;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		a = new int[n];
		b = new int[n];
		for (int i = 0; i <n ; i++) {
			a[i] = scanner.nextInt();
			b[i] = scanner.nextInt();
		}
		System.out.println(dp(0,0,n-1));
	}
	
	public static int dp(int x,int y,int n) {
		int ret;
		if(n==0)
			if(x+a[n]>=0&&y+b[n]>=0&&a[n]+b[n]>0)
				ret=a[n]+b[n];
			else
				ret=0;
		else if(a[n]+b[n]>0&&x+a[n]>=0&&y+b[n]>=0)
			ret=Math.max(dp(x,y,n-1),dp(x+a[n],y+b[n],n-1)+a[n]+b[n]);
		else
			ret=dp(x,y,n-1);
		return ret;
	}
}
