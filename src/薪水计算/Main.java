/**
问题描述
　　编写一个程序，计算员工的周薪。薪水的计算是以小时为单位，如果在一周的时间内，员工工作的时间不超过40 个小时，那么他/她的总收入等于工作时间乘以每小时的薪水。如果员工工作的时间在40 到50 个小时之间，那么对于前40 个小时，仍按常规方法计算；而对于剩余的超额部分，每小时的薪水按1.5 倍计算。如果员工工作的时间超过了50 个小时，那么对于前40 个小时，仍按常规方法计算；对于40～50 个小时之间的部分，每小时的薪水按1.5 倍计算；而对于超出50 个小时的部分，每小时的薪水按2 倍计算。请编写一个程序，输入员工的工作时间和每小时的薪水，然后计算并显示他/她应该得到的周薪。
　　输入格式：输入只有一行，包括一个整数和一个实数，分别表示工作时间和每小时薪水。
　　输出格式：输出只有一个实数，表示周薪，保留小数点后2位。
　　输入输出样例
样例输入
40 50
样例输出
2000.00
 */
package 薪水计算;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int time = scanner.nextInt();
		double money = scanner.nextDouble();
		double res = 0;
		if (time<=40) {
			res = time*money;
		}else if (time<=50) {
			res = 40*money+(time-40)*money*1.5;
		}else {
			res = 40*money+10*money*1.5+(time-50)*money*2;
		}
		System.out.format("%.2f",res);
	}
}
