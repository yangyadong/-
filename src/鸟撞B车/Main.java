package ��ײB��;
/**
 A����B�����1000km
��A��A����Bʱ��30km/h,
��B��B����A,ʱ��30km/h,
һֻ���A����B,ʱ��150km/h,
�����𳵺���ͬʱ����,��������B�۷�,������A���۷�,
�Դ�����,��`��������಻����1kmʱ,��һ�����B�������Σ�*
 */
public class Main {

	static int n = 0;
	public static void main(String[] args) {
		double num = 1000;
		run(num);
		System.out.println(n/2);
	}

	public static void run(double num) {
//		System.out.println(num);
		if(num<=1){
			return;
		}else{
			n++;
			run(num*2/3);
		}
	}
	
}
