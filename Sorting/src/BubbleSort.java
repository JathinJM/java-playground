
public class BubbleSort {

	public void sort(int[] array) {
		int[] a = array;
		for (int i = 0; i < a.length - 1; i++) {
			boolean swap = false;
			System.out.println();
			for (int j = 0; j < a.length - i - 1; j++) {
				this.swap(a, j);
				swap = true;
			}

			if (swap == false) {
				break;
			}

		}
	}

	public void recursiveSort(int[] array, int n) {
		if (n == 1) {
			return;
		}

		int[] a = array;
		for (int j = 0; j < a.length - 1; j++) {
			this.swap(a, j);
		}
		recursiveSort(a, n - 1);

	}

	public int[] swap(int[] a, int i) {
		if (a[i] > a[i + 1]) {
			int temp = a[i];
			a[i] = a[i + 1];
			a[i + 1] = temp;
		}
		return a;
	}
}
