package ½×³Ë¼ÆËã;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		a.add(1);

		for (int i = 2; i <= n; i++) {
			int jw = 0;
			int k = a.size();
			for (int j = 0; j < k; j++) {
				int temp = a.get(j) * i + jw;
				a.set(j, temp % 10);
				jw = temp / 10;
				if(j==k-1){
					while (jw!=0) {
						if(jw<=9){
							a.add(jw);
							jw=0;
						}else{
							a.add(jw%10);
							jw = jw/10;
						}
					}
				}
			}
		}
		for (int i = a.size() - 1; i >= 0; i--) {
			System.out.print(a.get(i));
		}
	}
}
