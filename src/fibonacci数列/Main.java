package fibonacciÊıÁĞ;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		int n = Scanner.nextInt();
		int F=0,F1=1,F2=1;
		if(n<3){  
            System.out.print("1");  
            return;	
        }
		for(int i=3;i<=n;i++) {
			if(F1>10007)
				F1=F1%10007; 
			if(F2>10007)
				F2=F2%10007; 
	        F=F1+F2; 
	        F1=F2; 
	        F2=F; 
        }  
        System.out.print(F%10007);  
	}
}
