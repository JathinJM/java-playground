
public class SelectionSort {
	public void sort(int[] array) {
		int minIndex;
		for (int i = 0; i < array.length - 1; i++) {
			minIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[minIndex]) {
					minIndex = j;
				}
			}
			this.swap(array, minIndex, i);
		}
	}

	public int[] swap(int[] a, int minIndex, int i) {
		int temp = a[minIndex];
		a[minIndex] = a[i];
		a[i] = temp;
		return a;
	}
	
	public void recursiveSort(int[] array, int n, int index) {
		if(index==n) {
			return;
		}
		int k = minIndex(array, index, n-1);
		if(k!=index) {
			swap(array,k,index);
		}
		
	}
	
	public int minIndex(int[] array, int i, int j) {
		if(i==j)
		return i;
		int k = minIndex(array,i+1, j);
		return ((array[i]<array[k])? i : k);
	
	}
	
}
