/**
��д�������书��Ϊ��һ��ʮ������ת��Ϊ���Ӧ�İ˽��������������һ��ʮ�����������øú���ʵ������ת���������Ӧ�İ˽�������
 ��������
 9274
 �������
 22072
��������
 18
 �������
 22
 */
package ʮ������ת�˽�����;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Stack<Integer> reStack = new Stack<Integer>();
		int temp;
		while (n != 0) {
			temp = n % 8;
			reStack.add(temp);
			n = n / 8;
		}
		while (!reStack.isEmpty()) {
			System.out.print(reStack.pop());
		}
	}
}
