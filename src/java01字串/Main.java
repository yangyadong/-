package java01×Ö´®;

public class Main {

	public static void main(String[] args) {
		for (int i = 0; i < 32; i++) {
			System.out.format("%05d"+"\r\n",Integer.valueOf(Integer.toBinaryString(i)));
		}
	}
}
