package ����ִ����;

import java.util.Arrays;

public class Main {

	static boolean resolve(int[] A) {
		int[] re = findValLocate(A);
		System.out.println("Ѱ�����,����ֵ��d1,d2,d3�ֱ�Ϊ: " + Arrays.toString(re));
		if (re == null) {
			return false;
		}
		return true;
	}

	static int[] sumArrMaxMin(int[] A) {
		int sum = 0, max = 0, min = Float.MAX_EXPONENT;
		for (int i = 0; i < A.length; ++i) {
			sum = sum + A[i];
			if (max < A[i]) {
				max = A[i];
			}
			if (min > A[i]) {
				min = A[i];
			}
		}
		int[] r = { sum, min, max };
		return r;
	}

	static int checkingFind(int[] A, int val, int begin, int end) {
		int s = 0;
		for (int i = begin; i < end; ++i) {
			s = s + A[i];
			if (s == val) {
				// ����Ҫȥ���Ǹ��㡣
				return i + 1;
			}
		}
		return -1;
	}

	static int[] findValLocate(int[] A) {
		int v1 = 0, v4 = 0;
		int[] smm = sumArrMaxMin(A);
		for (int i = 0, j = A.length - 1; i < j;) {

			if (v1 < v4) {
				v1 = v1 + A[i];
				++i;
			} else if (v1 > v4) {
				v4 = v4 + A[j];
				--j;
			} else {
				/* ��֤��sum-max <= 4v+d1+d3 <= sum-min */
				int m = 4 * v1 + A[i] + A[j];
				if ((smm[0] - smm[2]) <= m && m <= (smm[0] - smm[1])) {

					int re[] = { v1, i, 0, j };
					/* �����ڷ������ĵط� */
					re[2] = checkingFind(A, re[0], re[1] + 1, re[3] - 1);
					// System.out.println("reֵ="+Arrays.toString(re));
					if (re[2] > 0 && (smm[0] - (A[re[1]] + A[re[2]] + A[re[3]])) / 4 == v1) {
						return re;
						/*
						 * if((smm[0]-smm[2]) == m){ if( A[re[2]] ==smm[2]){
						 * return re; } }else if(m== (smm[0]-smm[1]) ){ if(
						 * A[re[2]] ==smm[1]){ return re; } }
						 */
					}

				}
				v1 = v1 + A[i];
				++i;
				// System.out.println(i);

				/*
				 * �Ľ�ǰ�� //��֤��2<=N-3-n<=2v int m=A.length-3-(i+1+A.length-j);
				 * if(m>=2 && m<=2*v1 ){ //���ﷵ�ص���ȥ�����λ�ã�i,jû�мӼ���
				 * //����Ϊ��ǰ�Ĳ����������������һλ�ˣ� //����ָ�ľ���Ҫȥ���ĵ� int re[]={v1,i,0,j};
				 * return re; }else{ v1=v1+A[i]; ++i; }
				 */

			}
		}
		return null;
	}

	public static void main(String[] args) {
		/*
		 * ArrayList<Integer> inputs = new ArrayList<Integer>(); Scanner in =
		 * new Scanner(System.in); String line = in.nextLine(); while(line !=
		 * null && !line.isEmpty()) { int value = Integer.parseInt(line.trim());
		 * if(value == 0) break; inputs.add(value); line = in.nextLine(); }
		 * int[] A = new int[inputs.size()]; for(int i=0; i<inputs.size(); i++)
		 * { A[i] = inputs.get(i).intValue(); }
		 */
		// int[] A={1,1,1,1,7,1,3,4,1,2,1,5,2,2};
		// int[] A={1,1,1,1,10,1,3,1,1,2,1,5,2,2};
		int[] A = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		// int[] A={1,2,3,3,2,8,1,4,9,5,3,2,4};
		// int[] A={1,5,3,2,4,1,1,5,3,2,4};
		// int[] A = { 1, 5, 3, 1, 9, 1, 9, 1, 3, 2, 4 };
		// int[] A={1,5,3,1,5,9,5,1,3,2,4};
		// int[] A={2, 5, 1, 1, 1, 1, 4, 1, 7, 3, 7};
		Boolean res = resolve(A);

		System.out.println(String.valueOf(res));

	}

}
