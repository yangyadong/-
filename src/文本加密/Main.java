/**
��������
�����ȱ�д����EncryptChar,�����������򽫸������ַ�cת�������ܣ�Ϊ�µ��ַ���"A"ת��"B"��"B"ת��Ϊ"C"��... ..."Z"ת��Ϊ"a"��"a"ת��Ϊ"b",... ..., "z"ת��Ϊ"A"�������ַ������ܡ���д���򣬼��ܸ����ַ�����
�������
����������������Ӧ�������
����
helloWorld!
ifmmpXpsme!
���ݹ�ģ��Լ��
��������������ÿһ�����ķ�Χ��
��������50���ַ������޿ո��ַ�����
 */
package �ı�����;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] cs = scanner.nextLine().toCharArray();
		char res; 
		int num;
		for (int i = 0; i < cs.length; i++) {
			num = cs[i];
			if ((num < 90 && num >= 65) || (num < 122 && num >= 97)) {
				res = (char)(num+1);
			}else if (num == 90) {
				res = 'a';
			}else if (num == 122) {
				res = 'A';
			}else {
				res = (char)num;
			}
			System.out.print(res);
		}
	}
}
