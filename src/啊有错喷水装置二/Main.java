/**
����
��һ���ƺ������w,����Ϊh,�����ęM���������ϲ�ͬλ�ô�װ��n(n<=10000)����״����ˮװ�ã�ÿ����ˮװ��i��ˮ��Ч����������Ϊ���İ뾶ΪRi��Բ������ʪ�����ڸ�������ˮװ����ѡ�����ٵ���ˮװ�ã���������ƺȫ����ʪ��
����
��һ������һ��������N��ʾ����n�β������ݡ�
ÿһ��������ݵĵ�һ������������n,w,h��n��ʾ����n����ˮװ�ã�w��ʾ��ƺ�ĺ��򳤶ȣ�h��ʾ��ƺ�����򳤶ȡ�
����n�У�������������xi��ri,xi��ʾ��i����ˮװ�õĵĺ����꣨�����Ϊ0����ri��ʾ����ˮװ���ܸ��ǵ�Բ�İ뾶��
���
ÿ������������һ������������ʾ����Ҫ���ٸ���ˮװ�ã�ÿ���������ռһ�С�
���������һ���ܹ���������ƺʪ��ķ����������0��
��������
2
2 8 6
1 1
4 5
2 10 6
4 5
6 5
�������
1
2
 */
package ���д���ˮװ�ö�;

import java.util.Scanner;

public class Main {
	static Scanner scanner;
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		while (n>=1) {
			check();
			n--;
		}
	}
	
	public static void check() {
		int n = scanner.nextInt();
		double L = scanner.nextDouble();
		double w = scanner.nextDouble();
		double[][] num = new double[n][2];
		double z,r;
		double l;
		for (int i = 0; i < n; i++) {
			z = scanner.nextDouble();
			r = scanner.nextDouble();
			if (r>w/2) {
				l = Math.sqrt(Math.pow(r, 2)-Math.pow(w/2, 2));
				num[i][0] = z-l;
				num[i][1] = z+l;
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				if (num[j][0]<num[i][0]) {
					num[i][0] = num[j][0];
					num[i][1] = num[j][1];
				}
			}
		}
		//���бȽ�  
        double end=0.0;  
        int count=0;  
        while(end<L) {
            double m=0.0;
            for(int i=0;i< n && num[i][0] <= end;i++) {  
                if(num[i][1]-end>m) m=num[i][1]-end;  
            }  
            if(m!=0) {
                count++;  
                end+=m;
            } else 
            	break;  
        }
		
		if (end<L) {
			System.out.println(0);
		}else {
			System.out.println(count);
		}
	}
	
}
