/**
 * 从左到右 A  B  C 柱 大盘子在下, 小盘子在上, 借助B柱将所有盘子从A柱移动到C柱,
 *  期间只有一个原则: 大盘子只能在小盘子的下面.
 * */

package 汉诺塔;

import java.util.Scanner;

public class Main {

	static int step=0;
	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		int num = Scanner.nextInt();
		core(num,'A','B','C');
		System.out.println("共"+step+"步");
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
		System.out.println("第"+step+"步 from "+from+" to "+to);
	}
}
