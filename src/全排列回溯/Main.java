package 全排列回溯;

public class Main {

	static int a=0;//出现的情况数
	public static void main(String[] args) {
		int[] num  = {1,2,3,4,5,6,7,8,9};
		test(num,0);
		System.out.println("出现的情况数="+a);
		System.out.println("理论上的情况数="+9*8*7*6*5*4*3*2*1);//理论上的情况数
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
