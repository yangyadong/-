/**
问题描述
　　扑克牌排序：构造扑克牌数组，对扑克牌进行排序。排序原则如下：数字从小到大是2-10、J、Q、K和A，花色从小到大是方块（diamond）、梅花（club）、红桃（heart）、黑桃（spade）。两张牌比较时先看数字，数字相同时看花色。要求对输入的扑克牌进行从小到大排序。
　　输入五张牌（表示黑桃2、红桃3、黑桃3、方块A和梅花J）： 2 s 3 h 3 s A d J c
　　输出结果应为：2 s 3 h 3 s J c A d数组长度固定为5。
样例输出
与上面的样例输入对应的输出。
例：
2s3h3sAdJc
2s 3h 3s Jc Ad
数据规模和约定
　　输入数据中每一个数的范围。
 */
package 扑克排序;

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
