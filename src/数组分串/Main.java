package 数组分串;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ArrayList<Integer> inputs = new ArrayList<Integer>();
		Scanner in = new Scanner(System.in);
		String line = in.nextLine();
		while (line != null && !line.isEmpty()) {
			int value = Integer.parseInt(line.trim());
			if (value == 0)
				break;
			inputs.add(value);
			line = in.nextLine();
		}
		
		int[] A = new int[inputs.size()];
		for (int i = 0; i < inputs.size(); i++) {
			A[i] = inputs.get(i).intValue();
		}

		// int[] A = { 1, 1, 1, 1, 7, 1, 3, 4, 1, 2, 1, 5, 2, 2 };
		// int[] A={1,1,1,1,10,1,3,1,1,2,1,5,2,2};
		// int[] A = { 1, 2, 3, 3, 2, 8, 1, 4, 9, 5, 3, 2, 4 };
		// int[] A={1,5,3,2,4,1,1,5,3,2,4};
		// int[] A = { 1, 5, 3, 1, 9, 1, 9, 1, 3, 2, 4 };
		// int[] A={1,5,3,1,5,9,5,1,3,2,4};
		// int[] A = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		// int[] A = { 2, 5, 1, 1, 1, 1, 4, 1, 7, 3, 7 };
		check(A);
	}
	
	public static void check(int[] A) {
		long a = A[0], b = A[A.length - 1];
		for (int i = 1, j = A.length - 2; i < j;) {
			if (a > b) {
				b += A[j];
				j--;
			} else if (a < b) {
				a += A[i];
				i++;
			} else {
				long sum = 0;// 中间所有元素和
				int[] res = { i, 0, j };
				for (int begin = i + 1; begin < j; begin++) {
					sum += A[begin];
					if (res[1] == 0 && sum == a) {
						begin++;
						res[1] = begin;
					}
				}
				if (sum == a * 2) {
					System.out.println(Arrays.toString(res));
					System.out.println(true);
					return;
				} else {
					a += A[i];
					i++;
					b += A[j];
					j--;
				}
			}
		}
		System.out.println(false);
	}

}
