/**
��������
�������ž������ѧ�ڵı��ѵ������Ҷ����ַ����Ĳ����Ѿ����յ��൱�����ˡ����죬����ʦ�����һ�´�Ҷ����ַ����������������������ʦ�Լ�������1,2,3,4,5��5�������ֱ�ָ����ͬ��5���ַ�������������Ҫ���ݴ���Ĳ�������������ʦ�Ĺ涨���������ַ������и�ʽת����
��������ʦָ���Ĳ������£�
����1 ��ʾȫ��ת��Ϊ��д��ĸ�������abC ��� ABC
����2 ��ʾȫ��ת��ΪСд��ĸ�������abC���abc
����3 ��ʾ���ַ������������������ abc ��� cba
����4 ��ʾ���ַ����ж�Ӧ�Ĵ�д��ĸת��ΪСд��ĸ���������е�Сд��ĸת��Ϊ��д��ĸ������� abC���ABc
����5��ʾ��ȫ��ת��ΪСд��ĸ�������������е������Ӵ�ת��Ϊ��Ӧ����д��ʽ���������abcD ת��Ϊa-d����Σ�-���ٴ���1����ĸ���������ab������Ҫת��Ϊ��д��ʽ��
�����ʽ
����һ��һ�У��ֱ���ָ����Ӧ���������ֺ��ַ����������Կո�ָ����ַ���ȫ����Ӣ����ĸ���
�����ʽ
�������������������ת�����Ӧ���ַ���
��������
5 ABcdEE
�������
a-ee
���ݹ�ģ��Լ��
���������ַ��������Ϊ200��
 */
package �ַ����任;

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
	 * ��д��Сд��Сд���д
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
	 *	�����ַ�ת��
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
