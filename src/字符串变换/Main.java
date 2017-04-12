/**
问题描述
　　相信经过这个学期的编程训练，大家对于字符串的操作已经掌握的相当熟练了。今天，徐老师想测试一下大家对于字符串操作的掌握情况。徐老师自己定义了1,2,3,4,5这5个参数分别指代不同的5种字符串操作，你需要根据传入的参数，按照徐老师的规定，对输入字符串进行格式转化。
　　徐老师指定的操作如下：
　　1 表示全部转化为大写字母输出，如abC 变成 ABC
　　2 表示全部转换为小写字母输出，如abC变成abc
　　3 表示将字符串整个逆序输出，如 abc 变成 cba
　　4 表示将字符串中对应的大写字母转换为小写字母，而将其中的小写字母转化为大写字母输出，如 abC变成ABc
　　5表示将全部转换为小写字母，并将其中所有的连续子串转换为对应的缩写形式输出，比如abcD 转换为a-d，其次，-至少代表1个字母，既如果是ab，则不需要转换为缩写形式。
输入格式
　　一共一行，分别是指代对应操作的数字和字符串，两者以空格分隔，字符串全部由英文字母组成
输出格式
　　输出根据上述规则转换后对应的字符串
样例输入
5 ABcdEE
样例输出
a-ee
数据规模和约定
　　输入字符串长度最长为200。
 */
package 字符串变换;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String reString = scanner.next();
		String rString = null;
		switch (n) {
		case 1:
			rString = reString.toUpperCase();
			break;
		case 2:
			rString = reString.toLowerCase();
			break;
		case 3:
			rString = new StringBuffer(reString).reverse().toString();
			break;
		case 4:
			rString = change(reString);
			break;
		case 5:
			test(reString);
			return;
		}
		System.out.println(rString);
	}
	
	/**
	 * 大写变小写，小写变大写
	 * @param str
	 * @return
	 */
	public static String change(String str) {
		StringBuffer sBuffer = new StringBuffer(str);
		int num;
		for (int i = 0; i < sBuffer.length(); i++) {
			num = sBuffer.charAt(i);
			if (num<=90) {
				sBuffer.setCharAt(i, (char)(num+32));
			}else {
				sBuffer.setCharAt(i, (char)(num-32));
			}
		}
		return sBuffer.toString();
	}
	
	/**
	 *	连续字符转换
	 * @param str
	 * @return
	 */
	public static void test(String string){
		string = new StringBuffer(string.toLowerCase()).toString();
	    char[] str = string.toCharArray();
	    int flag = 0;
	    System.out.print(str[0]);
	    for (int i = 1; i < str.length; i++) {
	        while (i < str.length && str[i] - str[i-1] == 1) {
	            flag++;
	            i++;
	        }
	        if (flag > 1) {
	        	System.out.print("-"+str[--i]);
	        } else if(i==str.length){
	        	System.out.print(str[i-1]);
	        }else {
	        	System.out.print(str[i]);
			}
	        flag = 0;
	    }
	    System.out.println();
	}
	
}
