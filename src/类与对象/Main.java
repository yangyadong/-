/**
【﻿题目描述】
实现一个时间类Time。将小时，分钟和秒存储为int型成员变量。要求该类中包含一个构造函数，访问用的函数，
一个推进当前时间的函数adv()，
一个重新设置当前时间（即将当前时间设为00:00:00）的函数reset()
和输出结果函数print()。注意时间按数字式电子表格式显示，即小时、分、秒分别用两位表示，
如果其中之一小于10，则前方补0，如22:01:00（中间不含空格），另外按该格式依次输出时、分、秒后，以endl结尾。
当输入时间超出合法范围（提示：注意上下界）时，请自动按照24小时制进行转换，请务必注意时分秒为负值时的处理，
如输入25:00:61，则输出应为01:01:01，输入-1:-1:-1，应该输出22:58:59。
　　第一步：依据题意定义Time类
　　class Time
　　{
　　// 请补充
　　};
　　第二步：利用如下测试程序对所编写的Time类进行测试。
　　int main()
　　{
　　// 当前时间
　　int hour, minute, second;
　　// 时间增量
　　int incr_hr, incr_min, incr_sec;
　　cin >> hour >> minute >> second >> incr_hr >> incr_min >> incr_sec;
　　Time t( hour, minute, second );
　　t.print();
　　t.adv( incr_hr, incr_min, incr_sec );
　　t.print();
　　t.reset();
　　t.print();
　　return 0;
　　}
输入格式
　　输入一行，6个int类型数字，以空格间隔。
输出格式
　　输出三行时间，时间格式为24小时制，xx:xx:xx，英文标点，不足两位十位数补0。
　　第一行为初始时间，第二行为adv()后的时间，第三行为reset()后的时间
示例1输入
　　0 0 0 0 0 -1
示例1输出
　　00:00:00
　　23:59:59
　　00:00:00
　　示例3：
示例2输入
　　25 63 61 0 0 1
示例2输出
　　02:04:01
　　02:04:02
　　00:00:00
示例3输入
　　-50 -24 0 50 45 90
示例3输出
　　21:36:00
　　00:22:30
　　00:00:00
 */
package 类与对象;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] num = new int[6];
		for (int i = 0; i < 6; i++) {
			num[i] = scanner.nextInt();
		}
		time t = new time(num[0], num[1], num[2]);
		t.adv(num[3], num[4], num[5]);
		t.reset();
	}
	
	static class time{
		private int h,i,s;
		public time(int h,int i,int s) {
			this.h = h;
			this.i = i;
			this.s = s;
			check(h,i,s);
		}
		
		public void adv(int incr_hr,int incr_min,int incr_sec) {
			incr_hr+=h;
			incr_min+=i;
			incr_sec+=s;
			check(incr_hr,incr_min,incr_sec);
		}
		
		public void reset() {
			print(0,0,0);
		}
		
		public void print(int h,int i,int s) {
			System.out.format("%02d:", h);
			System.out.format("%02d:", i);
			System.out.format("%02d", s);
			System.out.println();
		}
		
		public void check(int h,int i,int s) {
			int p_h,p_i,p_s;
			if (s<0) {
				p_s = s/60;
				s = s%60;
				if (s<60) {
					s = 60+s;
					p_s-=1;
				}
				i+=p_s;
			}else {
				p_s = s/60;
				s = s%60;
				i+=p_s;
			}
			
			if (i<0) {
				p_i = i/60;
				i = i%60;
				if (i<60) {
					i = 60+i;
					p_i-=1;
				}
				h+=p_i;
			}else {
				p_i = i/60;
				i = i%60;
				h+=p_i;
			}
			
			if (h<0) {
				h = h%24;
				if (h<24) {
					h = 24+h;
				}
			}else {
				h = h%24;
			}
			
			print(h,i,s);
		}
		
	}
	
}
