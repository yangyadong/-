/**
 * 在一个2^k×2^k 个方格组成的棋盘中，恰有一个方格与其他方格不同，称该方格为一特殊方格，
 * 且称该棋盘为一特殊棋盘。在棋盘覆盖问题中，
 * 要用图示的4种不同形态的L型骨牌覆盖给定的特殊棋盘上除特殊方格以外的所有方格，
 * 且任何2个L型骨牌不得重叠覆盖。
 * */
package 棋盘覆盖;

import java.util.Scanner;

public class Main {

	static int num=0;//‘L’数量
	static int[][] chessboard;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int k = (int) Math.pow(2, scanner.nextInt());
		//棋盘边长
		chessboard = new int[k][k]; 
		//纵横特殊棋子坐标
		int row = scanner.nextInt();
		int col = scanner.nextInt();
		chessboard[row][col] = 0;
		cat(0, 0, row, col, k);
		for (int i = 0; i < chessboard.length; i++) {
			for (int j = 0; j < chessboard.length; j++) {
				System.out.printf("%4d",chessboard[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void cat(int b_r,int b_c,int row,int col,int k) {
		if(k==1){
			return;
		}
		int size = k/2;
		int t = ++num;
		//左上
		if(b_r+size>row && b_c+size>col){
			cat(b_r,b_c,row,col,size);
		}else{
			chessboard[b_r+size-1][b_c+size-1]=t;
			cat(b_r,b_c,b_r+size-1,b_c+size-1,size);
		}
		//右上
		if(b_r+size>row && b_c+size<=col){
			cat(b_r,b_c+size,row,col,size);
		}else{
			chessboard[b_r+size-1][b_c+size]=t;
			cat(b_r,b_c+size,b_r+size-1,b_c+size,size);
		}
		//左下
		if(b_r+size<=row && b_c+size>col){
			cat(b_r+size,b_c,row,col,size);
		}else{
			chessboard[b_r+size][b_c+size-1]=t;
			cat(b_r+size,b_c,b_r+size,b_c+size-1,size);
		}
		//右下
		if(b_r+size<=row && b_c+size<=col){
			cat(b_r+size,b_c+size,row,col,size);
		}else{
			chessboard[b_r+size][b_c+size]=t;
			cat(b_r+size,b_c+size,b_r+size-1,b_c+size-1,size);
		}
	}

}
