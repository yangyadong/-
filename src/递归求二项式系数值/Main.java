/** 
��������

��������
һ��������ĿҪ������뷶����
3 10
�������
����������������Ӧ�������
120
���ݹ�ģ��Լ��
��������������ÿһ�����ķ�Χ��
�������������int��ʾʱ���������
 */
package �ݹ������ʽϵ��ֵ;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		int n = scanner.nextInt();
		if(k==0||k==n){
			System.out.print(1);
		}else {
			System.out.print(sum(n-1, k)+sum(n-1, k-1));
		}
	}
	
	public static int sum(int m,int n) {
		int x=1;
		int y=1;
		for (int i = n; i > 0; i--) {
			x *=m;
			m--;
			y *=i;
		}
		return x/y;
	}
	
}
