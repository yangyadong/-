package ȫ���л���;

public class Main {

	static int a=0;//���ֵ������
	public static void main(String[] args) {
		int[] num  = {1,2,3,4,5,6,7,8,9};
		test(num,0);
		System.out.println("���ֵ������="+a);
		System.out.println("�����ϵ������="+9*8*7*6*5*4*3*2*1);//�����ϵ������
	}

	public static void test(int[] num,int k) {
		if (k>=num.length) {
			show(num);
		}
		for (int i = k; i < num.length; i++) {
			{int t=num[k];num[k]=num[i];num[i]=t;}
			test(num,k+1);
			{int t=num[k];num[k]=num[i];num[i]=t;}
		}
	}
	
	public static void show(int[] num) {
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+" ");
		}
		a++;
		System.out.println();
	}
	
	
}
