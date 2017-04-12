/**
 问题描述
　　如果一个自然数的所有小于自身的因子之和等于该数，则称为完数。设计算法，打印1-9999之间的所有完数。
样例输出
与上面的样例输入对应的输出。
例：
6
...
....
数据规模和约定
　　1-9999
 */
package 求完数;

public class Main {
	public static void main(String[] args) {
		for (int i = 1; i <= 9999; i++) {
			check(i);
		}
	}
	public static void check(int n) {
		int sum = 0;
		for (int i = 1; i <= n/2; i++) {
			if(n%i==0){
				sum+=i;
			}
		}
		if(sum==n){
			System.out.println(n);
		}
	}
}
