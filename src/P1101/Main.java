/**
有一份提货单，其数据项目有：商品名（MC）、单价（DJ）、数量（SL）。定义一个结构体prut，其成员是上面的三项数据。在主函数中定义一个prut类型的结构体数组，输入每个元素的值，计算并输出提货单的总金额。
　　输入格式：第一行是数据项个数N(N<100)，接下来每一行是一个数据项。商品名是长度不超过100的字符串，单价为double类型，数量为整型。
　　输出格式：double类型的总金额。
输入：
　　4
　　book 12.5 3
　　pen 2.5 10
　　computer 3200 1
　　flower 47 5

输出：
　　3497.500000

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
