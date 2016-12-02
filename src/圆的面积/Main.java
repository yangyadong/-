package 圆的面积;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		int r = Scanner.nextInt();
		double π = 3.14159265358979323;
		double s = π*Math.pow(r, 2);
		System.out.println(String.format("%1$.7f", s));//控制输出长度
	}
}
