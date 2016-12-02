/**
 * ������ A  B  C �� ����������, С��������, ����B�����������Ӵ�A���ƶ���C��,
 *  �ڼ�ֻ��һ��ԭ��: ������ֻ����С���ӵ�����.
 * */

package ��ŵ��;

import java.util.Scanner;

public class Main {

	static int step=0;
	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		int num = Scanner.nextInt();
		core(num,'A','B','C');
		System.out.println("��"+step+"��");
	}

	public static void core(int n,char A,char B,char C) {
		if (n == 1) {
			move(A, C);
		}else{
			core(n-1,A,C,B);
			move(A, C);
			core(n-1, B, A, C);
		}
	}
	
	public static void move(char from,char to) {
		step++;
		System.out.println("��"+step+"�� from "+from+" to "+to);
	}
}
