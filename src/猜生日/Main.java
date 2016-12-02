package ²ÂÉúÈÕ;

public class Main {

	public static void main(String[] args) {
		int num;
		for (int i = 1900; i <= 2012; i++) {
			for (int j = 1; j <= 30; j++) {
				if(j<10){
					num = Integer.valueOf(String.valueOf(i)+"060"+String.valueOf(j));
				}else{
					num = Integer.valueOf(String.valueOf(i)+"06"+String.valueOf(j));
				}
				if(num%2012 == 0 && num%3 == 0 && num%12 == 0){
					System.out.println(num);
					return;
				}
			}
		}
	}
}
