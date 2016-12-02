package 加法变乘法;

public class Main {

	public static void main(String[] args) {
		int pre = 1225;
		for (int i = 1; i < 47; i++) {
			if (i==10) {
				continue;
			}
			for (int j = i+2; j < 49; j++) {
				int now = pre;
				now -= i+i+1;
				now -= j+j+1;
				now += i*(i+1);
				now += j*(j+1);
				if (now == 2015) {
					System.out.println(i);
				}
			}
		}
	}

}
