
public class InsertionSort {
	public void sort(int[] array) {
		int[] a = array;
		for (int i = 1; i < a.length; i++) {
			int key = a[i];
			int j = i - 1;
			while (j >= 0 && a[j] > key) {
            a[j+1] = a[j];
            j = j-1;
			}
         a[j+1] = key;
		}
	}
	
	public void recursiveSort(int[] array, int n) {
		int[] a = array;
		if(n<=1) {
			return;
		}
		recursiveSort(a, n-1);
		int last = a[n-1];
		int j = n-2;
		while (j >= 0 && a[j] > last) {
            a[j+1] = a[j];
            j--;
			}
		a[j+1] = last;
	}
}
