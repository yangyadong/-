/**
����һ���ٷ��Ƶĳɼ�t�󣬰���ʽ������ĵȼ����ȼ�Ϊ��90~100ΪA��80~89ΪB��70~79ΪC��60~69ΪD��0~59ΪE��
��������
98
�������
A
 */
package �ɼ��ĵȼ����;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float n = scanner.nextFloat();
		String reString = null;
		if (0<=n&&n<=59) {
			reString = "E";
		}else if (n<=69) {
			reString = "D";
		}else if (n<=79) {
			reString = "C";
		}else if (n<=89) {
			reString = "B";
		}else if (n<=100) {
			reString = "A";
		}
		System.out.println(reString);
	}
}
