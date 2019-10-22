
public class MergeSortDemo {

	public void mergeSortRecursive(Integer[] gArray) {
		if (gArray == null)
			return;

		Integer[] fArray = new Integer[gArray.length];
		for (int i = 0; i < fArray.length; i++)
			fArray[i] = gArray[i];

		mergeRecursive(fArray, 0, gArray.length, gArray);
		for (int i = 0; i < fArray.length; i++)
			gArray[i] = fArray[i];
	}

	private void mergeRecursive(Integer[] fArray, int low, int high, Integer[] destArray) {
		// TODO Auto-generated method stub
		if (high - low < 2)
			return;
		int mid1 = low + ((high - low) / 3);
		int mid2 = low + 2 * ((high - low) / 3) + 1;

		mergeRecursive(destArray, low, mid1, fArray);
		mergeRecursive(destArray, mid1, mid2, fArray);
		mergeRecursive(destArray, mid2, high, fArray);
		mergeR(destArray, low, mid1, mid2, high, fArray);

	}

	private void mergeR(Integer[] fArray, int low, int mid1, int mid2, int high, Integer[] destArray) {
		// TODO Auto-generated method stub
		int i = low, j = mid1, k = mid2, l = low;
		while ((i < mid1) && (j < mid2) && (k < high)) {
			if (fArray[i].compareTo(fArray[j]) < 0) {
				if (fArray[i].compareTo(fArray[k]) < 0) {
					destArray[l++] = fArray[i++];
				} else {
					destArray[l++] = fArray[k++];
				}
			} else {
				if (fArray[j].compareTo(fArray[k]) < 0) {
					destArray[l++] = fArray[j++];
				} else {
					destArray[l++] = fArray[k++];
				}
			}
		}

		while ((i < mid1) && (j < mid2)) {
			if (fArray[i].compareTo(fArray[j]) < 0) {
				destArray[l++] = fArray[i++];
			} else {
				destArray[l++] = fArray[j++];
			}
		}

		while ((j < mid2) && (k < high)) {
			if (fArray[j].compareTo(fArray[k]) < 0) {
				destArray[l++] = fArray[j++];
			} else {
				destArray[l++] = fArray[k++];
			}
		}

		while (i < mid1 && k < high) {
			if (fArray[i].compareTo(fArray[k]) < 0) {
				destArray[l++] = fArray[i++];
			} else {
				destArray[l++] = fArray[k++];
			}
		}

		while (i < mid1) {
			destArray[l++] = fArray[i++];
		}
		while (j < mid2) {
			destArray[l++] = fArray[j++];
		}

		while (k < high) {
			destArray[l++] = fArray[k++];
		}


	}

	public void sort(int[] array, int l, int r) {
		if (l < r) {
			int m = (l + r) / 2;
			sort(array, l, m);
			sort(array, m + 1, r);
			merge(array, l, m, r);
		}
	}

	private void merge(int[] array, int l, int m, int r) {
		// TODO Auto-generated method stub
		int n1 = m - l + 1;
		int n2 = r - m;

		int L[] = new int[n1];
		int R[] = new int[n2];

		for (int i = 0; i < n1; ++i) {
			L[i] = array[l + i];
		}

		for (int j = 0; j < n2; ++j) {
			R[j] = array[m + 1 + j];
		}

		int i = 0, j = 0, k = l;

		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				array[k] = L[i];
				i++;
			} else {
				array[k] = R[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			array[k] = L[i];
			i++;
			k++;
		}
		while (j < n2) {
			array[k] = R[j];
			j++;
			k++;
		}
	}
}
