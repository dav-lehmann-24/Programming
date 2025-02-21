public class QuickSort {
    private static int partition(int[] arr, int low, int high) {
        // Choose last element as pivot
        int pivot = arr[high];
        int i = (low - 1);
        
        // Go through all elements and place elements which are less than the pivot on the left side
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Change elements
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        // Place the pivot on his final position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        
        return i + 1;
    }
    
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Execute partition and find final position of the pivot
            int pi = partition(arr, low, high);
            
            // Sort the left and right part recursively
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    
    public static void main(String[] args) {
        int[] numbers = {21, 9, 87, 45, 12, 1, 5, 79, 102, 34, 29};
        int n = numbers.length;
        
        System.out.println("Original array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        
        quickSort(numbers, 0, n - 1);
        
        System.out.println("\nSorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
    }
}