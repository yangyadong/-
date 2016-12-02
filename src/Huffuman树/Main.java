package HuffumanÊ÷;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static int sum = 0;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		ArrayList<Integer> num = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			num.add(scanner.nextInt());
		}
		Huffuman(num);
	}
	
	public static void Huffuman(ArrayList<Integer> num) {
		if(num.size()==2){
			System.out.println(sum+num.get(0)+num.get(1));
		}else {
			int min1 = 0;
			int min2 = 1;
			if(num.get(0)>num.get(1)){
				int k = num.get(0);
				num.set(0, num.get(1));
				num.set(1, k);
			}
			for (int i = 2; i < num.size(); i++) {
				if(num.get(min1)>=num.get(i)){
					min2=min1;
					min1=i;
				}else if(num.get(min2)>=num.get(i)){
					min2=i;
				}
			}
			sum += num.get(min1)+num.get(min2);
			num.add(num.get(min1)+num.get(min2));
			if(min1>min2){
				num.remove(min1);
				num.remove(min2);
			}else{
				num.remove(min2);
				num.remove(min1);
			}
			Huffuman(num);
		}
	}
	
}
