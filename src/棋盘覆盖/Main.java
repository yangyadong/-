/**
 * ��һ��2^k��2^k ��������ɵ������У�ǡ��һ����������������ͬ���Ƹ÷���Ϊһ���ⷽ��
 * �ҳƸ�����Ϊһ�������̡������̸��������У�
 * Ҫ��ͼʾ��4�ֲ�ͬ��̬��L�͹��Ƹ��Ǹ��������������ϳ����ⷽ����������з���
 * ���κ�2��L�͹��Ʋ����ص����ǡ�
 * */
package ���̸���;

import java.util.Scanner;

public class Main {

	static int num=0;//��L������
	static int[][] chessboard;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int k = (int) Math.pow(2, scanner.nextInt());
		//���̱߳�
		chessboard = new int[k][k]; 
		//�ݺ�������������
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
		//����
		if(b_r+size>row && b_c+size>col){
			cat(b_r,b_c,row,col,size);
		}else{
			chessboard[b_r+size-1][b_c+size-1]=t;
			cat(b_r,b_c,b_r+size-1,b_c+size-1,size);
		}
		//����
		if(b_r+size>row && b_c+size<=col){
			cat(b_r,b_c+size,row,col,size);
		}else{
			chessboard[b_r+size-1][b_c+size]=t;
			cat(b_r,b_c+size,b_r+size-1,b_c+size,size);
		}
		//����
		if(b_r+size<=row && b_c+size>col){
			cat(b_r+size,b_c,row,col,size);
		}else{
			chessboard[b_r+size][b_c+size-1]=t;
			cat(b_r+size,b_c,b_r+size,b_c+size-1,size);
		}
		//����
		if(b_r+size<=row && b_c+size<=col){
			cat(b_r+size,b_c+size,row,col,size);
		}else{
			chessboard[b_r+size][b_c+size]=t;
			cat(b_r+size,b_c+size,b_r+size-1,b_c+size-1,size);
		}
	}

}
