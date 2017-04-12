/**
标题：字符串比较

我们需要一个新的字符串比较函数compare(s1, s2).
对这个函数要求是：
1. 它返回一个整数，表示比较的结果。
2. 结果为正值，则前一个串大，为负值，后一个串大，否则，相同。
3. 结果的绝对值表示：在第几个字母处发现了两个串不等。

下面是代码实现。对题面的数据，结果为：
-3
2
5
 */
package 模拟赛字符串比较;

public class Main {
	static int compare(String s1, String s2) {
		if (s1 == null && s2 == null)
			return 0;
		if (s1 == null)
			return -1;
		if (s2 == null)
			return 1;

		if (s1.isEmpty() && s2.isEmpty())
			return 0;
		if (s1.isEmpty())
			return -1;
		if (s2.isEmpty())
			return 1;

		char x = s1.charAt(0);
		char y = s2.charAt(0);

		if (x < y)
			return -1;
		if (x > y)
			return 1;

		int t = compare(s1.substring(1), s2.substring(1));
		if (t == 0)
			return 0;

		return t > 0 ? (t + 1) : (t - 1); // 填空位置
	}

	public static void main(String[] args) {
		System.out.println(compare("abc", "abk"));
		System.out.println(compare("abc", "a"));
		System.out.println(compare("abcde", "abcda"));
	}
}
