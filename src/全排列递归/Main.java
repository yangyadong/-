package È«ÅÅÁĞµİ¹é;

import java.util.Arrays;

public class Main {
	static int sum = 0;
	static int l = 10;
	static int[] num = new int[l];
	static int[] table = new int[l];

	public static void main(String[] args) {
		sort(0);
		System.out.println(sum);
	}

	public static void sort(int pos) {
		if (pos == l) {
			sum++;
			System.out.println(Arrays.toString(num));
		}
		for (int i = 0; i < l; i++) {
			if (table[i] == 0) {
				num[pos] = i;
				table[i] = 1;
				sort(pos+1);
				table[i] = 0;
			}
		}
	}

}
