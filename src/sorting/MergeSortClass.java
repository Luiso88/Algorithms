package sorting;

public class MergeSortClass {
	//testing
	public void mergeSort(int[] a, int lenght) {
		if (lenght < 2) {
			return;
		}

		int middle = lenght / 2;
		int[] l = new int[middle];
		int[] r = new int[lenght - middle];

		for (int i = 0; i < middle; i++) {
			l[i] = a[i];
		}
		for (int i = middle; i < lenght; i++) {
			r[i - middle] = a[i];
		}
		mergeSort(l, middle);
		mergeSort(r, lenght - middle);

		merge(a, l, r, middle, lenght - middle);
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
