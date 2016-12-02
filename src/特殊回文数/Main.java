package 特殊回文数;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int sum = 0;
		for (int i = 10001; i <= 999999; i++) {
			char[] c = String.valueOf(i).toCharArray();
			for (int j = 0; j < c.length; j++) {
				if(j <= 3 && c[j]==c[c.length-j-1]){
					if(j == 3){
						for (int j2 = 0; j2 < c.length; j2++) {
							sum += Integer.valueOf(Integer.parseInt(String.valueOf(c[j2])));
						}
						if(sum == n){
							System.out.println(i);
						}
					}
				}else{
					break;
				}
			}
			sum = 0;
		}
		
		
//		Scanner reader = new Scanner(System.in);
//		int num1 = reader.nextInt();	
//		int sum1=0;
//		for(int i=1;i<=9;i++){
//			for(int j=0;j<=9;j++){
//				for(int x=0;x<=9;x++){
//					sum1 = x + j*2 + i*2;
//					if(sum1 == num1){
//						System.out.println(i*10000+j*1000+x*100+j*10+i);
//					}
//				}
//			}
//		}	
//		for(int i=1;i<=9;i++){
//			for(int j=0;j<=9;j++){
//				for(int x=0;x<=9;x++){
//					sum1 = x*2 + j*2 + i*2;
//					if(sum1 == num1){
//						System.out.println(i*100000+j*10000+x*1000+x*100+j*10+i);
//					}
//				}
//			}
//		}	
	}
}
