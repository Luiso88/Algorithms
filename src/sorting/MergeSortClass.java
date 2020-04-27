package sorting;

public class MergeSortClass {
	//testing
	public void mergeSort(int[] a, int length) {
		if (length < 2) {
			return;
		}

		int middle = length / 2;
		int[] l = new int[middle];
		int[] r = new int[length - middle];

		for (int i = 0; i < middle; i++) {
			l[i] = a[i];
		}
		for (int i = middle; i < length; i++) {
			r[i - middle] = a[i];
		}
		mergeSort(l, middle);
		mergeSort(r, length - middle);

		merge(a, l, r, middle, length - middle);
	}

	public void merge(int[] a, int[] l, int[] r, int left, int right) {

		int i = 0, j = 0, k = 0;
		while (i < left && j < right) {
			if (l[i] <= r[j]) {
				a[k++] = l[i++];
			} else {
				a[k++] = r[j++];
			}
		}
		while (i < left) {
			a[k++] = l[i++];
		}
		while (j < right) {
			a[k++] = r[j++];
		}
	}
}
