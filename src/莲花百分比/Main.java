/**
 * 有个莲花池里起初有一只莲花，每过一天莲花的数量就会翻一倍。
 * 假设莲花永远不凋谢，30天的时候莲花池全部长满了莲花， 
 * 请问第23天的莲花占莲花池的几分之几？
 * */
package 莲花百分比;

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
