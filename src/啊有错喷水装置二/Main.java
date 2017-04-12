/**
描述
有一块草坪，横向长w,纵向长为h,在它的橫向中心线上不同位置处装有n(n<=10000)个点状的喷水装置，每个喷水装置i喷水的效果是让以它为中心半径为Ri的圆都被润湿。请在给出的喷水装置中选择尽量少的喷水装置，把整个草坪全部润湿。
输入
第一行输入一个正整数N表示共有n次测试数据。
每一组测试数据的第一行有三个整数n,w,h，n表示共有n个喷水装置，w表示草坪的横向长度，h表示草坪的纵向长度。
随后的n行，都有两个整数xi和ri,xi表示第i个喷水装置的的横坐标（最左边为0），ri表示该喷水装置能覆盖的圆的半径。
输出
每组测试数据输出一个正整数，表示共需要多少个喷水装置，每个输出单独占一行。
如果不存在一种能够把整个草坪湿润的方案，请输出0。
样例输入
2
2 8 6
1 1
4 5
2 10 6
4 5
6 5
样例输出
1
2
 */
package 啊有错喷水装置二;

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
		//进行比较  
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
