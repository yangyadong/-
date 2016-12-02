package 鸟撞B车;
/**
 A地与B地相距1000km
火车A从A开往B时速30km/h,
火车B从B开往A,时速30km/h,
一只鸟从A飞向B,时速150km/h,
两辆火车和鸟同时出发,鸟遇到火车B折返,遇到火车A再折返,
以此类推,当`两辆火车相距不大于1km时,鸟一共与火车B相遇几次？*
 */
public class Main {

	static int n = 0;
	public static void main(String[] args) {
		double num = 1000;
		run(num);
		System.out.println(n/2);
	}

	public static void run(double num) {
//		System.out.println(num);
		if(num<=1){
			return;
		}else{
			n++;
			run(num*2/3);
		}
	}
	
}
