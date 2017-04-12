/**
输入一个百分制的成绩t后，按下式输出它的等级。等级为：90~100为A，80~89为B，70~79为C，60~69为D，0~59为E。
样例输入
98
样例输出
A
 */
package 成绩的等级输出;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float n = scanner.nextFloat();
		String reString = null;
		if (0<=n&&n<=59) {
			reString = "E";
		}else if (n<=69) {
			reString = "D";
		}else if (n<=79) {
			reString = "C";
		}else if (n<=89) {
			reString = "B";
		}else if (n<=100) {
			reString = "A";
		}
		System.out.println(reString);
	}
}
