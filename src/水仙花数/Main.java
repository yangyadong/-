/**
问题描述
　　打印所有100至999之间的水仙花数。所谓水仙花数是指满足其各位数字立方和为该数字本身的整数，例如 153=1^3+5^3+3^3。
样例输入
一个满足题目要求的输入范例。
例：
无
样例输出
153
370
371
407
 */
package 水仙花数;

public class Main {
	public static void main(String[] args) {
		for (int i = 100; i <= 999; i++) {
			check(i);
		}
	}
	
	public static void check(int k) {
		int sum = 0;
		sum += Math.pow(k%10,3);
		sum += Math.pow((k/10)%10,3);
		sum += Math.pow(k/100,3);
		if (sum==k) {
			System.out.println(k);
		}
	}
}
