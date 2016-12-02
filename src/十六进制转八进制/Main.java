package 十六进制转八进制;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		String a[] = new String[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.readLine();
		}

		for (int i = 0; i < n; i++) {
			char[] temp = a[i].toCharArray();
			StringBuffer s2 = new StringBuffer();
			// 16 to 2
			int k = temp.length;
			for (int j = 0; j < k; j++) {
				switch (temp[j]) {
				case '0':
					s2.append("0000");
					break;
				case '1':
					s2.append("0001");
					break;
				case '2':
					s2.append("0010");
					break;
				case '3':
					s2.append("0011");
					break;
				case '4':
					s2.append("0100");
					break;
				case '5':
					s2.append("0101");
					break;
				case '6':
					s2.append("0110");
					break;
				case '7':
					s2.append("0111");
					break;
				case '8':
					s2.append("1000");
					break;
				case '9':
					s2.append("1001");
					break;
				case 'A':
					s2.append("1010");
					break;
				case 'B':
					s2.append("1011");
					break;
				case 'C':
					s2.append("1100");
					break;
				case 'D':
					s2.append("1101");
					break;
				case 'E':
					s2.append("1110");
					break;
				case 'F':
					s2.append("1111");
					break;
				}
			}
			// 2 to 8
			StringBuffer s3 = new StringBuffer();
			int m = 0;
			if (4 * k % 3 == 1) {
				s3.append(s2.substring(0, 1));
				m += 1;
			} else if (4 * k % 3 == 2) {
				switch (s2.substring(0, 2)) {
				case "01":
					s3.append("1");
					break;
				case "10":
					s3.append("2");
					break;
				case "11":
					s3.append("3");
					break;
				default:
					break;
				}
				m += 2;
			}
			for (int j = m; j < 4 * k;) {
				switch (s2.substring(j, j + 3)) {
				case "000":
					s3.append("0");
					break;
				case "001":
					s3.append("1");
					break;
				case "010":
					s3.append("2");
					break;
				case "011":
					s3.append("3");
					break;
				case "100":
					s3.append("4");
					break;
				case "101":
					s3.append("5");
					break;
				case "110":
					s3.append("6");
					break;
				case "111":
					s3.append("7");
					break;
				}
				j += 3;
			}

			if (s3.length() == 2 && s3.charAt(0) == '0') {// 0-->00-->delete 00-->notany
				System.out.println(s3.substring(1));
			} else {
				int q = 0;
				while (s3.charAt(q) == '0') {
					q++;
				}
				String s = s3.toString();
				System.out.println(s3.substring(q));
			}
		}
	}
}


//public class Main {
//
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int n = scanner.nextInt();
//		String[] array = new String[n];
//		for (int i = 0; i < n; i++) {
//			array[i] = scanner.next();
//		}
//		for (int i = 0; i < n; i++) {
//			System.out.println(Integer.toOctalString(Integer.parseInt(Integer.toBinaryString(Integer.valueOf(array[i],16)),2)));
//		}
//	}
//}
