package ѭ���ڳ���;

import java.util.Vector;

public class Main {

	public static void main(String[] args) {
	    System.err.println(f(11, 13));
	}
	//ѭ���ڳ���
	public static int f(int n, int m)
	{
		n = n % m;  
		Vector v = new Vector();
		for(;;)
		{
			v.add(n);
			n *= 10;
			n = n % m;
			if(n==0) return 0;
			if(v.indexOf(n)>=0) 
				return v.size();  //���
		}
	}
}
