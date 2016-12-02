package 四位数性质;

public class Main {

	public static void main(String[] args) {
		for (int i = 1000; i < 10000; i++) {
			if (i == Math.pow((i/100)+(i%100),2)) {
				System.out.println(i);
			}
		}
	}
}
