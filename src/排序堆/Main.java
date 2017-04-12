package �����;

public class Main {
	// private static int[] sort = new int[] { 1, 0, 10, 20, 3, 5, 6, 4, 9, 8,
	// 12, 17, 34, 11 };

	public static void main(String[] args) {
		int[] sort = new int[] { 1, 0, 10, 20, 3, 5, 6, 4, 9, 8, 12, 17, 34, 11 };
		buildMaxHeapify(sort);
		heapSort(sort);
		print(sort);
		heapSort1(sort);
	}

	// ʵ��һ
	public static void heapSort1(int[] data) {
		for (int i = (data.length - 1) / 2; i >= 0; i--) {
			heap1(data, data.length, i);
		}

		int n = data.length;
		while (n > 0) {
			System.out.print(data[0] + " ");
			data[0] = data[n - 1];
			n--;
			heap1(data, n, 0);
		}
	}

	public static void heap1(int data[], int n, int k) {
		int left = 2 * k + 1, right = 2 * k + 2;
		if (left > n && right > k) {
			return;
		}
		int l_d = Integer.MAX_VALUE, r_d = Integer.MAX_VALUE;
		if (left < n) {
			l_d = data[left];
		}
		if (right < n) {
			r_d = data[right];
		}
		if (r_d >= data[k] && l_d >= data[k]) {
			return;
		}
		if (l_d < r_d) {
			int temp = data[k];
			data[k] = data[left];
			data[left] = temp;
			heap1(data, n, left);
		} else {
			int temp = data[k];
			data[k] = data[right];
			data[right] = temp;
			heap1(data, n, right);
		}
	}

	// ʵ�ֶ�
	private static void buildMaxHeapify(int[] data) {
		// û���ӽڵ�Ĳ���Ҫ�������ѣ������һ���ĸ��ڵ㿪ʼ
		int startIndex = getParentIndex(data.length - 1);
		// ��β�˿�ʼ�������ѣ�ÿ�ζ�����ȷ�Ķ�
		for (int i = startIndex; i >= 0; i--) {
			maxHeapify(data, data.length, i);
		}
	}

	/**
	 * ��������
	 *
	 * @paramdata
	 * @paramheapSize��Ҫ�������ѵĴ�С��һ����sort��ʱ���õ�����Ϊ���ֵ����ĩβ��ĩβ�Ͳ��ٹ���������
	 * @paramindex��ǰ��Ҫ�������ѵ�λ��
	 */
	private static void maxHeapify(int[] data, int heapSize, int index) {
		// ��ǰ���������ӽڵ�Ƚ�
		int left = getChildLeftIndex(index);
		int right = getChildRightIndex(index);

		int largest = index;
		if (left < heapSize && data[index] < data[left]) {
			largest = left;
		}
		if (right < heapSize && data[largest] < data[right]) {
			largest = right;
		}
		// �õ����ֵ�������Ҫ��������������ˣ����ӽڵ���ܾͲ��������ˣ���Ҫ���µ���
		if (largest != index) {
			int temp = data[index];
			data[index] = data[largest];
			data[largest] = temp;
			maxHeapify(data, heapSize, largest);
		}
	}

	/**
	 * �������ֵ����ĩβ��data��Ȼ�����ѣ��������ͳ��˵�����
	 *
	 * @paramdata
	 */
	private static void heapSort(int[] data) {
		// ĩβ��ͷ�������������������
		for (int i = data.length - 1; i > 0; i--) {
			int temp = data[0];
			data[0] = data[i];
			data[i] = temp;
			maxHeapify(data, i, 0);
		}
	}

	/**
	 * ���ڵ�λ��
	 *
	 * @paramcurrent
	 * @return
	 */
	private static int getParentIndex(int current) {
		return (current - 1) >> 1;
	}

	/**
	 * ���ӽڵ�positionע�����ţ��ӷ����ȼ�����
	 *
	 * @paramcurrent
	 * @return
	 */
	private static int getChildLeftIndex(int current) {
		return (current << 1) + 1;
	}

	/**
	 * ���ӽڵ�position
	 *
	 * @paramcurrent
	 * @return
	 */
	private static int getChildRightIndex(int current) {
		return (current << 1) + 2;
	}

	private static void print(int[] data) {
		int pre = -2;
		for (int i = 0; i < data.length; i++) {
			if (pre < (int) getLog(i + 1)) {
				pre = (int) getLog(i + 1);
				System.out.println();
			}
			System.out.print(data[i] + "|");
		}
		System.out.println();
	}

	/**
	 * ��2Ϊ�׵Ķ���
	 *
	 * @paramparam
	 * @return
	 */
	private static double getLog(double param) {
		return Math.log(param) / Math.log(2);
	}

}
