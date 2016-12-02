package ÌØÊâµÄÊı×Ö;

public class Main {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 0; j <= 9; j++) {
				for (int j2 = 0; j2 <= 9; j2++) {
					if(i*100+j*10+j2 == Math.pow(i, 3)+Math.pow(j, 3)+Math.pow(j2, 3)){
						System.out.println(i*100+j*10+j2);
					}
				}
			}
		}
	}
}
