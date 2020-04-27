package sorting;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("BinarySearch Algorithm");
		int m[] = { 34, 65, 23, 100, 24, 54, 13, 58, 25, 17 };// {sorted: 13,17,23,24,25,34,54,58,65,100}


//----------------------------------MERGESORT ALGORITHM-----------------------------------------------
		System.out.println();
		System.out.println("Mergesort Algorithm");
		MergeSortClass ms = new MergeSortClass();
		m = new int[] { 1, 107, 2, 24, 3, 11, 28, 5 };
		System.out.println("Values of array not sorted: " + Arrays.toString(m));
		ms.mergeSort(m, m.length);
		System.out.println("Values of array sorted: " + Arrays.toString(m));

	}

}
