/**
问题描述
　　Anagrams指的是具有如下特性的两个单词：在这两个单词当中，每一个英文字母（不区分大小写）所出现的次数都是相同的。例如，“Unclear”和“Nuclear”、“Rimon”和“MinOR”都是Anagrams。编写一个程序，输入两个单词，然后判断一下，这两个单词是否是Anagrams。每一个单词的长度不会超过80个字符，而且是大小写无关的。
　　输入格式：输入有两行，分别为两个单词。
　　输出格式：输出只有一个字母Y或N，分别表示Yes和No。
　　输入输出样例
样例输入
Unclear
Nuclear
样例输出
Y
 */

package Anagrams;

import java.util.Scanner;

public class Main {
	static int[][] res = new int[26][2];
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] a = scanner.nextLine().toLowerCase().toCharArray();
		char[] b = scanner.nextLine().toLowerCase().toCharArray();
		System.out.println(check(a, b));
	}
	
	public static String check(char[] a,char[] b) {
		String reString = "N";
		if(a.length==b.length){
			for (int i = 0; i < a.length; i++) {
				int x = a[i]-97;
				res[x][0]++;
				int y = b[i]-97;
				res[y][1]++;
			}
			for (int i = 0; i < 26; i++) {
				if (res[i][0]!=res[i][1]) {
					break;
				}else if(i==25){
					reString = "Y";
				}
			}
		}
		return reString;
	}
	
}
