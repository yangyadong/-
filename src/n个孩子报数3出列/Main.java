/**
 * 有n个孩子站成一圈，从第一个孩子开始顺时针方向报数，
 * 报到3的人出列，下一个人继续从1报数，
 * 直到最后剩下一个孩子为止。问剩下第几个孩子。
 */
package n个孩子报数3出列;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int  n = scanner.nextInt();
		Boolean[] pro = new Boolean[n];
		int sum = n;//剩余孩子数
		int k = 0;//表示第几个孩子【0：表示第一个】
		int num = 1;//报的数
		while (sum!=1) {
			if(num==3){
				pro[k]=true;
				sum--;
				num = 1;
			}else {
				num++;
			}
			k=((k+1)+n)%n;
			while (!(pro[k]==null||!pro[k])) {
				k=((k+1)+n)%n;
			}
		}
		System.out.println(k+1);
	}

}
