/**
��������
����Ħ��˹�������롣���������ֽ̲ĵ�213ҳ����6.5��Ҫ������Ħ��˹�룬����Ӣ�ġ��벻Ҫʹ��"zylib.h"��ֻ��ʹ�ñ�׼�⺯������' * '��ʾ' . '���м�ո���' | '��ʾ��ֻת���ַ���

����Ħ��˹�붨�����http://baike.baidu.com/view/84585.htm?fromId=253988��


��ʾ
������Ƚ�������ʱ����������EOF��β�ģ������ǻ��з�����EOF����һ���ַ�������EOF��β����һ��ͨ�׵����Ͻ���˵��������˿���ͨ�����·�ʽ֮һ��ȡ���룺

����1. һ�ζ��������ַ������ٽ��к���������

����2. ʹ��getchar��scanfһ�ζ���һ���ַ���ͨ�����ǵķ���ֵ�ж����������
�������

 */
package Ħ��˹����;

import java.util.Scanner;

public class Main {
	private static String[][] strings = {
			{"*-","a"},{"-***","b"},{"-*-*","c"},{"-**","d"},{"*","e"},{"**-*","f"},{"--*","g"},
			{"****","h"},{"**","i"},{"*---","j"},{"-*-","k"},{"*-**","l"},{"--","m"},{"-*","n"},
			{"---","o"},{"*--*","p"},{"--*-","q"},{"*-*","r"},{"***","s"},{"-","t"},{"**-","u"},
			{"***-","v"},{"*--","w"},{"-**-","x"},{"-*--","y"},{"--**","z"},
	};
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		String[] res = string.split("\\|");
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < strings.length; j++) {
				if (res[i].equals(strings[j][0])) {
					System.out.print(strings[j][1]);
					break;
				}
			}
		}
	}
}
