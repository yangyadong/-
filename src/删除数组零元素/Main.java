/**
 �Ӽ��̶���n���������������У���д����CompactIntegers��ɾ������������ֵΪ0��Ԫ�أ����Ԫ���������׶��ƶ���ע�⣬CompactIntegers������Ҫ�������鼰��Ԫ�ظ�����Ϊ��������������ֵӦΪɾ������ִ�к��������Ԫ�ظ��������ɾ����������Ԫ�صĸ����������������Ԫ�ء�
��������: �������ʽ˵����5Ϊ�������ݵĸ�����3 4 0 0 2 ���Կո������5��������
5 
3 4 0 0 2
�������:�������ʽ˵����3Ϊ�������ݵĸ�����3 4 2 ���Կո������3������������
3
3 4 2
��������: 
7
0 0 7 0 0 9 0
�������:
2
7 9
��������: 
3
0 0 0
�������:
0
 */

package ɾ��������Ԫ��;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		ArrayList<Integer> num = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int k = scanner.nextInt();
			if (k != 0) {
				num.add(k);
			}
		}
		CompactIntegers(num,num.size());
	}

	public static void CompactIntegers(ArrayList<Integer> num,int n) {
		if(n==0){
			System.out.print(0);
		}else{
			System.out.println(n);
			for (int i = 0; i < n; i++) {
				System.out.print(num.get(i) + " ");
			}
		}
	}
}
