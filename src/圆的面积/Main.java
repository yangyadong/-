package Բ�����;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		int r = Scanner.nextInt();
		double �� = 3.14159265358979323;
		double s = ��*Math.pow(r, 2);
		System.out.println(String.format("%1$.7f", s));//�����������
	}
}
