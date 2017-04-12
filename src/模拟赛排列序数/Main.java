/**
标题： 排列序数
X星系的某次考古活动发现了史前智能痕迹。
这是一些用来计数的符号，经过分析它的计数规律如下：
（为了表示方便，我们把这些奇怪的符号用a~q代替）
abcdefghijklmnopq 表示0
abcdefghijklmnoqp 表示1
abcdefghijklmnpoq 表示2
abcdefghijklmnpqo 表示3
abcdefghijklmnqop 表示4
abcdefghijklmnqpo 表示5
abcdefghijklmonpq 表示6
abcdefghijklmonqp 表示7
.....
在一处石头上刻的符号是：
bckfqlajhemgiodnp
请你计算出它表示的数字是多少？
请提交该整数，不要填写任何多余的内容，比如说明或注释。
 */
package 模拟赛排列序数;

public class Main {
	static char[] res;
	static int[] flag;
	public static void main(String[] args) {
		//康托展开
		res = "bckfqlajhemgiodnp".toCharArray();
		flag = new int[res.length];
		long num = 0;
		int k;
		for (int i = 0; i < res.length; i++) {
			k = (res.length - 1) - i;
				num += index(res[i]-97) * sum(k);
		}
		System.out.println(num);
		System.out.println(sum(17));
	}

	public static int index(int b) {
		int sum = 0;
	    for (int i = 0; i < b; i++)
	        if (flag[i] == 0)sum++;
	    flag[b] = 1;
	    return sum;
	}
	
	public static long sum(int k) {
		long sum = 1;
		for (int i = 1; i <= k; i++) {
			sum *= i;
		}
		return sum;
	}

}
//22952601027516
//24449163328390
