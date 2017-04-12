/**
问题描述
有n个格子，从左到右放成一排，编号为1-n。

共有m次操作，有3种操作类型：

1.修改一个格子的权值，

2.求连续一段格子权值和，

3.求连续一段格子的最大值。

对于每个2、3操作输出你所求出的结果。

输入格式
第一行2个整数n，m。

接下来一行n个整数表示n个格子的初始权值。

接下来m行，每行3个整数p,x,y，p表示操作类型，p=1时表示修改格子x的权值为y，p=2时表示求区间[x,y]内格子权值和，p=3时表示求区间[x,y]内格子最大的权值。

输出格式
有若干行，行数等于p=2或3的操作总数。

每行1个整数，对应了每个p=2或3操作的结果。

样例输入
4 3
1 2 3 4
2 1 3
1 4 3
3 1 4
样例输出
6
3
数据规模与约定
对于20%的数据n <= 100，m <= 200。

对于50%的数据n <= 5000，m <= 5000。

对于100%的数据1 <= n <= 100000，m <= 100000，0 <= 格子权值 <= 10000。
 */
package 啊超时操作格子;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[] weight = new int[n];
		for (int i = 0; i < n; i++) {
			weight[i] = scanner.nextInt();
		}
		int p,x,y;
		for (int i = 0; i < m; i++) {
			p = scanner.nextInt();
			x = scanner.nextInt();
			y = scanner.nextInt();
			switch (p) {
			case 1:
				weight[x-1] = y;
				break;
			case 2:
				int sum = 0;
				for (int j = x-1; j < y; j++) {
					sum+=weight[j];
				}
				System.out.println(sum);
				break;
			case 3:
				int res = weight[x-1];
				for (int j = x; j < y; j++) {
					if (weight[j]>res) {
						res = weight[j];
					}
				}
				System.out.println(res);
				break;
			}
		}
	}
}
/**
c++

#include<iostream>
using namespace std;

int main()
{
    
    int n,m;
    cin>>n>>m;
    int weight[n];
    
    for (int i=0; i<n; i++) {
        cin>>weight[i];
    }
    
    
    int p,x,y;
    for (int i = 0; i < m; i++) {
        cin>>p>>x>>y;
        switch (p) {
            case 1:
                weight[x-1] = y;
                break;
            case 2:{
                int sum = 0;
                for (int j = x-1; j < y; j++) {
                    sum+=weight[j];
                }
                cout<<sum<<endl;
                break;
            }
            case 3:{
                int res = weight[x-1];
                for (int j = x; j < y; j++) {
                    if (weight[j]>res) {
                        res = weight[j];
                    }
                }
                cout<<res<<endl;
                break;
            }
        }
    }
    
    return 0;
}
 */