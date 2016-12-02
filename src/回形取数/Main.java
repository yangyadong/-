package 回形取数;

import java.util.Scanner;

public class Main {
	
	static int[][][] num;
	static int n,m;
	static int sum = 0;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		m = scanner.nextInt();
		num = new int[n][m][2];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				num[i][j][1] = 0;
				num[i][j][0] = scanner.nextInt();
			}
		}
		int[] k = {0,0,1};
		while (sum!=n*m) {
			k = run(k[0],k[1],k[2]);
		}
	}
	
	private static int[] run(int i,int j,int run) {
		int[] k=new int[3]; 
		if(i>=0 && i <n && j>=0 && j<m && num[i][j][1]==0){
			System.out.print(num[i][j][0]);
			sum++;
			if(sum!=n*m){
				System.out.print(" ");
			}
			num[i][j][1]=1;
			if(run==1){
				k[0]=i+1;k[1]=j;k[2]=run;
			}else	if(run==2){
				k[0]=i;k[1]=j+1;k[2]=run;
			}else if(run==3){
				k[0]=i-1;k[1]=j;k[2]=run;
			}else if(run==4){
				k[0]=i;k[1]=j-1;k[2]=run;
			}
		}else{
			if(run==1){
				k[0]=i-1;k[1]=j+1;k[2]=2;
			}else	if(run==2){
				k[0]=i-1;k[1]=j-1;k[2]=3;
			}else if(run==3){
				k[0]=i+1;k[1]=j-1;k[2]=4;
			}else if(run==4){
				k[0]=i+1;k[1]=j+1;k[2]=1;
			}
		}
		return k;
	}
}
