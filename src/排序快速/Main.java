package �������;

public class Main {

	public static void main(String[] args) {
		int[] a = { 12, 20, 5, 16, 15, 1, 30, 45, 23, 9 };
		System.out.println("����ǰ��");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		int start = 0;
		int end = a.length - 1;
		sort(a, start, end);
		System.out.println("�����");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

	// public static int partition(int []array,int lo,int hi){
	// //�̶����зַ�ʽ
	// int key=array[lo];
	// while(lo<hi){
	// while(array[hi]>=key&&hi>lo){//�Ӻ�벿����ǰɨ��
	// hi--;
	// }
	// array[lo]=array[hi];
	// while(array[lo]<=key&&hi>lo){//��ǰ�벿�����ɨ��
	// lo++;
	// }
	// array[hi]=array[lo];
	// }
	// array[hi]=key;
	// return hi;
	// }
	//
	// public static void sort(int[] array, int lo, int hi) {
	// if (lo >= hi) {
	// return;
	// }
	// int index = partition(array, lo, hi);
	// sort(array, lo, index - 1);
	// sort(array, index + 1, hi);
	// }

	public static void sort(int[] a, int low, int high) {
		int start = low;
		int end = high;
		int key = a[low];

		while (end > start) {
			// �Ӻ���ǰ�Ƚ�
			while (end > start && a[end] >= key)
				// ���û�бȹؼ�ֵС�ģ��Ƚ���һ����ֱ���бȹؼ�ֵС�Ľ���λ�ã�Ȼ���ִ�ǰ����Ƚ�
				end--;
			if (a[end] <= key) {
				int temp = a[end];
				a[end] = a[start];
				a[start] = temp;
			}
			// ��ǰ����Ƚ�
			while (end > start && a[start] <= key)// ���û�бȹؼ�ֵ��ģ��Ƚ���һ����ֱ���бȹؼ�ֵ��Ľ���λ��
				start++;
			if (a[start] >= key) {
				int temp = a[start];
				a[start] = a[end];
				a[end] = temp;
			}
			// ��ʱ��һ��ѭ���ȽϽ������ؼ�ֵ��λ���Ѿ�ȷ���ˡ���ߵ�ֵ���ȹؼ�ֵС���ұߵ�ֵ���ȹؼ�ֵ�󣬵������ߵ�˳���п����ǲ�һ���ģ���������ĵݹ����
		}
		// System.out.print(start+","+end+"~~~~");
		// for (int i = 0; i < a.length; i++) {
		// System.out.print(a[i] + " ");
		// }
		// System.out.println();
		// �ݹ�
		if (start > low)
			sort(a, low, start - 1);// ������С���һ������λ�õ��ؼ�ֵ����-1
		if (end < high)
			sort(a, end + 1, high);// �ұ����С��ӹؼ�ֵ����+1�����һ��
	}

}
