/**
 问题描述
　　有些西方人比较迷信，如果某个月的13号正好是星期五，他们就会觉得不太吉利，用古人的说法，就是“诸事不宜”。请你编写一个程序，统计出在某个特定的年份中，出现了多少次既是13号又是星期五的情形，以帮助你的迷信朋友解决难题。
　　说明：（1）一年有365天，闰年有366天，所谓闰年，即能被4整除且不能被100整除的年份，或是既能被100整除也能被400整除的年份；（2）已知1998年1月1日是星期四，用户输入的年份肯定大于或等于1998年。
　　输入格式：输入只有一行，即某个特定的年份（大于或等于1998年）。
　　输出格式：输出只有一行，即在这一年中，出现了多少次既是13号又是星期五的情形。
输入输出样例
样例输入
1998
样例输出
3
 */
package 黑色星期五;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int next = 4;//1998.1.1星期四【初始】
		for (int i = 1998; i < t; i++) {
			int day = 365;
			if ((i%4==0&&i%100!=0)||(i%100==0&&i%400==0)) {
				day = 366;
			}
			next=(day%7+next)%7;
		}
		int sum = 0;
		next=(12%7+next)%7;
		if(next==5){
			sum++;
		}
		for (int i = 1; i < 12; i++) {
			if(i==1||i==3||i==5||i==7||i==8||i==10){
				next=(31%7+next)%7;
			}else if (i==2) {
				if((t%4==0&&t%100!=0)||(t%100==0&&t%400==0)){
					next=(29%7+next)%7;
				}else{
					next=(28%7+next)%7;
				}
			}else{
				next=(30%7+next)%7;
			}
			if(next==5){
				sum++;
			}
		}
		System.out.println(sum);
	}

}
