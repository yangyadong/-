/**
问题描述
　　Given two integers A and B, your task is to output their sum, A+B.
输入格式
　　The input contains of only one line, consisting of two integers A and B. (0 ≤ A,B ≤ 1 000)
输出格式
　　The output should contain only one number that is A+B.
样例输入
1 1
样例输出
2
 */

package a加b;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		int A = Scanner.nextInt();
		int B = Scanner.nextInt();
		System.out.println(A+B);
	}
}
