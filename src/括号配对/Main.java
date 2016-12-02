package ¿®∫≈≈‰∂‘;

import java.util.Scanner;
import java.util.Stack;

public class Main {

	static String string;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			string = scanner.next();
			check(i);
		}
	}
	public static void check(int k) {
		if(string.length()%2==1){
			System.out.println("No");
			return;
		}
		Stack<Character> stack = new Stack<Character>();  
		for (int i = 0; i < string.length(); i++) {
			char b = string.charAt(i);
			if(b=='('||b=='['){
				stack.push(b);
			}else {
				if(stack.empty()){
					System.out.println("No");
					return;
				}else{
					char c = stack.pop();
					if(!((c=='('&&b==')')||(c=='['&&b==']'))){
						System.out.println("No");
						return;
					}
				}
			}
		}
		if(!stack.empty()){
			System.out.println("No");
		}else{
			System.out.println("Yes");
		}
	}
}
