/**
 * ��n������վ��һȦ���ӵ�һ�����ӿ�ʼ˳ʱ�뷽������
 * ����3���˳��У���һ���˼�����1������
 * ֱ�����ʣ��һ������Ϊֹ����ʣ�µڼ������ӡ�
 */
package n�����ӱ���3����;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int  n = scanner.nextInt();
		Boolean[] pro = new Boolean[n];
		int sum = n;//ʣ�ຢ����
		int k = 0;//��ʾ�ڼ������ӡ�0����ʾ��һ����
		int num = 1;//������
		while (sum!=1) {
			if(num==3){
				pro[k]=true;
				sum--;
				num = 1;
			}else {
				num++;
			}
			k=((k+1)+n)%n;
			while (!(pro[k]==null||!pro[k])) {
				k=((k+1)+n)%n;
			}
		}
		System.out.println(k+1);
	}

}
