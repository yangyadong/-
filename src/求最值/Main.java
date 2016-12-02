//����ֵ
//��n��Ԫ�����ҳ����Ԫ�غ���СԪ�ء����ǿ��԰���n��Ԫ�ط���һ�������У���ֱ�ӱȽϷ������
package ����ֵ;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] num = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = scanner.nextInt();
		}
		int[] res = find(num);
		System.out.println("max="+res[0]);
		System.out.println("min="+res[1]);
	}
	
	public static int[] find(int[] num) {
		int[] res = new int[2];
		if(num.length == 1){
			res[0]=res[1]=num[0];
		}else if (num.length == 2) {
			if (num[0]>num[1]) {
				res[0]=num[0];
				res[1]=num[1];
			}else{
				res[1]=num[0];
				res[0]=num[1];
			}
		}else{
			int return_res_left[] = find(Arrays.copyOfRange(num, 0, num.length/2));
			int return_res_right[] = find(Arrays.copyOfRange(num, num.length/2 ,(int)num.length));
			if(return_res_left[0]>return_res_right[0]){
				res[0]=return_res_left[0];
			}else{
				res[0]=return_res_right[0];
			}
			if(return_res_left[1]<=return_res_right[1]){
				res[1]=return_res_left[1];
			}else{
				res[1]=return_res_right[1];
			}
		}
		return res;
	}

}
