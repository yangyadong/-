package Ó²±Ò·½°¸;

public class Main {

	public static void main(String[] args) {
		int num=0;
		for (int i = 0; i <= 50; i++) {
			for (int j = 0; j <= 50; j++) {
				for (int j2 = 0; j2 <= 50; j2++) {
					if (50-i-j-j2>=0 && i+0.5*j+0.1*j2+0.05*(50-j-i-j2)==20) {
						num++;
					}
				}
			}
		}
		System.out.println(num);
	}

}
