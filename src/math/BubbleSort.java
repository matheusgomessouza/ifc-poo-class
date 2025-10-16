package math;

public final class BubbleSort {
    public static void bubbleSort(IntegerNumber[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        int n = arr.length;
        if (n < 2) return;
        boolean swap;
        for (int i = 0; i < n - 1; i++) {
            swap = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] == null || arr[j + 1] == null) {
                    throw new IllegalArgumentException("Elements can't be null");
                }
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    IntegerNumber tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    swap = true;
                }
            }
            if (!swap) break;
        }
    }
}
