package ÕÒËØÊı;

public class Main {

	public static void main(String[] args) {
		double s = System.nanoTime();
		int a[] = new int[100002];
		int num=7,i,k,flag=4,x=1;
		a[0]=2;a[1]=3;a[2]=5;a[3]=7;

		for(i=11;;i+=2)
		{
			for(k=1;k<flag;k++)
			{
				if(i%a[k]==0)
				{
					x=0;
					break;
				}
				if(a[k]*a[k]>i)
				{
					x=1;
					break;
				}
			}
			if(x==1)
				a[flag++]=i;
			if(flag==100002)
				break;
		}
		double e = System.nanoTime();
		System.out.println(a[100001]+"\n"+(e-s)/Math.pow(10,9)+"s");
	}
}
