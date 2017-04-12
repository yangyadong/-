/**
��������
��n�����ӣ������ҷų�һ�ţ����Ϊ1-n��

����m�β�������3�ֲ������ͣ�

1.�޸�һ�����ӵ�Ȩֵ��

2.������һ�θ���Ȩֵ�ͣ�

3.������һ�θ��ӵ����ֵ��

����ÿ��2��3���������������Ľ����

�����ʽ
��һ��2������n��m��

������һ��n��������ʾn�����ӵĳ�ʼȨֵ��

������m�У�ÿ��3������p,x,y��p��ʾ�������ͣ�p=1ʱ��ʾ�޸ĸ���x��ȨֵΪy��p=2ʱ��ʾ������[x,y]�ڸ���Ȩֵ�ͣ�p=3ʱ��ʾ������[x,y]�ڸ�������Ȩֵ��

�����ʽ
�������У���������p=2��3�Ĳ���������

ÿ��1����������Ӧ��ÿ��p=2��3�����Ľ����

��������
4 3
1 2 3 4
2 1 3
1 4 3
3 1 4
�������
6
3
���ݹ�ģ��Լ��
����20%������n <= 100��m <= 200��

����50%������n <= 5000��m <= 5000��

����100%������1 <= n <= 100000��m <= 100000��0 <= ����Ȩֵ <= 10000��
 */
package ����ʱ��������;

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