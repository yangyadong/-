/**
��������
��������ϲ�������£��������ҵ��������ǽ�һЩ����ǰ����ɽ��ɽ�������������и��Ϻ��и�С���н����£�����ʲô�أ���ǰ����ɽ����������ѭ���Ĺ������������ҡ�
�������Ƕ��壬���һ���ַ�������һ������һ�����ϵĳ���Ϊk���ظ��ַ��������ӳɵģ���ô����ַ����ͽ�������Ϊk�Ĵ���
��������:
�����ַ�����abcabcabcabc������Ϊ3����Ϊ������4��ѭ����abc����ɵġ���ͬ������6Ϊ���ڣ������ظ��ġ�abcabc��������12Ϊ���ڣ�һ��ѭ����abcabcabcabc������
����������������������Ѵ����ת�����轲�Ĺ��£������дһ�����򣬿��Բⶨһ���ַ�������С���ڡ�
�����ʽ
����һ����󳤶�Ϊ100���޿ո���ַ�����
�����ʽ
����һ����������ʾ������ַ�������С���ڡ�
��������
HaHaHa
�������
2
��������
Return0
�������
7
 */
package �����ִ�;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		int num = str.length();
		String res, temp;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				res = str.substring(0, i);
				for (int j = 0; j < num; j += i) {
					temp = str.substring(j, j + i);
					if (!res.equals(temp)) {
						break;
					} else if (j + i == num) {
						System.out.println(i);
						return;
					}
				}
			}
		}
		System.out.println(num);
	}
}
