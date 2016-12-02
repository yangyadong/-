package 立方变自身;

public class Main {

	public static void main(String[] args) {
		int k=0;
		for (double i = 1; i < 60; i++) {
			char[] num = String.valueOf((int)Math.pow(i, 3)).toCharArray();
			int s=0;
			for (int j = 0; j < num.length; j++) {
				s+=Integer.valueOf(String.valueOf(num[j]));
			}
			if (i==s) {
				System.out.println((int)i);
				k++;
			}
		}
		System.out.println(k);
	}
}
