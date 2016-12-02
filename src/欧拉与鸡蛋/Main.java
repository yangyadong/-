package ≈∑¿≠”Îº¶µ∞;

public class Main {

	public static void main(String[] args) {
		double m,n;
		for (double i = 1; i <= 150; i++) {
			m = 32/i;
			n = 24.5/(150-i);
			if(n*i==(150-i)*m){
				System.out.println((int)i+","+(int)(150-i));
				break;
			}
		}
	}

}
