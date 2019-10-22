
public class Main {
	public static void main(String[] args) {
		BubbleSort bubbleSort = new BubbleSort();
		SelectionSort selectionSort = new SelectionSort();
		InsertionSort insertionSort = new InsertionSort();
		MergeSortDemo mergeSort = new MergeSortDemo();
		QuickSort quickSort  = new QuickSort();
		HeapSort heapSort = new HeapSort();
		
		int a[] = new int[] { 30, 24, 3, 34, 25 };
		Integer b[] = new Integer[] { 30, 24, 3, 34, 25 };

		for (int i : a) {
			System.out.println(i);
		}

		/*
		 * for (int i : b) { System.out.println(i); }
		 */
		// bubbleSort.sort(a);
		// selectionSort.sort(a);
		// bubbleSort.recursiveSort(a, a.length);
		// selectionSort.recursiveSort(a, a.length,0);
		// insertionSort.sort(a);
		// insertionSort.recursiveSort(a, a.length);
		// mergeSort.sort(a,0,a.length-1);
		// mergeSort.mergeSortRecursive(b);
		// quickSort.sort(a,0,a.length-1);
		heapSort.sort(a);
		System.out.println("===");

		for (int i : a) {
			System.out.println(i);
		}
		/*
		 * for (int i : b) { System.out.println(i); }
		 */
	}
}
