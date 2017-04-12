/**
问题描述
　　这里写问题描述。
　　打印出1-1000所有11和17的公倍数。
样例输入
一个满足题目要求的输入范例。
例：
无
样例输出
与上面的样例输入对应的输出。
例：
每个结果站一行
 */
package 找公倍数;

public class Main {
	public static void main(String[] args) {
		for (int i = 1; i <= 1000; i++) {
			if(i%11==0 && i%17==0){
				System.out.println(i);
			}
		}
	}
}
