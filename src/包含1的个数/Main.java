package 包含1的个数;

public class Main {
	public static void main(String[] args) {
		int k=0;
		char[] num = new char[4];
		for (int i = 0; i <= 1000; i++) {
			num = String.valueOf(i).toCharArray();
			for (int j = 0; j < num.length; j++) {
				if(Integer.valueOf(String.valueOf(num[j])) == 1){
					k++;
				}
			}
		}
		System.out.println(k);
	}
}
