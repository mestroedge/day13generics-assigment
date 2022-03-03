package generics;

public class Uc4 {

class ExtendedMax<T extends Comparable<T>> {
	T arr[];

	public ExtendedMax(T[] o) {
		arr = o;
	}

	public T max() {
		T max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i].compareTo(max) > 0) {
				max = arr[i];
			}
		}
		return max;
	}
}

}
