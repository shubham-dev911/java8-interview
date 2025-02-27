package com.streamApi;

public class QuickSort {

	public static void main(String[] args) {

		int a[] = { 16, 34, 17, 8, 12, 7, 9, 19 };

		int length = a.length;

		QuickSort q = new QuickSort();
		q.quickSortRecurssion(a, 0, length - 1);
		q.printArray(a);
	}

	int partition(int[] a, int low, int high) {
		int pivot = a[(low + high) / 2];

		while (low <= high) {
			while (a[low] < pivot) {
				low++;
			}
			while (a[high] > pivot) {
				high--;
			}

			if (low <= high) {
				int temp = a[low];
				a[low] = a[high];
				a[high] = temp;

				low++;
				high--;
			}

		}
		return low;
	}

	void quickSortRecurssion(int a[], int low, int high) {

		int pi = partition(a, low, high);

		if (low < pi - 1) {
			quickSortRecurssion(a, low, pi - 1);
		}
		if (pi < high) {
			quickSortRecurssion(a, pi, high);
		}
	}

	void printArray(int[] a) {
		for (int i : a) {
			System.out.println(i);
		}
	}

}