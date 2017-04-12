package ����鲢;

import java.util.Arrays;

public class Main {
	public static int[] sort(int[] nums, int low, int high) {
		int mid = (low + high) / 2;
		if (low < high) {
			// ���
			sort(nums, low, mid);
			// �ұ�
			sort(nums, mid + 1, high);
			// ���ҹ鲢
			merge(nums, low, mid, high);
		}
		return nums;
	}

	public static void merge(int[] nums, int low, int mid, int high) {
		int[] temp = new int[high - low + 1];
		int i = low;// ��ָ��
		int j = mid + 1;// ��ָ��
		int k = 0;

		// �ѽ�С�������Ƶ���������
		while (i <= mid && j <= high) {
			if (nums[i] < nums[j]) {
				temp[k++] = nums[i++];
			} else {
				temp[k++] = nums[j++];
			}
		}

		// �����ʣ�������������
		while (i <= mid) {
			temp[k++] = nums[i++];
		}

		// ���ұ߱�ʣ�������������
		while (j <= high) {
			temp[k++] = nums[j++];
		}

		// ���������е�������nums����
		for (int k2 = 0; k2 < temp.length; k2++) {
			nums[k2 + low] = temp[k2];
		}
	}

	// �鲢�����ʵ��
	public static void main(String[] args) {
		int[] nums = { 2, 7, 8, 3, 1, 6, 9, 0, 5, 4 };
		sort(nums, 0, nums.length - 1);
		System.out.println(Arrays.toString(nums));
	}

}
