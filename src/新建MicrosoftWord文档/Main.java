/**
��������
����L���ڳ��⣬�½���һ��word�ĵ����벻��ȡʲô���֣�����һ�˾��ʣ����������Ŀ�С��½�Microsoft Word�ĵ����𣿡���L��ϲ��һ�����ӣ�˵�����ã��ͽ���������ˡ���
������ϸ�۲죬�����½�һ��word�ĵ�ʱ����õ�һ����Ϊ���½� Microsoft Word �ĵ�.doc�����ļ������½�һ��������Ϊ���½� Microsoft Word �ĵ�(2).doc����
���½������ǡ��½� Microsoft Word �ĵ�(3).doc���������½�����Ų��ϵ����������������½��������ĵ���Ȼ��ɾ���ˡ��½� Microsoft Word �ĵ�(2).doc����
���½����ֻ�õ�һ�����½� Microsoft Word �ĵ�(2).doc����
�����ϸ�˵��Windows��ÿ���½��ĵ�ʱ������ѡȡһ���������ļ���Ų��ظ�����С��������Ϊ���ĵ��ı�š�
��������ģ�����Ϲ��̣�֧���������ֲ���
����New���½�һ��word�ĵ��������½����ĵ��ı��
����Delete id��ɾ��һ�����Ϊid��word�ĵ�������ɾ���Ƿ�ɹ�
������ʼʱһ���ļ���û�У����½� Microsoft Word �ĵ�.doc���ı������1��
�����ʽ
������һ��һ��������n��ʾ����������������n�У�ÿ�б�ʾһ��������������Ϊ��New�������ʾ�½���Ϊ��Delete id�����ʾҪɾ�����Ϊid���ĵ�������idΪһ��������������������˳�����ν��С�
�����ʽ
�������������ÿһ�У�����䷴������������½�����������½����ĵ��ı�ţ�����ɾ������������ɾ���Ƿ�ɹ������ɾ�����ļ����ڣ���ɾ���ɹ��������Successful�������������Failed����
��������
12
New
New
New
Delete 2
New
Delete 4
Delete 3
Delete 1
New
New
New
Delete 4
�������
1
2
3
Successful
2
Failed
Successful
Successful
1
3
4
Successful
���ݹ�ģ��Լ��
���������������������������������1481
����ɾ����ŵ���ֵ������2012
 */
package �½�MicrosoftWord�ĵ�;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String l;
		int id;
		int index;
		int now;
		ArrayList<String> w = new ArrayList<String>();
		while (n > 0) {
			l = scanner.next();
			if (l.equals("New")) {
				if (w.isEmpty()) {
					id = 1;
					w.add(String.valueOf(id));
					System.out.println(String.valueOf(id));
				} else {
					index = Integer.valueOf(w.get(0));
					if (index == 1) {
						for (int i = 1; i < w.size(); i++) {
							now = Integer.valueOf(w.get(i));
							if (now - index > 1) {
								break;
							} else {
								index = now;
							}
						}
						id = index;
						index++;
					} else {
						index = 1;
						id = index-1;
					}
					w.add(id, String.valueOf(index));
					System.out.println(String.valueOf(index));
				}
			} else {
				String obj = scanner.next();
				if (w.remove(obj)) {
					System.out.println("Successful");
				} else {
					System.out.println("Failed");
				}
			}
			n--;
		}
	}
}
