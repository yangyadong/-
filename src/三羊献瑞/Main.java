package ÈıÑòÏ×Èğ;

public class Main {

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				for (int m = 0; m < 10; m++) {
					for (int n = 0; n < 10; n++) {
						if (i!=j&&i!=m&&i!=n&&j!=m&&j!=n&&n!=m) {
							for (int i1 = 1; i1 < 10; i1++) {
								for (int j1 = 0; j1 < 10; j1++) {
									for (int m1 = 0; m1 < 10; m1++) {
										for (int n1 = 0; n1 < 10; n1++) {
											if (i1!=j1&&i1!=m1&&i1!=n1&&j1!=m1&&j1!=n1&&n1!=m1) {
												int a = 1000*i+100*j+10*m+n;
												int b = 1000*i1+100*j1+10*m1+n1;
												char[] num = String.valueOf(a+b).toCharArray();
												if (n1==j&&Integer.valueOf(String.valueOf(num[0]))==i1) {
													if (Integer.valueOf(String.valueOf(num[1]))==j1) {
														if (Integer.valueOf(String.valueOf(num[2]))==m) {
															if (Integer.valueOf(String.valueOf(num[3]))==n1) {
																if (num[4]!=i&&num[4]!=j&&num[4]!=m&&num[4]!=n&&num[4]!=i1&&num[4]!=j1&&num[4]!=m1&&num[4]!=n1) {
																	System.out.println(" "+a);
																	System.out.println(" "+b);
																	System.out.println(a+b);
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

}
