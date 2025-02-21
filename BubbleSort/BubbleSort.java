public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        
        // Outer loop continues until the second-last element
        for (int i = 0; i < n - 1; i++) {
            // Inner loop compares nearby elements
            for (int j = 0; j < n - i - 1; j++) {
                // If the element on the left is bigger than the element on the right,
                // then they will be changed
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {21, 9, 87, 45, 12, 1, 5, 79, 102, 34, 29};

        System.out.println("Original array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }

        bubbleSort(numbers);

        System.out.println("\nSorted array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
    }
}