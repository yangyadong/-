/**
��������
�����˿������򣺹����˿������飬���˿��ƽ�����������ԭ�����£����ִ�С������2-10��J��Q��K��A����ɫ��С�����Ƿ��飨diamond����÷����club�������ң�heart�������ң�spade���������ƱȽ�ʱ�ȿ����֣�������ͬʱ����ɫ��Ҫ���������˿��ƽ��д�С��������
�������������ƣ���ʾ����2������3������3������A��÷��J���� 2 s 3 h 3 s A d J c
����������ӦΪ��2 s 3 h 3 s J c A d���鳤�ȹ̶�Ϊ5��
�������
����������������Ӧ�������
����
2s3h3sAdJc
2s 3h 3s Jc Ad
���ݹ�ģ��Լ��
��������������ÿһ�����ķ�Χ��
 */
package �˿�����;

import java.util.Scanner;

public class Main {
	static int[][] r;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String reString = scanner.next();
		char[] res_old = reString.toCharArray();
		int[] res = new int[res_old.length];
		r = new int[5][2];
		for (int i = 0; i < res_old.length;i++) {
			if (res_old[i]=='J') {
				res[i] = 11;
			}else if (res_old[i] == 'Q') {
				res[i] = 12;
			}else if (res_old[i] == 'K') {
				res[i] = 13;
			}else if (res_old[i] == 'A') {
				res[i] = 14;
			}else {
				res[i] = Integer.valueOf(String.valueOf(res_old[i]));
			}
			if (res_old[i+1]=='d') {
				res[i+1] = 0;
			}else if (res_old[i+1]=='c') {
				res[i+1] = 1;
			}else if (res_old[i+1]=='h') {
				res[i+1] = 2;
			}else if (res_old[i+1]=='s') {
				res[i+1] = 3;
			}
			check(0,res[i],res[i+1]);
			i++;
		}
		for (int i = 0; i < r.length; i++) {
			String rString = null;
			if (r[i][0]==11) {
				rString = "J";
			}else if (r[i][0] == 12) {
				rString = "Q";
			}else if (r[i][0] == 13) {
				rString = "K";
			}else if (r[i][0] == 14) {
				rString = "A";
			}else {
				rString = String.valueOf(r[i][0]);
			}
			String reString2 = null;
			if (r[i][1]==0) {
				reString2 = "d";
			}else if (r[i][1]==1) {
				reString2 = "c";
			}else if (r[i][1]==2) {
				reString2 = "h";
			}else if (r[i][1]==3) {
				reString2 = "s";
			}
			System.out.print(rString+reString2+" ");
		}
	}
	
	public static void check(int k,int res,int res2) {
		int n = r[k][0];
		if(r[k][0] == 0){
			r[k][0] = res;
			r[k][1] = res2;
		}else {
			if (n>res) {
				change(k,res,res2);
			}else if (n==res) {
				change1(k,res,res2);
			}else {
				check(k+1,res,res2);
			}
		}
	}
	
	public static void change(int i,int res,int res2) {
		for (int j = r.length-1; j >i; j--) {
			r[j][0] = r[j-1][0];
			r[j][1] = r[j-1][1];
		}
		r[i][0] = res;
		r[i][1] = res2;
	}
	
	public static void change1(int i,int res,int res2) {
		int n;
		int n_c;
		for (int j = i; j < r.length; j++) {
			n = r[i+1][0];
			n_c = r[i][1];
			if(n!=res){
				if (n_c<res2) {
					change(i+1,res,res2);
					return;
				}else {
					change(i,res,res2);
					return;
				}
			}else {
				if (n_c>res2) {
					change(i,res,res2);
					return;
				}
			}
		}
	}
	
}
