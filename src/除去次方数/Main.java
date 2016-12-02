package 除去次方数;

import java.util.Set;
import java.util.HashSet;
public class Main {
	public static void main(String[] args){
		Set sets = new HashSet();
		sets.add(1.0); // 添加第一个元素 1
		int i,j=2;
		for(i=2;Math.pow(i, j)<=10000;i++){
			for(j=2;Math.pow(i, j)<=10000;j++){
				sets.add(Math.pow(i, j));
			}
			j = 2;
		}
		System.out.println(10000-sets.size());
	}
}