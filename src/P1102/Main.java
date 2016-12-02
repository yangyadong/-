package P1102;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String[][] info = new String[n][4];
		for (int i = 0; i < n; i++) {
			String name = scanner.next();
			String sex = scanner.next();
			String age = scanner.next();
			String grade = scanner.next();
			int k = i;
			for (int j = 0; j < i; j++) {
				if(Integer.valueOf(grade)<Integer.valueOf(info[j][3])){
					k=j;
					break;
				}
			}
			for (int j = i; j > k; j--) {
				info[j][0]=info[j-1][0];
				info[j][1]=info[j-1][1];
				info[j][2]=info[j-1][2];
				info[j][3]=info[j-1][3];
			}
			info[k][0]=name;
			info[k][1]=sex;
			info[k][2]=age;
			info[k][3]=grade;
		}
		for (int i = 0; i < n; i++) {
			System.out.println(info[i][0]+" "+info[i][1]+" "+info[i][2]+" "+info[i][3]);
		}
	}

}
