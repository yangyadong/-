/**
 * �и��������������һֻ������ÿ��һ�������������ͻᷭһ����
 * ����������Զ����л��30���ʱ��������ȫ�������������� 
 * ���ʵ�23�������ռ�����صļ���֮����
 * */
package �����ٷֱ�;

public class Main {

	public static void main(String[] args) {
		int a;
		int b;
		double c;
		a = fn(30);
		b = fn(23);
		c = (double)b/a;
		System.out.println(c);
		//check(30,1);
	}
	public static int fn(int a) {
		if(a==1){
			return 1;
		}else {
			a = fn(a-1)*2;
			return a;
		}
	}

	public static void check(int day,double k) {
		if (day==23) {
			System.out.println(k); 
		}else {
			k /= 2;
			check(day-1,k);
		}
	}
	
}
