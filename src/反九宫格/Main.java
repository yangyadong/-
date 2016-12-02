package ·´¾Å¹¬¸ñ;

public class Main {

	static int sum = 0;
	public static void main(String[] args) {
		int[] num  = {1,2,3,4,5,6,7,8,9};
		test(num,0);
		System.out.println(9*8*7*6*5*4*3*2*1);
		System.out.println(sum);
		System.out.println(sum/8);
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
		int[] add = new int[8];
		add[0] = num[0]+num[1]+num[2];
		add[1] = num[3]+num[4]+num[5];
		add[2] = num[6]+num[7]+num[8];
		add[3] = num[0]+num[3]+num[6];
		add[4] = num[1]+num[4]+num[7];
		add[5] = num[2]+num[5]+num[8];
		add[6] = num[0]+num[4]+num[8];
		add[7] = num[2]+num[4]+num[6];
		for (int i = 0; i < 8; i++) {
			for (int j = i+1; j < 8; j++) {
				if(add[i]==add[j]){
					return;
				}
			}
		}
		sum++;
	}
	
	
}
