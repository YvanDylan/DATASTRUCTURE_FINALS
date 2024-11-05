public class quickSort {

    // Partition method to rearrange elements around the pivot
    static int partition(int[] array, int low, int high) {
        int pivot = array[high];  // The pivot element is chosen to be the last element
        int smallerElementIndex = low - 1;  // Index of the smaller element

        // Traverse the array and compare elements with the pivot
        for (int currentIndex = low; currentIndex <= high - 1; currentIndex++) {
            if (array[currentIndex] < pivot) {
                smallerElementIndex++;
                swap(array, smallerElementIndex, currentIndex);  // Swap if element is smaller than pivot
            }
        }
        
        swap(array, smallerElementIndex + 1, high);  // Place pivot at the correct position
        return smallerElementIndex + 1;  // Return pivot index
    }

    // Swap two elements in the array
    static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    // Main QuickSort method
    static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);  // Get the pivot index

            // Recursively sort the two subarrays
            quickSort(array, low, pivotIndex - 1);  // Sort left subarray
            quickSort(array, pivotIndex + 1, high);  // Sort right subarray
        }
    }

    // Method to print the array
    public static void printArray(int[] array) {
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = {10, 7, 8, 9, 1, 5};  // Unsorted array
        int length = numbers.length;  // Get the length of the array

        // Perform QuickSort
        quickSort(numbers, 0, length - 1);

        // Print the sorted array
        printArray(numbers);
    }
}
