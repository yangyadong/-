package �������;
/**
[ �������������n�������������������ӳ�һ�ţ����һ�����Ķ�λ������
���磺n=3ʱ��3������13��312��343�����ɵ��������Ϊ34331213��
���磺n=4ʱ��4������7��13��4��246�����ɵ��������Ϊ7424613��
���룺n
N����
��������ɵĶ�λ��
 */
import java.util.Scanner;

public class Main {

	static String res;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] num = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = scanner.nextInt();
		}
		//int[] num  = {1,2,3,4,5,6,7,8,9};
		flashBack(num, 0);
		System.out.println(res);
	}
	public static void flashBack(int[] num,int k) {
		if (k>=num.length) {
			check(num);
		}
		for (int i = k; i < num.length; i++) {
			{int t=num[k];num[k]=num[i];num[i]=t;}
			flashBack(num,k+1);
			{int t=num[k];num[k]=num[i];num[i]=t;}
		}
	}
	
	public static void check(int[] num) {
		String newRes = "";
		for (int i = 0; i < num.length; i++) {
			newRes += String.valueOf(num[i]);
		}
		char[] newResChar = newRes.toCharArray();
		if(res != null){
			char[] ResChar = res.toCharArray();
			for (int i = 0; i < ResChar.length; i++) {
				if(ResChar[i]<newResChar[i]){
					res = newRes;
					return;
				}else if (ResChar[i]>newResChar[i]) {
					return;
				}
			}
		}else {
			res = newRes;
		}
	}

}
