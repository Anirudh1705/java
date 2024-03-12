/*import java.util.Arrays;
public class LeftRotation {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int d = array.length-1;
        System.out.println("Original Array: " + Arrays.toString(array));
        leftRotate(array, d);
        System.out.println("Array after " + d + " left rotations: " + Arrays.toString(array));
    }
    static void leftRotate(int[] array, int d) {
        int n = array.length;
        reverseArray(array, 0, d - 1);
        reverseArray(array, d, n - 1);
        reverseArray(array, 0, n - 1);
    }
    static void reverseArray(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}*/
import java.util.Arrays;
public class LeftRotation {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int rotations = array.length-1;
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < rotations; i++) {
            leftRotateByOne(array);
            System.out.println(Arrays.toString(array));
        }
    }
    static void leftRotateByOne(int[] array) {
        int temp = array[0];
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            array[i] = array[i + 1];
        }
        array[n - 1] = temp;
    }
}