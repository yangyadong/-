package ���Լ��and��С������;

import java.util.Scanner;

public interface Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		System.out.println("���Լ��"+maxCommonDivisor(m, n));
		System.out.println("��С������"+minCommonMultiple(m, n));
	}

	//�����Լ����һ
	public static int maxCommonDivisor(int m,int n) {
		if(m<n){
			int temp = n;
			n = m;
			m = temp;
		}
		while (m%n!=0) {
			int temp = m%n;
			m = n;
			n = temp;
		}
		return n;
	}

	//�����Լ������
	public static int maxCommonDivisor2(int m,int n) {
		if(m<n){
			int temp = n;
			n = m;
			m = temp;
		}
		if(m%n==0){
			return n;
		}else {
			return maxCommonDivisor2(m, n);
		}
	}

	//����С������
	public static int minCommonMultiple(int m,int n) {
		return m*n/maxCommonDivisor(m, n);
	}

}
