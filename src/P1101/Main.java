/**
��һ�����������������Ŀ�У���Ʒ����MC�������ۣ�DJ����������SL��������һ���ṹ��prut�����Ա��������������ݡ����������ж���һ��prut���͵Ľṹ�����飬����ÿ��Ԫ�ص�ֵ�����㲢�����������ܽ�
���������ʽ����һ�������������N(N<100)��������ÿһ����һ���������Ʒ���ǳ��Ȳ�����100���ַ���������Ϊdouble���ͣ�����Ϊ���͡�
���������ʽ��double���͵��ܽ�
���룺
����4
����book 12.5 3
����pen 2.5 10
����computer 3200 1
����flower 47 5

�����
����3497.500000

 */
package P1101;

import java.util.Scanner;

public class Main {
	
	public static class prut{
		private String name;
		private double dj;
		private int num;
		public prut(String name,double dj,int num) {
			this.setName(name);
			this.setDj(dj);
			this.setNum(num);
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getDj() {
			return dj;
		}
		public void setDj(double dj) {
			this.dj = dj;
		}
		public int getNum() {
			return num;
		}
		public void setNum(int num) {
			this.num = num;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String name;
		double dj;
		int num;
		prut[] prut = new prut[n];
		prut good;
		for (int i = 0; i < n; i++) {
			name = scanner.next();
			dj = scanner.nextDouble();
			num = scanner.nextInt();
			good = new prut(name, dj, num);
			prut[i] = good;
		}
		double res=0;
		for (int i = 0; i < prut.length; i++) {
			res += prut[i].getNum()*prut[i].getDj();
		}
		System.out.format("%.6f", res);
	}
	
}
