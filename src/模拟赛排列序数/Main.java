/**
���⣺ ��������
X��ϵ��ĳ�ο��Ż������ʷǰ���ܺۼ���
����һЩ���������ķ��ţ������������ļ����������£�
��Ϊ�˱�ʾ���㣬���ǰ���Щ��ֵķ�����a~q���棩
abcdefghijklmnopq ��ʾ0
abcdefghijklmnoqp ��ʾ1
abcdefghijklmnpoq ��ʾ2
abcdefghijklmnpqo ��ʾ3
abcdefghijklmnqop ��ʾ4
abcdefghijklmnqpo ��ʾ5
abcdefghijklmonpq ��ʾ6
abcdefghijklmonqp ��ʾ7
.....
��һ��ʯͷ�Ͽ̵ķ����ǣ�
bckfqlajhemgiodnp
������������ʾ�������Ƕ��٣�
���ύ����������Ҫ��д�κζ�������ݣ�����˵����ע�͡�
 */
package ģ������������;

public class Main {
	static char[] res;
	static int[] flag;
	public static void main(String[] args) {
		//����չ��
		res = "bckfqlajhemgiodnp".toCharArray();
		flag = new int[res.length];
		long num = 0;
		int k;
		for (int i = 0; i < res.length; i++) {
			k = (res.length - 1) - i;
				num += index(res[i]-97) * sum(k);
		}
		System.out.println(num);
		System.out.println(sum(17));
	}

	public static int index(int b) {
		int sum = 0;
	    for (int i = 0; i < b; i++)
	        if (flag[i] == 0)sum++;
	    flag[b] = 1;
	    return sum;
	}
	
	public static long sum(int k) {
		long sum = 1;
		for (int i = 1; i <= k; i++) {
			sum *= i;
		}
		return sum;
	}

}
//22952601027516
//24449163328390
