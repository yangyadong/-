/**
��������
����Anagramsָ���Ǿ����������Ե��������ʣ������������ʵ��У�ÿһ��Ӣ����ĸ�������ִ�Сд�������ֵĴ���������ͬ�ġ����磬��Unclear���͡�Nuclear������Rimon���͡�MinOR������Anagrams����дһ�����������������ʣ�Ȼ���ж�һ�£������������Ƿ���Anagrams��ÿһ�����ʵĳ��Ȳ��ᳬ��80���ַ��������Ǵ�Сд�޹صġ�
���������ʽ�����������У��ֱ�Ϊ�������ʡ�
���������ʽ�����ֻ��һ����ĸY��N���ֱ��ʾYes��No��
���������������
��������
Unclear
Nuclear
�������
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
