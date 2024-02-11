public class Merge_Sort {
    public static void main(String[] args) {
        int[] array = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Original Array:");
        printArray(array);
        mergeSort(array);
        System.out.println("\nSorted Array:");
        printArray(array);
    }
    static void mergeSort(int[] array) {
        int n = array.length;
        int[] tempArray = new int[n];
        mergeSortHelper(array, tempArray, 0, n - 1);
    }
    static void mergeSortHelper(int[] array, int[] tempArray, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSortHelper(array, tempArray, left, middle);
            mergeSortHelper(array, tempArray, middle + 1, right);
            merge(array, tempArray, left, middle, right);
        }
    }
    static void merge(int[] array, int[] tempArray, int left, int middle, int right) {
        System.arraycopy(array, left, tempArray, left, right - left + 1);
        int i = left;
        int j = middle + 1;
        int k = left;
        while (i <= middle && j <= right) {
            if (tempArray[i] <= tempArray[j]) {
                array[k++] = tempArray[i++];
            } else {
                array[k++] = tempArray[j++];
            }
        }
        while (i <= middle) {
            array[k++] = tempArray[i++];
        }
    }
    static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
