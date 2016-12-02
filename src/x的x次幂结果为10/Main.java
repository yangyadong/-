package x的x次幂结果为10;

public class Main {

	public static void main(String[] args) {
		double s = System.nanoTime();
		double min=10;
		a:for (double i = 0; i < 9; i++) {
			for (double j = 0; j < 9; j++) {
				for (double k = 0; k < 9; k++) {
					for (double m = 0; m < 9; m++) {
						for (double n = 0; n < 9; n++) {
							for (double q = 0; q < 9; q++) {
								double num = 2+0.1*i+0.01*j+0.001*k+0.0001*m+0.00001*n+0.000001*q;
								double a = Math.pow(num, num);
								if (10>a) {
									if ((10 - a)<min) {
										min = 10-a;
									}
								}else{
									if ((a-10)<min) {
										min = a-10;
									}else{
										System.out.println(a);
										System.out.println(num);
										break a;
									}
								}
							}
						}
					}
				}
			}
		}
		double e = System.nanoTime();
		System.out.println((e-s)/Math.pow(10,9)+"s");
	}

}
