/**
 ��������
������֪һ����������Zrf_Ratio��ʵ�����µĲ�����������ʽ��
����friend std::ostream& operator<<(std::ostream&, const zrf_Ratio&);//���������
����friend std::istream& operator>>(std::istream&, zrf_Ratio&);
����friend bool operator==(const zrf_Ratio&, const zrf_Ratio&);
����friend bool operator<(const zrf_Ratio&, const zrf_Ratio&);
����
��������ʱ������������ĸ�����a, b, c, d����ʾ��������a/b��c/d��Ҫ������������Լ�����������Ⱥʹ�С�ıȽϽ����
��������
1 7 26 25
�������
zrf is:1/7; ssh is:26/25
(zrf==ssh) is:0; (zrf<ssh) is:1



��
ostream& operator<<(ostream& os, const zrf_Ratio& zrf_Ratio) {  
    os << zrf_Ratio.num << "/" << zrf_Ratio.den;  
    return os;  
}  
  
istream& operator>>(istream& in, zrf_Ratio& zrf_Ratio) {  
    in >> zrf_Ratio.num >> zrf_Ratio.den;  
    return in;  
}  
  
bool operator==(const zrf_Ratio& zrf_Ratio1, const zrf_Ratio& zrf_Ratio2) {  
    if (zrf_Ratio1.num == zrf_Ratio2.num &&  
        zrf_Ratio1.den == zrf_Ratio2.den) {  
        return 1;  
    }  
    return 0;  
}  
  
bool operator<(const zrf_Ratio& zrf_Ratio1, const zrf_Ratio& zrf_Ratio2) {  
    if (zrf_Ratio1.num * 1.0 / zrf_Ratio1.den <  
        zrf_Ratio2.num * 1.0 / zrf_Ratio2.den) {  
        return 1;  
    }  
    return 0;  
}  


 */

package CH0801;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		int k = max(a, b);
		int x = max(c, d);
		System.out.println("zrf is:" + a / k + "/" + b / k + "; ssh is:" + c / x + "/" + d / x);
		System.out.println("(zrf==ssh) is:" + ((a / k) * (d / x) - (b / k) * (c / x) == 0 ? 1 : 0) + "; (zrf<ssh) is:"
				+ ((a / k) * (d / x) - (b / k) * (c / x) < 0 ? 1 : 0));
	}

	// ���Լ��
	public static int max(int m, int n) {
		if (m < n) {
			int temp = n;
			n = m;
			m = temp;
		}
		while (m % n != 0) {
			int temp = m % n;
			m = n;
			n = temp;
		}
		return n;
	}

}
