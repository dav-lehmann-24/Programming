import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int[] array = {10, 21, 15, 17, 39, 61, 43};
        System.out.println("Original Array: " + Arrays.toString(array));

        array = mergeSort(array);

        System.out.println("Sorted Array: " + Arrays.toString(array));
    }

    public static int[] mergeSort(int[] array) {
        if (array.length < 2) {
            return array;
        }

        int midpoint = array.length / 2;
        System.out.println("Midpoint: " + midpoint);

        int[] left = Arrays.copyOfRange(array, 0, midpoint);
        int[] right = Arrays.copyOfRange(array, midpoint, array.length);

        return merge(mergeSort(left), mergeSort(right));
    }

    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            }
            else {
                result[k++] = right[j++];
            }
        }

        while (i < left.length) {
            result[k++] = left[i++];
        }

        while (j < right.length) {
            result[k++] = right[j++];
        }

        return result;
    }
}